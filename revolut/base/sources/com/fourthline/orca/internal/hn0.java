package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.gp0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final an0 f29341a;

    public static final class a implements co0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mp0 f29342a;

        public a(mp0 mp0Var) {
            this.f29342a = mp0Var;
        }

        @Override // com.fourthline.orca.internal.co0
        public gp0 a() {
            return np0.a(this.f29342a);
        }
    }

    public hn0(an0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f29341a = flowConfig;
    }

    public final an0 a() {
        return this.f29341a;
    }

    public final lp0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new lp0(s70.a(mainRepository));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mp0 b() {
        return new mp0(null, 1, 0 == true ? 1 : 0);
    }

    public final j30 c(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new j30("poa", tracker);
    }

    public final co0 a(mp0 dataBundle) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        return new a(dataBundle);
    }

    public final vo0 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new vo0(tracker);
    }

    public final do0 a(final gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        return new do0() { // from class: com.fourthline.orca.internal.nn1
            @Override // com.fourthline.orca.internal.do0
            public final void a(gp0 gp0Var) {
                hn0.a(documentFlowDataBundle, gp0Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(gj gjVar, gp0 file) {
        eh ehVar;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file instanceof gp0.a) {
            ehVar = new eh(null, ((gp0.a) file).a(), DocumentFileSide.FRONT, false, null, null, 57, null);
        } else if (file instanceof gp0.b) {
            ehVar = new eh(((gp0.b) file).a(), null, DocumentFileSide.FRONT, false, null, null, 58, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        yz0 yz0VarN = gjVar.n();
        List listA = gjVar.n().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listA) {
            if (((xz0) obj2).d() != DocumentType.PROOF_OF_ADDRESS) {
                arrayList.add(obj2);
            }
        }
        yz0VarN.a(zhm.d0.F0(new xz0(DocumentType.PROOF_OF_ADDRESS, null, null, zhm.u.c(ehVar), 6, null), arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(sj0 sj0Var) {
        return !sj0Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bn0 a(o80 navigationChannel, bq0 popupHandlerBuilder, sj0 permissionChecker, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(permissionChecker, "permissionChecker");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new bn0(navigationChannel, popupHandlerBuilder.a(new i9(lottieServiceLocator), new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)), new on1(permissionChecker, 0));
    }

    public final gn0 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new gn0(lottieServiceLocator.a(k70.f30164r));
    }

    public final e40 a(j30 analytics, bn0 flowCoordinator, gn0 stateProvider) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new e40(analytics, new f80(stateProvider), stateProvider, flowCoordinator, fn0.f28574a, null, null, 96, null);
    }

    public final fo0 a(Context context, mp0 dataBundle, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new fo0(new rj1(context, dataBundle, 23), lottieServiceLocator.a(k70.f30162p), imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap a(Context context, mp0 mp0Var) {
        return new hp0(context).a(np0.a(mp0Var));
    }

    public final go0 a(fo0 stateProvider, fm0 analytics, bn0 flowCoordinator, wd1 viewCompletionHandler, co0 repository, do0 resultRepository, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new go0(new f80(stateProvider), stateProvider, repository, resultRepository, analytics, flowCoordinator, viewCompletionHandler, popupHandler, coroutineScope);
    }

    public final en0 a(Function0 workflowIdProvider, gj dataBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        return new en0(workflowIdProvider, dataBundle);
    }

    public final wd1 a(lp0 flowActionProvider, en0 uploadRequestsBuilder, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(uploadRequestsBuilder, "uploadRequestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final fm0 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new fm0(tracker);
    }
}
