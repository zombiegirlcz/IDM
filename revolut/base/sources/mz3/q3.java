package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.SpousalConsentInitiatorPluginFactory$SpousalConsentInitiatorPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorRootFlow;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q3 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f210664a;

    public q3(hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        this.f210664a = creditApplicationConfigInteractor;
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        it3.d dVar = payload.f66247a;
        bt3.a state = (bt3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        if (state == bt3.a.WAITING && navigationConfig.f66191a) {
            ufm.b bVarM = efm.d0.m(DummyCommand.f98635a);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (state != bt3.a.CHECKING) {
            ufm.i iVar = new ufm.i(j(dVar.f168328j, state), new s(new h3(this, navigationConfig, payload, 1), 20), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        ufm.i iVar2 = new ufm.i(h(dVar.f168328j, state), new s(new f(payload, 6), 21), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        bt3.a state = (bt3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof SpousalConsentInitiatorPluginFactory$SpousalConsentInitiatorPluginLaunchInstructions) {
            return new SpousalConsentInitiatorRootFlow(new SpousalConsentInitiatorFlowContract$InputData(io3.h.R(pluginPayload, ""), ((SpousalConsentInitiatorPluginFactory$SpousalConsentInitiatorPluginLaunchInstructions) pluginLaunchInstructions).f66932a));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(SpousalConsentInitiatorPluginFactory$SpousalConsentInitiatorPluginLaunchInstructions.class)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(bt3.a r6, it3.d r7, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof mz3.o3
            if (r0 == 0) goto L13
            r0 = r9
            mz3.o3 r0 = (mz3.o3) r0
            int r1 = r0.f210648x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210648x = r1
            goto L18
        L13:
            mz3.o3 r0 = new mz3.o3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210648x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r8 = r0.u
            yhm.o.b(r9)
            goto L84
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r9)
            goto L62
        L38:
            yhm.o.b(r9)
            int[] r9 = mz3.n3.f210642a
            int r2 = r6.ordinal()
            r9 = r9[r2]
            if (r9 == r4) goto L73
            if (r9 == r3) goto L73
            r2 = 3
            if (r9 == r2) goto L73
            r2 = 4
            if (r9 == r2) goto L73
            r8 = 5
            if (r9 != r8) goto L6d
            ft3.j1 r7 = r7.f168328j
            ufm.i r6 = r5.h(r7, r6)
            r7 = 0
            r0.u = r7
            r0.f210648x = r4
            java.lang.Object r9 = nim.a.b(r6, r0)
            if (r9 != r1) goto L62
            goto L83
        L62:
            com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig r9 = (com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig) r9
            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData$Config$Intro r6 = new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData$Config$Intro
            kotlin.jvm.internal.Intrinsics.h(r9)
            r6.<init>(r9)
            return r6
        L6d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L73:
            ft3.j1 r7 = r7.f168328j
            ufm.i r6 = r5.j(r7, r6)
            r0.u = r8
            r0.f210648x = r3
            java.lang.Object r9 = nim.a.b(r6, r0)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig r9 = (com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig) r9
            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData$Config$Popup r6 = new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData$Config$Popup
            kotlin.jvm.internal.Intrinsics.h(r9)
            boolean r7 = r8.f66191a
            if (r7 == 0) goto L92
            ju3.g r7 = ju3.g.STATUS_DIALOG
            goto L94
        L92:
            ju3.g r7 = ju3.g.BOTTOM_SHEET
        L94:
            r6.<init>(r9, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.q3.g(bt3.a, it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, gim.c):java.lang.Object");
    }

    public final ufm.i h(ft3.j1 j1Var, bt3.a aVar) {
        if (n3.f210642a[aVar.ordinal()] == 5) {
            return this.f210664a.b(ju3.a.SPOUSAL_CONSENT_INITIATOR_CHECKING, j1Var);
        }
        throw new IllegalStateException("Intro config is only defined for CHECKING state, got " + aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oz3.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(bt3.a r5, it3.d r6, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r7, grl.r2 r8, wi0.b r9, java.lang.String r10, gim.c r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof mz3.p3
            if (r0 == 0) goto L13
            r0 = r11
            mz3.p3 r0 = (mz3.p3) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mz3.p3 r0 = new mz3.p3
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.f210658y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r10 = r0.f210657x
            wi0.b r9 = r0.f210656w
            grl.r2 r8 = r0.v
            it3.d r6 = r0.u
            yhm.o.b(r11)
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r11)
            r0.u = r6
            r0.v = r8
            r0.f210656w = r9
            r0.f210657x = r10
            r0.A = r3
            java.lang.Object r11 = r4.g(r5, r6, r7, r0)
            if (r11 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData$Config r11 = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData.Config) r11
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.SpousalConsentInitiatorPluginFactory$SpousalConsentInitiatorPluginLaunchInstructions r7 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.SpousalConsentInitiatorPluginFactory$SpousalConsentInitiatorPluginLaunchInstructions
            r7.<init>(r11)
            r5.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r6, r8, r9, r10, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.q3.e(bt3.a, it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final ufm.i j(ft3.j1 j1Var, bt3.a aVar) {
        ju3.a aVar2;
        int i = n3.f210642a[aVar.ordinal()];
        if (i == 1) {
            aVar2 = ju3.a.SPOUSAL_CONSENT_INITIATOR_FAILED_POPUP;
        } else if (i == 2) {
            aVar2 = ju3.a.SPOUSAL_CONSENT_INITIATOR_PARTNER_NOT_MATCHED_POPUP;
        } else if (i == 3) {
            aVar2 = ju3.a.SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED_POPUP;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("CHECKING has dedicated flow");
            }
            aVar2 = ju3.a.SPOUSAL_CONSENT_INITIATOR_WAITING_POPUP;
        }
        return this.f210664a.b(aVar2, j1Var);
    }
}
