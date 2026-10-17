package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.ff0;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class pd0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31922b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31923c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd0 f31924a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pd0(nd0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f31924a = flowConfig;
    }

    public final fe1 a(od0 flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return flowCoordinator;
    }

    public final wd1 b(md0 flowActionProvider, ry dataWorkManager, he0 uploadDataRequestsBuilder, ie0 whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final md0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new md0(s70.a(mainRepository));
    }

    public final af0 b(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new af0();
    }

    public final ie0 a(Function0 skipPersonFlowUseCase, lz delegate) {
        Intrinsics.checkNotNullParameter(skipPersonFlowUseCase, "skipPersonFlowUseCase");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new ie0(delegate, skipPersonFlowUseCase, this.f31924a.getMinimumAge());
    }

    public final he0 a(Function0 workflowIdProvider, gj documentFlowDataBundle, yj0 personBundle, m81 tinBundle, vc1 skipNationalityUseCase, vc1 skipPersonDetailsUseCase, vc1 tinBundleIsValidUseCase) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(skipNationalityUseCase, "skipNationalityUseCase");
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        Intrinsics.checkNotNullParameter(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new he0(workflowIdProvider, documentFlowDataBundle, personBundle, tinBundle, skipNationalityUseCase, skipPersonDetailsUseCase, tinBundleIsValidUseCase);
    }

    public final j20 a(se0 repository, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        if (this.f31924a.getDocumentStrategy().a(wk.f34723a.a())) {
            return new xe0(repository, imageServiceLocator, new ze0(new ye0(lottieServiceLocator)));
        }
        return new ve0(repository, lottieServiceLocator.a(k70.u), imageServiceLocator);
    }

    public final aq0 a(r70 mainRepository, gj documentFlowDataBundle, wr effectHandler, bq0 popupHandlerBuilder, fh0 orcaDestroyer, o80 navigationChannel, l70 lottieServiceLocator, v10 imageServiceLocator, ke0 analytics) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        gq0[] gq0VarArr = (gq0[]) zhm.d0.F0(new re0(imageServiceLocator, analytics, new br1(documentFlowDataBundle, 0)), zhm.d0.F0(new uf0(effectHandler, lottieServiceLocator), ha.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator))).toArray(new gq0[0]);
        return popupHandlerBuilder.a((gq0[]) Arrays.copyOf(gq0VarArr, gq0VarArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(gj gjVar) {
        return ij.b(gjVar).c() == DocumentType.PASSPORT;
    }

    public final wr a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new wr(coroutineScope);
    }

    public final we0 a(j20 stateProvider, se0 repository, wr effectHandler, ke0 analytics, od0 flowCoordinator, lj0 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new we0(new f80(stateProvider), effectHandler, stateProvider, popupHandler, repository, viewCompletionHandler, analytics, flowCoordinator, coroutineScope);
    }

    public final lj0 a(md0 flowActionProvider, ry dataWorkManager, he0 uploadDataRequestsBuilder, ie0 whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final ke0 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new ke0(tracker);
    }

    public final se0 a(gj bundle, Context context) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(context, "context");
        return new te0(context, bundle, !this.f31924a.getDocumentStrategy().a(wk.f34723a.b()), this.f31924a.getNfc().getDeviceAntennaSettings());
    }

    public final qf0 a(mf0 nfcScannerVideos, fe1 viewNavigator, hf0 repository, wd1 viewCompletionHandler, af0 analytics, bq0 popupHandlerBuilder, CoroutineScope coroutineScope, l70 lottieServiceLocator, v10 imageServiceLocator) {
        lf0 sf0Var;
        id0 bfVar;
        Intrinsics.checkNotNullParameter(nfcScannerVideos, "nfcScannerVideos");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        iz izVarB = this.f31924a.getDocumentStrategy();
        wk wkVar = wk.f34723a;
        int i = 0;
        if (izVarB.a(wkVar.a())) {
            sf0Var = new rf0(repository, lottieServiceLocator.a(k70.f30152g), new ye0(lottieServiceLocator), imageServiceLocator);
        } else {
            sf0Var = new sf0(new cr1(nfcScannerVideos, repository, i), lottieServiceLocator.a(k70.f30152g), imageServiceLocator);
        }
        if (this.f31924a.getDocumentStrategy().a(wkVar.b())) {
            bfVar = new iz0(repository, jd0.a(this.f31924a.getDocumentStrategy()));
        } else {
            bfVar = new bf();
        }
        id0 id0Var = bfVar;
        return new qf0(new f80(sf0Var), new wr(coroutineScope), sf0Var, viewNavigator, viewCompletionHandler, repository, popupHandlerBuilder.a(new dd0(imageServiceLocator, id0Var), new vf0(imageServiceLocator, id0Var), new xf0(imageServiceLocator, id0Var, null, null, 12, null)), analytics, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0.a.InterfaceC0196a a(mf0 mf0Var, hf0 hf0Var) {
        return (ff0.a.InterfaceC0196a) mf0Var.invoke(hf0Var.b());
    }

    public final hf0 a(gj bundle, yj0 personBundle, cd0 nfcCapabilityResultToBundleMapper) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(nfcCapabilityResultToBundleMapper, "nfcCapabilityResultToBundleMapper");
        return new if0(bundle, personBundle, nfcCapabilityResultToBundleMapper, new sy0(), this.f31924a.getUseNfcX());
    }

    public final od0 a(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        return new od0(navigationChannel);
    }
}
