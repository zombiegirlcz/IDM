package kl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import com.onfido.hosted.web.module.model.StudioModuleInfo;
import com.onfido.workflow.internal.ui.HostedWebModuleScreen;
import com.onfido.workflow.internal.ui.NfcNotSupportedScreen;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m0 implements igm.o, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f185197b;

    public /* synthetic */ m0(c2 c2Var, int i) {
        this.f185196a = i;
        this.f185197b = c2Var;
    }

    @Override // igm.g
    public void accept(Object obj2) {
        nl.a1 p0 = (nl.a1) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c2 c2Var = this.f185197b;
        PublishSubject publishSubject = c2Var.D;
        if (Intrinsics.f(p0, nl.z0.f216972c)) {
            c2Var.c().onNext(ml.a.f206513a);
        } else if (Intrinsics.f(p0, nl.z0.f216971b)) {
            publishSubject.onNext(new ml.k(ml.j.USER_EXIT_FLOW));
        } else if (Intrinsics.f(p0, nl.z0.f216970a)) {
            publishSubject.onNext(ml.h.f206526a);
        }
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        Observable observableD;
        switch (this.f185196a) {
            case 0:
                sl.n documentTask = (sl.n) obj2;
                Intrinsics.checkNotNullParameter(documentTask, "task");
                c2 c2Var = this.f185197b;
                nl.u uVar = c2Var.f185155s;
                Observable uiEventObservable = c2Var.C.hide();
                Intrinsics.checkNotNullExpressionValue(uiEventObservable, "hide(...)");
                uVar.getClass();
                Intrinsics.checkNotNullParameter(documentTask, "documentTask");
                Intrinsics.checkNotNullParameter(uiEventObservable, "uiEventObservable");
                if (Intrinsics.f(documentTask.f264052c, NFCOptions.Enabled.Required.INSTANCE) && !uVar.e.isNfcSupported()) {
                    uVar.f216951a.navigateTo(NfcNotSupportedScreen.f50195a);
                    Observable observableCast = uiEventObservable.filter(nl.b.f216879l).cast(ml.g0.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                    Observable map = observableCast.map(nl.b.f216880m);
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                ogm.e eVar = new ogm.e(new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(uVar, documentTask, 5), 2);
                LinkedHashMap linkedHashMap = documentTask.d;
                Pair pairA = nl.u.a(documentTask);
                CountryCode countryCode = documentTask.e;
                if (pairA != null) {
                    observableD = Observable.just(new ml.v((DocumentType) pairA.f186386b, (CountryCode) pairA.f186385a));
                    Intrinsics.checkNotNullExpressionValue(observableD, "just(...)");
                } else if (linkedHashMap.size() == 1 && ((List) zhm.d0.a0(linkedHashMap.values())).size() == 1) {
                    observableD = Observable.just(new ml.v((DocumentType) zhm.d0.b0((List) zhm.d0.a0(linkedHashMap.values())), (CountryCode) zhm.d0.a0(linkedHashMap.keySet())));
                    Intrinsics.checkNotNullExpressionValue(observableD, "just(...)");
                } else {
                    if (linkedHashMap.keySet().size() == 1) {
                        countryCode = (CountryCode) zhm.d0.a0(linkedHashMap.keySet());
                    } else if (countryCode == null || !linkedHashMap.containsKey(countryCode)) {
                        countryCode = null;
                    }
                    ogm.e eVar2 = new ogm.e(new nl.f(1, countryCode, uVar, documentTask), 2);
                    Observable observableCast2 = uiEventObservable.filter(nl.b.f216878j).cast(ml.v.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
                    observableD = eVar2.d(observableCast2);
                    Intrinsics.checkNotNullExpressionValue(observableD, "andThen(...)");
                }
                Observable observableSwitchMap = eVar.d(observableD).switchMap(new jpc.e(uVar, 11, uiEventObservable, documentTask));
                nl.p pVar = uVar.f216953c;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(documentTask, "documentTask");
                Intrinsics.checkNotNullParameter(uiEventObservable, "uiEventObservable");
                Observable observableOnErrorResumeNext = nl.p.a(uiEventObservable, DocSide.FRONT).switchMap(new nl.i(documentTask, pVar, uiEventObservable)).onErrorResumeNext(nl.b.d);
                Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
                Observable observableRetry = observableSwitchMap.mergeWith(observableOnErrorResumeNext).retry(nl.b.k);
                Intrinsics.checkNotNullExpressionValue(observableRetry, "retry(...)");
                return observableRetry;
            default:
                final sl.m task = (sl.m) obj2;
                Intrinsics.checkNotNullParameter(task, "task");
                c2 c2Var2 = this.f185197b;
                final nl.v0 v0Var = c2Var2.v;
                final String workflowRunId = c2Var2.z.getF50174b();
                Observable uiEventObservable2 = c2Var2.C.hide();
                Intrinsics.checkNotNullExpressionValue(uiEventObservable2, "hide(...)");
                final String str = c2Var2.H;
                v0Var.getClass();
                Intrinsics.checkNotNullParameter(workflowRunId, "workflowRunId");
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(uiEventObservable2, "uiEventObservable");
                ogm.e eVar3 = new ogm.e(new igm.a() { // from class: nl.r0
                    @Override // igm.a
                    public final void run() {
                        sl.m captureSdkModuleTask = task;
                        Intrinsics.checkNotNullParameter(captureSdkModuleTask, "$captureSdkModuleTask");
                        String workflowRunId2 = workflowRunId;
                        Intrinsics.checkNotNullParameter(workflowRunId2, "$workflowRunId");
                        v0 this$0 = v0Var;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f216956a.navigateTo(new HostedWebModuleScreen(new HostedWebModuleModuleInfo(captureSdkModuleTask.f264049c, captureSdkModuleTask.d, new StudioModuleInfo(workflowRunId2, captureSdkModuleTask.f264047a, captureSdkModuleTask.f264048b), null, 8, null), this$0.f216958c.isDarkModeEnabled(), str));
                    }
                }, 2);
                Observable observableCast3 = uiEventObservable2.filter(nl.p0.f216935c).cast(ml.d0.class);
                Intrinsics.checkNotNullExpressionValue(observableCast3, "cast(...)");
                nl.u0 function = nl.u0.f;
                Intrinsics.checkNotNullParameter(function, "function");
                mgm.b bVarD = eVar3.d(observableCast3.map(new nl.p0(8)));
                Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
                Observable observableSwitchMap2 = bVarD.switchMap(new jx0.a(v0Var, task, 15));
                Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
                return observableSwitchMap2;
        }
    }
}
