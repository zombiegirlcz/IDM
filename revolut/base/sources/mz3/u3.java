package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.SpousalConsentPartnerPluginFactory$SpousalConsentPartnerPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u3 extends oz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f210692a;

    public u3(hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        this.f210692a = creditApplicationConfigInteractor;
    }

    public static ActivityNavigateCommand i(SpousalConsentPartnerPopupScreenConfig spousalConsentPartnerPopupScreenConfig, PluginPayload pluginPayload) {
        aj4.c.Companion.getClass();
        return new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.SpousalConsentPartnerPopup(spousalConsentPartnerPopupScreenConfig, io3.h.R(pluginPayload, ""), null).f98274b), null, null, 0, null, null, null, null, false, 1020);
    }

    @Override // oz3.a
    public final efm.d0 d(ks3.c cVar, PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        it3.d dVar = payload.f66247a;
        ct3.a state = (ct3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        int i = r3.f210672a[state.ordinal()];
        hw3.e eVar = this.f210692a;
        if (i == 1) {
            ufm.i iVar = new ufm.i(eVar.b(ju3.a.SPOUSAL_CONSENT_PARTNER_INIT_POPUP, dVar.f168328j), new s(new f(this, payload, 7), 22), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!navigationConfig.f66191a) {
            return new ufm.i(eVar.b(ju3.a.SPOUSAL_CONSENT_PARTNER_WAITING_POPUP, dVar.f168328j), new s(new f(this, payload, 8), 23), 1);
        }
        ufm.b bVarM = efm.d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // oz3.a
    public final /* bridge */ /* synthetic */ Object e(ks3.c cVar, it3.d dVar, CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig, grl.r2 r2Var, wi0.b bVar, String str, j54.m0 m0Var) {
        return h((ct3.a) cVar, dVar, r2Var, bVar, str, m0Var);
    }

    @Override // oz3.a
    public final PluginFlowControllerV2 f(ks3.c cVar, PluginPayload pluginPayload) {
        ct3.a state = (ct3.a) cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (pluginLaunchInstructions instanceof SpousalConsentPartnerPluginFactory$SpousalConsentPartnerPluginLaunchInstructions) {
            return new SpousalConsentPartnerRootFlow(new SpousalConsentPartnerFlowContract$InputData(io3.h.R(pluginPayload, ""), ((SpousalConsentPartnerPluginFactory$SpousalConsentPartnerPluginLaunchInstructions) pluginLaunchInstructions).f66933a));
        }
        throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(SpousalConsentPartnerPluginFactory$SpousalConsentPartnerPluginLaunchInstructions.class)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ct3.a r6, it3.d r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof mz3.s3
            if (r0 == 0) goto L13
            r0 = r8
            mz3.s3 r0 = (mz3.s3) r0
            int r1 = r0.f210678w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210678w = r1
            goto L18
        L13:
            mz3.s3 r0 = new mz3.s3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210678w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            goto L7e
        L36:
            yhm.o.b(r8)
            int[] r8 = mz3.r3.f210672a
            int r6 = r6.ordinal()
            r6 = r8[r6]
            hw3.e r8 = r5.f210692a
            if (r6 == r4) goto L6d
            if (r6 == r3) goto L51
            r2 = 3
            if (r6 != r2) goto L4b
            goto L51
        L4b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L51:
            ft3.j1 r6 = r7.f168328j
            ju3.a r7 = ju3.a.SPOUSAL_CONSENT_PARTNER_WAITING_POPUP
            ufm.i r6 = r8.b(r7, r6)
            r0.f210678w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L62
            goto L7d
        L62:
            com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig r8 = (com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig) r8
            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData$Config$Popup r6 = new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData$Config$Popup
            kotlin.jvm.internal.Intrinsics.h(r8)
            r6.<init>(r8)
            return r6
        L6d:
            ft3.j1 r6 = r7.f168328j
            ju3.a r7 = ju3.a.SPOUSAL_CONSENT_PARTNER_INIT_POPUP
            ufm.i r6 = r8.b(r7, r6)
            r0.f210678w = r4
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig r8 = (com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig) r8
            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData$Config$Popup r6 = new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData$Config$Popup
            kotlin.jvm.internal.Intrinsics.h(r8)
            r6.<init>(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.u3.g(ct3.a, it3.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ct3.a r5, it3.d r6, grl.r2 r7, wi0.b r8, java.lang.String r9, gim.c r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof mz3.t3
            if (r0 == 0) goto L13
            r0 = r10
            mz3.t3 r0 = (mz3.t3) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mz3.t3 r0 = new mz3.t3
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f210687y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r9 = r0.f210686x
            wi0.b r8 = r0.f210685w
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
            r0.f210685w = r8
            r0.f210686x = r9
            r0.A = r3
            java.lang.Object r10 = r4.g(r5, r6, r0)
            if (r10 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData$Config r10 = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData.Config) r10
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.SpousalConsentPartnerPluginFactory$SpousalConsentPartnerPluginLaunchInstructions r0 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.SpousalConsentPartnerPluginFactory$SpousalConsentPartnerPluginLaunchInstructions
            r0.<init>(r10)
            r5.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r6, r7, r8, r9, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.u3.h(ct3.a, it3.d, grl.r2, wi0.b, java.lang.String, gim.c):java.lang.Object");
    }
}
