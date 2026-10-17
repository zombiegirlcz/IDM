package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ConfirmationPluginFactory$ConfirmationLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f210659a;

    public q(hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        this.f210659a = creditApplicationConfigInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof ConfirmationPluginFactory$ConfirmationLaunchInstructions) {
            return new ConfirmationRootFlow(new ConfirmationFlowContract$InputData(io3.h.R(pluginPayload, ""), ((ConfirmationPluginFactory$ConfirmationLaunchInstructions) pluginLaunchInstructions).f66914a));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(ConfirmationPluginFactory$ConfirmationLaunchInstructions.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oz3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(it3.d r10, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r11, grl.r2 r12, wi0.b r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r9 = this;
            boolean r11 = r15 instanceof mz3.p
            if (r11 == 0) goto L13
            r11 = r15
            mz3.p r11 = (mz3.p) r11
            int r0 = r11.f210649w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.f210649w = r0
            goto L1a
        L13:
            mz3.p r11 = new mz3.p
            gim.c r15 = (gim.c) r15
            r11.<init>(r9, r15)
        L1a:
            java.lang.Object r15 = r11.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.f210649w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r15)
            goto L6a
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r15)
            ju3.a r15 = ju3.a.IDENTITY_VERIFICATION
            ft3.j1 r1 = r10.f168328j
            hw3.e r3 = r9.f210659a
            ufm.i r15 = r3.b(r15, r1)
            zhm.h0 r1 = zhm.h0.f322473a
            ufm.f r15 = ue0.e.t(r15, r1)
            ja3.d r3 = new ja3.d
            r8 = 26
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            mx0.bc r10 = new mx0.bc
            r12 = 28
            r10.<init>(r3, r12)
            ufm.i r12 = new ufm.i
            r13 = 1
            r12.<init>(r15, r10, r13)
            java.lang.String r10 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r10)
            r11.f210649w = r2
            java.lang.Object r15 = nim.a.b(r12, r11)
            if (r15 != r0) goto L6a
            return r0
        L6a:
            java.lang.String r10 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.q.b(it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ufm.i iVar = new ufm.i(ue0.e.t(this.f210659a.b(ju3.a.IDENTITY_VERIFICATION, payload.f66247a.f168328j), zhm.h0.f322473a), new bc(new f(payload, 1), 27), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
