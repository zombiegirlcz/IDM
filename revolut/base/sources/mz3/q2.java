package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.OfferV2PluginFactory$OfferV2PluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2RootFlow;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q2 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rx3.a f210663a;

    public q2(rx3.a creditAnimatedIntroInteractor) {
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        this.f210663a = creditAnimatedIntroInteractor;
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        ys3.a state = (ys3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        return te0.w.o0(skm.p0.f264003c, new n2(this, state, payload, null));
    }

    @Override // oz3.a
    public final /* bridge */ /* synthetic */ Object e(ks3.c cVar, it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, j54.m0 m0Var) {
        return h((ys3.a) cVar, dVar, r2Var, bVar, str, m0Var);
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        OfferV2FlowContract$InputData.Config summary;
        ys3.a state = (ys3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof OfferV2PluginFactory$OfferV2PluginLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(OfferV2PluginFactory$OfferV2PluginLaunchInstructions.class)));
        }
        CreditApplicationKompotFeatureConfig.OfferV2.Config config = ((OfferV2PluginFactory$OfferV2PluginLaunchInstructions) pluginLaunchInstructions).f66930a;
        if (config instanceof CreditApplicationKompotFeatureConfig.OfferV2.Config.Intro) {
            hs3.m0 m0Var = ((CreditApplicationKompotFeatureConfig.OfferV2.Config.Intro) config).f66756a;
            summary = new OfferV2FlowContract$InputData.Config.Intro(m0Var.f154909a, m0Var.f154910b);
        } else if (config instanceof CreditApplicationKompotFeatureConfig.OfferV2.Config.Insurance) {
            summary = OfferV2FlowContract$InputData.Config.Insurance.f68091a;
        } else {
            if (!(config instanceof CreditApplicationKompotFeatureConfig.OfferV2.Config.Summary)) {
                throw new NoWhenBranchMatchedException();
            }
            hs3.k0 k0Var = ((CreditApplicationKompotFeatureConfig.OfferV2.Config.Summary) config).f66757a;
            summary = new OfferV2FlowContract$InputData.Config.Summary(k0Var.f154902b, k0Var.f154901a);
        }
        return new OfferV2RootFlow(new OfferV2FlowContract$InputData(summary, io3.h.R(pluginPayload, "")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(ys3.a r5, it3.d r6, gim.c r7) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.q2.g(ys3.a, it3.d, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ys3.a r5, it3.d r6, grl.r2 r7, wi0.b r8, java.lang.String r9, gim.c r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof mz3.p2
            if (r0 == 0) goto L13
            r0 = r10
            mz3.p2 r0 = (mz3.p2) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mz3.p2 r0 = new mz3.p2
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f210655y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r9 = r0.f210654x
            wi0.b r8 = r0.f210653w
            grl.r2 r7 = r0.v
            it3.d r6 = r0.u
            yhm.o.b(r10)
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r10)
            r0.u = r6
            r0.v = r7
            r0.f210653w = r8
            r0.f210654x = r9
            r0.A = r3
            java.io.Serializable r10 = r4.g(r5, r6, r0)
            if (r10 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$OfferV2$Config r10 = (com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig.OfferV2.Config) r10
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.OfferV2PluginFactory$OfferV2PluginLaunchInstructions r0 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.OfferV2PluginFactory$OfferV2PluginLaunchInstructions
            r0.<init>(r10)
            r5.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r6, r7, r8, r9, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.q2.h(ys3.a, it3.d, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }
}
