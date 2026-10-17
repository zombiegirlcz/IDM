package mz3;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.CreditCardOfferPluginFactory$CreditCardOfferPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw3.f f210598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw3.d f210599b;

    public f0(vw3.f creditCardOfferPrefetcher, vw3.d creditCardOfferInteractor) {
        Intrinsics.checkNotNullParameter(creditCardOfferPrefetcher, "creditCardOfferPrefetcher");
        Intrinsics.checkNotNullParameter(creditCardOfferInteractor, "creditCardOfferInteractor");
        this.f210598a = creditCardOfferPrefetcher;
        this.f210599b = creditCardOfferInteractor;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AnimatedBackgroundType h(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 2459034:
                    if (str.equals("PLUS")) {
                        return AnimatedBackgroundType.PLAN_PLUS.f51480a;
                    }
                    break;
                case 73249511:
                    if (str.equals("METAL")) {
                        return AnimatedBackgroundType.PLAN_METAL.f51479a;
                    }
                    break;
                case 80846732:
                    if (str.equals("ULTRA")) {
                        return AnimatedBackgroundType.PLAN_ULTRA.f51483a;
                    }
                    break;
                case 399530551:
                    if (str.equals("PREMIUM")) {
                        return AnimatedBackgroundType.PLAN_PREMIUM.f51481a;
                    }
                    break;
            }
        }
        return AnimatedBackgroundType.DEFAULT.f51471a;
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        os3.a state = (os3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        int i = c0.f210588a[state.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            int i2 = 2;
            ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new e0(this, payload, continuation, 1)), new s(new f(payload, i2), i2), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        if (i == 2) {
            rfm.f0 f0VarF = pd.b.n(skm.p0.f264003c, new e0(this, payload, continuation, 0)).f(new ufm.c(new i(payload, this), 2));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        throw new IllegalStateException("Unsupported plugin state: " + state);
    }

    @Override // oz3.a
    public final /* bridge */ /* synthetic */ Object e(ks3.c cVar, it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, j54.m0 m0Var) {
        return g((os3.a) cVar, dVar, r2Var, bVar, str, m0Var);
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        os3.a state = (os3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof CreditCardOfferPluginFactory$CreditCardOfferPluginLaunchInstructions) {
            return new CreditCardOfferFlow(new CreditCardOfferFlowContract$InputData(((CreditCardOfferPluginFactory$CreditCardOfferPluginLaunchInstructions) pluginLaunchInstructions).f66918a, io3.h.R(pluginPayload, "")));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(CreditCardOfferPluginFactory$CreditCardOfferPluginLaunchInstructions.class)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r6.f210598a.a(r7, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(os3.a r7, it3.d r8, grl.r2 r9, wi0.b r10, java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.f0.g(os3.a, it3.d, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }
}
