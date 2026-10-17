package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.esign.ESignTask;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ESignPluginFactory$ESignPluginLaunchInstructions$ESignPluginLaunchInstructionsOTP;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t0 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f210680a;

    public t0(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f210680a = userInteractor;
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        ts3.a state = (ts3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        int i = r0.f210667a[state.ordinal()];
        if (i == 1) {
            ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.ESignature(io3.h.R(payload, ""), CreditApplicationKompotFeatureConfig.ESignature.Config.Documents.f66647a, null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ufm.i iVar = new ufm.i(this.f210680a.f(false), new s(new f(payload, 4), 5), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // oz3.a
    public final /* bridge */ /* synthetic */ Object e(ks3.c cVar, it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, j54.m0 m0Var) {
        return g((ts3.a) cVar, dVar, r2Var, bVar, str, m0Var);
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        ts3.a state = (ts3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        int i = r0.f210667a[state.ordinal()];
        if (i == 1) {
            return new ESignatureRootFlow(new ESignatureFlowContract$InputData(io3.h.R(pluginPayload, ""), CreditApplicationKompotFeatureConfig.ESignature.Config.Documents.f66647a));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof ESignPluginFactory$ESignPluginLaunchInstructions$ESignPluginLaunchInstructionsOTP) {
            return new ESignatureRootFlow(new ESignatureFlowContract$InputData(io3.h.R(pluginPayload, ""), new CreditApplicationKompotFeatureConfig.ESignature.Config.Otp(ESignTask.INSTANCE, ((ESignPluginFactory$ESignPluginLaunchInstructions$ESignPluginLaunchInstructionsOTP) pluginLaunchInstructions).f66920a.i, true)));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(ESignPluginFactory$ESignPluginLaunchInstructions$ESignPluginLaunchInstructionsOTP.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ts3.a r5, it3.d r6, grl.r2 r7, wi0.b r8, java.lang.String r9, gim.c r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof mz3.s0
            if (r0 == 0) goto L13
            r0 = r10
            mz3.s0 r0 = (mz3.s0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mz3.s0 r0 = new mz3.s0
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f210677y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r9 = r0.f210676x
            wi0.b r8 = r0.f210675w
            grl.r2 r7 = r0.v
            it3.d r6 = r0.u
            yhm.o.b(r10)
            goto L5f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r10)
            int[] r10 = mz3.r0.f210667a
            int r5 = r5.ordinal()
            r5 = r10[r5]
            if (r5 == r3) goto L70
            r10 = 2
            if (r5 != r10) goto L6a
            ang.f r5 = r4.f210680a
            r10 = 0
            efm.d0 r5 = r5.f(r10)
            r0.u = r6
            r0.v = r7
            r0.f210675w = r8
            r0.f210676x = r9
            r0.A = r3
            java.lang.Object r10 = nim.a.b(r5, r0)
            if (r10 != r1) goto L5f
            return r1
        L5f:
            do3.n r10 = (do3.n) r10
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ESignPluginFactory$ESignPluginLaunchInstructions$ESignPluginLaunchInstructionsOTP r5 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ESignPluginFactory$ESignPluginLaunchInstructions$ESignPluginLaunchInstructionsOTP
            kotlin.jvm.internal.Intrinsics.h(r10)
            r5.<init>(r10)
            goto L71
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L70:
            r5 = 0
        L71:
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r10 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            r10.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r6, r7, r8, r9, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.t0.g(ts3.a, it3.d, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }
}
