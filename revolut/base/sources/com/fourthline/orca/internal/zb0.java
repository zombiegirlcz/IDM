package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.ff0;
import com.fourthline.orca.internal.ld0;
import com.fourthline.orca.internal.wb0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xb0 f35558a;

    public zb0(xb0 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f35558a = flowConfig;
    }

    public final fe1 a(yb0 flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return flowCoordinator;
    }

    public final qo a() {
        iz izVarD = this.f35558a.d();
        boolean zH = this.f35558a.h();
        gl glVarE = this.f35558a.e();
        tr trVarK = this.f35558a.k();
        return new qo(izVarD, zH, this.f35558a.c(), glVarE, trVarK, this.f35558a.b(), this.f35558a.f(), this.f35558a.g(), this.f35558a.i(), this.f35558a.j());
    }

    public final n9 b(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new o9(bundle);
    }

    public final ke0 b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new ke0(tracker);
    }

    public final af0 b() {
        return new af0();
    }

    public final yc0 a(xc0 stateProvider, n9 resultRepository, qc0 analytics, yb0 flowCoordinator, CoroutineScope coroutineScope, qo documentScannerFlowConfig) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(documentScannerFlowConfig, "documentScannerFlowConfig");
        return new yc0(new f80(stateProvider), stateProvider, resultRepository, flowCoordinator, new t41(new wb0.a(documentScannerFlowConfig)), analytics, coroutineScope);
    }

    public final xc0 a(l9 repository, sg0 tracker, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new xc0(repository, imageServiceLocator, new p20(tracker), imageServiceLocator.a(r10.e));
    }

    public final qc0 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new qc0(tracker);
    }

    public final l9 a(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new m9(bundle);
    }

    public final j20 a(se0 repository, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        if (this.f35558a.d().a(wk.f34723a.a())) {
            return new xe0(repository, imageServiceLocator, new ze0(new ye0(lottieServiceLocator)));
        }
        return new ve0(repository, lottieServiceLocator.a(k70.u), imageServiceLocator);
    }

    public final we0 a(j20 stateProvider, se0 repository, ke0 analytics, yb0 flowCoordinator, CoroutineScope coroutineScope, bq0 popupHandlerBuilder, v10 imageServiceLocator, l70 lottieServiceLocator, qo documentScannerFlowConfig) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(documentScannerFlowConfig, "documentScannerFlowConfig");
        wr wrVar = new wr(coroutineScope);
        return new we0(new f80(stateProvider), wrVar, stateProvider, popupHandlerBuilder.a(new uf0(wrVar, lottieServiceLocator), new re0(imageServiceLocator, analytics, new ht1(repository, 14))), repository, new t41(new ld0.b(documentScannerFlowConfig)), analytics, flowCoordinator, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(se0 se0Var) {
        return se0Var.b() == DocumentType.PASSPORT;
    }

    public final se0 a(gj bundle, Context context) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(context, "context");
        return new te0(context, bundle, !this.f35558a.d().a(wk.f34723a.b()), this.f35558a.f().getDeviceAntennaSettings());
    }

    public final qf0 a(mf0 nfcScannerVideos, fe1 viewNavigator, hf0 repository, af0 analytics, bq0 popupHandlerBuilder, CoroutineScope coroutineScope, l70 lottieServiceLocator, v10 imageServiceLocator, qo documentScannerFlowConfig) {
        lf0 sf0Var;
        id0 bfVar;
        Intrinsics.checkNotNullParameter(nfcScannerVideos, "nfcScannerVideos");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(documentScannerFlowConfig, "documentScannerFlowConfig");
        iz izVarD = this.f35558a.d();
        wk wkVar = wk.f34723a;
        int i = 1;
        if (izVarD.a(wkVar.a())) {
            sf0Var = new rf0(repository, lottieServiceLocator.a(k70.f30152g), new ye0(lottieServiceLocator), imageServiceLocator);
        } else {
            sf0Var = new sf0(new cr1(nfcScannerVideos, repository, i), lottieServiceLocator.a(k70.f30152g), imageServiceLocator);
        }
        if (this.f35558a.d().a(wkVar.b())) {
            bfVar = new iz0(repository, jd0.a(this.f35558a.d()));
        } else {
            bfVar = new bf();
        }
        f80 f80Var = new f80(sf0Var);
        wr wrVar = new wr(coroutineScope);
        lf0 lf0Var = sf0Var;
        t41 t41Var = new t41(new ld0.b(documentScannerFlowConfig));
        dd0 dd0Var = new dd0(imageServiceLocator, bfVar);
        vf0 vf0Var = new vf0(imageServiceLocator, bfVar);
        c81.a aVar = c81.f27404a;
        return new qf0(f80Var, wrVar, lf0Var, viewNavigator, t41Var, repository, popupHandlerBuilder.a(dd0Var, vf0Var, new xf0(imageServiceLocator, bfVar, c81.a.a(aVar, R.string.shared_dialog_error_nfc_authentication_failed_title_can, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_error_shared_button_update_can, 0, 2, null))), analytics, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0.a.InterfaceC0196a a(mf0 mf0Var, hf0 hf0Var) {
        return (ff0.a.InterfaceC0196a) mf0Var.invoke(hf0Var.b());
    }

    public final hf0 a(gj bundle, yj0 personBundle, cd0 nfcCapabilityResultToBundleMapper) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(nfcCapabilityResultToBundleMapper, "nfcCapabilityResultToBundleMapper");
        return new if0(bundle, personBundle, nfcCapabilityResultToBundleMapper, new k9(), this.f35558a.j());
    }

    public final yb0 a(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        return new yb0(navigationChannel);
    }
}
