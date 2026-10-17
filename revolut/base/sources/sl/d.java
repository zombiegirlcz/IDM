package sl;

import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.api.client.token.sdk.model.InternalSDKTokenPayload;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.network.WorkflowApi;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowApi f264031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowConfig f264032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulersProvider f264033c;
    public final OnfidoTokenProvider d;

    public d(WorkflowApi workflowApi, WorkflowConfig workflowConfig, SchedulersProvider schedulersProvider, OnfidoTokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.f264031a = workflowApi;
        this.f264032b = workflowConfig;
        this.f264033c = schedulersProvider;
        this.d = tokenProvider;
    }

    public final Completable a(x task, ArrayList mediaUploads) {
        jl.k kVar;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(mediaUploads, "mediaUploads");
        InternalSDKTokenPayload internalSDKTokenPayloadA = this.d.provideToken().a();
        boolean zIsStudioToken = internalSDKTokenPayloadA != null ? internalSDKTokenPayloadA.isStudioToken() : false;
        WorkflowApi workflowApi = this.f264031a;
        if (zIsStudioToken) {
            String id10 = task.getId();
            ArrayList arrayList = new ArrayList();
            Iterator it8 = mediaUploads.iterator();
            while (it8.hasNext()) {
                ml.g gVar = (ml.g) it8.next();
                jl.w wVar = gVar.f206523a.length() > 0 ? new jl.w(gVar.f206523a) : null;
                if (wVar != null) {
                    arrayList.add(wVar);
                }
            }
            return b(workflowApi.completeDocumentCaptureTask(id10, new jl.x(arrayList)));
        }
        String workflowRunId = this.f264032b.getF50174b();
        String id11 = task.getId();
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = mediaUploads.iterator();
        while (it9.hasNext()) {
            ml.g gVar2 = (ml.g) it9.next();
            if (gVar2.f206523a.length() == 0) {
                kVar = null;
            } else {
                String str = gVar2.f206523a;
                ml.f fVar = gVar2.f206524b;
                int i = fVar == null ? -1 : b.f264027a[fVar.ordinal()];
                kVar = new jl.k(str, i != 1 ? i != 2 ? i != 3 ? null : "document_nfc" : "document_video" : "document_photo");
            }
            if (kVar != null) {
                arrayList2.add(kVar);
            }
        }
        return b(workflowApi.completeTask(workflowRunId, id11, new jl.l(arrayList2)));
    }

    public final Completable b(Completable completable) {
        c cVar = c.f264028b;
        completable.getClass();
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        Observable observableK = new ogm.m(completable, bVar, cVar, bVar2, bVar2).k();
        Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
        Completable completableIgnoreElements = RxExtensionsKt.retryWithExponentialBackOff$default(observableK, 2, 5, this.f264033c.getTimer(), null, 8, null).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }
}
