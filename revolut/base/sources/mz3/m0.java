package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedRootFlow;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.c f210634a;

    public m0(hw3.c directDebitInteractor) {
        Intrinsics.checkNotNullParameter(directDebitInteractor, "directDebitInteractor");
        this.f210634a = directDebitInteractor;
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        qs3.a state = (qs3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        int i = k0.f210621a[state.ordinal()];
        if (i == 1) {
            ufm.b bVarM = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.DirectDebitAccountSelection(io3.h.R(payload, ""), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (i == 2) {
            ufm.i iVar = new ufm.i(this.f210634a.g(kp0.w0.E(payload)), new s(new f(payload, 3), 4), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ufm.b bVarM2 = efm.d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.DirectDebitFailed(io3.h.R(payload, ""), null)));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }

    @Override // oz3.a
    public final /* bridge */ /* synthetic */ Object e(ks3.c cVar, it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, j54.m0 m0Var) {
        return g((qs3.a) cVar, dVar, r2Var, bVar, str, m0Var);
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        qs3.a state = (qs3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        if (k0.f210621a[state.ordinal()] == 3) {
            return new DirectDebitFailedRootFlow(new DirectDebitFailedContract$InputData(io3.h.R(pluginPayload, "")));
        }
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions) {
            return new DirectDebitRootFlow(new DirectDebitContract$InputData(((DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions) pluginLaunchInstructions).f66919a, io3.h.R(pluginPayload, "")));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(qs3.a r8, it3.d r9, grl.r2 r10, wi0.b r11, java.lang.String r12, gim.c r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof mz3.l0
            if (r0 == 0) goto L13
            r0 = r13
            mz3.l0 r0 = (mz3.l0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mz3.l0 r0 = new mz3.l0
            r0.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r0.f210628y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r12 = r0.f210627x
            wi0.b r11 = r0.f210626w
            grl.r2 r10 = r0.v
            it3.d r9 = r0.u
            yhm.o.b(r13)
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r13)
            int[] r13 = mz3.k0.f210621a
            int r8 = r8.ordinal()
            r8 = r13[r8]
            if (r8 == r3) goto L93
            r13 = 2
            r2 = 0
            if (r8 == r13) goto L52
            r13 = 3
            if (r8 != r13) goto L4c
            goto L9a
        L4c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L52:
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            java.lang.String r8 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r8)
            ft3.h1 r8 = new ft3.h1
            java.lang.String r13 = r9.f168323a
            ft3.d1 r4 = new ft3.d1
            ft3.j1 r5 = r9.f168328j
            gt3.f r6 = r9.k
            r4.<init>(r5, r6, r2)
            r8.<init>(r13, r4, r11)
            hw3.c r13 = r7.f210634a
            ufm.n r8 = r13.g(r8)
            r0.u = r9
            r0.v = r10
            r0.f210626w = r11
            r0.f210627x = r12
            r0.A = r3
            java.lang.Object r13 = nim.a.b(r8, r0)
            if (r13 != r1) goto L83
            return r1
        L83:
            bk4.e r13 = (bk4.e) r13
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions r2 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions
            com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData$Config$Passed r8 = new com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData$Config$Passed
            kotlin.jvm.internal.Intrinsics.h(r13)
            r8.<init>(r13)
            r2.<init>(r8)
            goto L9a
        L93:
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions r2 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.DirectDebitPluginFactory$DirectDebitPluginLaunchInstructions
            com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData$Config$Started r8 = com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract.InputData.Config.Started.f67528a
            r2.<init>(r8)
        L9a:
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r8 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            r8.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r8 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r9, r10, r11, r12, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.m0.g(qs3.a, it3.d, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }
}
