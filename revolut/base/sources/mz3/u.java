package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ConsentsV1PluginFactory$ConsentsV1LaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1RootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f210688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw3.c f210689b;

    public u(hw3.e creditApplicationConfigInteractor, hw3.c creditApplicationConsentsInteractor) {
        Intrinsics.checkNotNullParameter("ftc_pre_offer_document_id", "documentId");
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationConsentsInteractor, "creditApplicationConsentsInteractor");
        this.f210688a = creditApplicationConfigInteractor;
        this.f210689b = creditApplicationConsentsInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof ConsentsV1PluginFactory$ConsentsV1LaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(ConsentsV1PluginFactory$ConsentsV1LaunchInstructions.class)));
        }
        ConsentsV1PluginFactory$ConsentsV1LaunchInstructions consentsV1PluginFactory$ConsentsV1LaunchInstructions = (ConsentsV1PluginFactory$ConsentsV1LaunchInstructions) pluginLaunchInstructions;
        return new ConsentsV1RootFlow(new ConsentsV1FlowContract$InputData("ftc_pre_offer_document_id", consentsV1PluginFactory$ConsentsV1LaunchInstructions.f66916a, consentsV1PluginFactory$ConsentsV1LaunchInstructions.f66917b, io3.h.R(pluginPayload, "")));
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
            boolean r11 = r15 instanceof mz3.t
            if (r11 == 0) goto L13
            r11 = r15
            mz3.t r11 = (mz3.t) r11
            int r0 = r11.f210679w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.f210679w = r0
            goto L1a
        L13:
            mz3.t r11 = new mz3.t
            gim.c r15 = (gim.c) r15
            r11.<init>(r9, r15)
        L1a:
            java.lang.Object r15 = r11.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.f210679w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r15)
            goto L77
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r15)
            ju3.a r15 = ju3.a.CONSENTS_V1
            ft3.j1 r1 = r10.f168328j
            hw3.e r3 = r9.f210688a
            ufm.i r15 = r3.b(r15, r1)
            ft3.h1 r1 = new ft3.h1
            java.lang.String r3 = r10.f168323a
            ft3.d1 r4 = new ft3.d1
            ft3.j1 r5 = r10.f168328j
            gt3.f r6 = r10.k
            r7 = 0
            r4.<init>(r5, r6, r7)
            r1.<init>(r3, r4, r13)
            hw3.c r3 = r9.f210689b
            ufm.n r1 = r3.e(r1)
            ard.z r3 = new ard.z
            r8 = 2
            r4 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            mz3.s r10 = new mz3.s
            r12 = 0
            r10.<init>(r3, r12)
            efm.d0 r10 = efm.d0.D(r15, r1, r10)
            java.lang.String r12 = "zipWith(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
            r11.f210679w = r2
            java.lang.Object r15 = nim.a.b(r10, r11)
            if (r15 != r0) goto L77
            return r0
        L77:
            java.lang.String r10 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.u.b(it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        efm.d0 d0VarD = efm.d0.D(this.f210688a.b(ju3.a.CONSENTS_V1, payload.f66247a.f168328j), this.f210689b.e(kp0.w0.E(payload)), new bc(new r(this, payload, 0), 29));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zipWith(...)");
        return d0VarD;
    }
}
