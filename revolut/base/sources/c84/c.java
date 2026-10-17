package c84;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sqd.h0;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f22076l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f22077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f22078n;

    public c(PluginFlowContract$Input inputData, xr3.y creditOnboardingLifecycleStorage) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditOnboardingLifecycleStorage, "creditOnboardingLifecycleStorage");
        this.f22077m = inputData;
        this.f22078n = creditOnboardingLifecycleStorage;
    }

    @Override // yji.n
    public void D2() {
        switch (this.f22076l) {
            case 2:
                j2 j2Var = ((l1b.g) ((h1b.b) this.f22077m)).f191522j;
                String str = (String) j2Var.getValue();
                j2Var.setValue(null);
                yji.n.j2(this, new go.g(str, 2), null, new s09.c(this, (Continuation) null, 28), 3);
                break;
            case 6:
                kbb.c cVar = (kbb.c) this.f22077m;
                yji.n.j2(this, rd0.e.b(cVar.L()), null, null, 7);
                yji.n.j2(this, rd0.e.b(cVar.I()), null, null, 7);
                break;
        }
    }

    @Override // yji.n
    public void F2() {
        switch (this.f22076l) {
            case 0:
                xr3.y yVar = (xr3.y) this.f22078n;
                String key = ((PluginFlowContract$Input) this.f22077m).getF67157b().f66894g.name();
                yVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                ne0.d dVar = yVar.f308246a;
                Iterable iterable = (List) dVar.get("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE");
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                dVar.f("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE", d0.A0(iterable, key));
                break;
        }
    }

    @Override // yji.n
    public void H2() {
        switch (this.f22076l) {
            case 0:
                xr3.y yVar = (xr3.y) this.f22078n;
                String key = ((PluginFlowContract$Input) this.f22077m).getF67157b().f66894g.name();
                yVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                ne0.d dVar = yVar.f308246a;
                Collection collection = (List) dVar.get("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE");
                if (collection == null) {
                    collection = f0.f322471a;
                }
                dVar.f("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE", d0.F0(key, collection));
                break;
            case 5:
                yji.n.l2(this, ((j78.g) ((s68.a) this.f22078n)).f171872c, null, new sy6.j(this, null, 21), 3);
                break;
            case 6:
                T2(new h0(this, null, 16), new yi5.b(27));
                break;
        }
    }

    public c(j60.a bottomExpandableDialogControllerExtension, spc.f dialogMapper) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f22077m = bottomExpandableDialogControllerExtension;
        this.f22078n = dialogMapper;
    }

    public c(rc8.k juniorAccountClosureModelExtension, s68.a juniorTerminationRequestActionsDelegate) {
        Intrinsics.checkNotNullParameter(juniorAccountClosureModelExtension, "juniorAccountClosureModelExtension");
        Intrinsics.checkNotNullParameter(juniorTerminationRequestActionsDelegate, "juniorTerminationRequestActionsDelegate");
        this.f22077m = juniorAccountClosureModelExtension;
        this.f22078n = juniorTerminationRequestActionsDelegate;
    }

    public c(kbb.c juniorConfigInteractor, wsg.b walletInteractor) {
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f22077m = juniorConfigInteractor;
        this.f22078n = walletInteractor;
    }

    public c(h1b.b appsFlyerDeeplinkObserver, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(appsFlyerDeeplinkObserver, "appsFlyerDeeplinkObserver");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f22077m = appsFlyerDeeplinkObserver;
        this.f22078n = deeplinkHandler;
    }

    public c(ybl.k tradingAccountsInteractor, TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        this.f22077m = tradingAccountsInteractor;
        this.f22078n = transferSubjectId;
    }

    public c(wsg.b walletInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f22077m = walletInteractor;
        this.f22078n = featureToggleInteractor;
    }
}
