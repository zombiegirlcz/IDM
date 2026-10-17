package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c2 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rx3.a f210589a;

    public c2(rx3.a creditAnimatedIntroInteractor) {
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        this.f210589a = creditAnimatedIntroInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions.class)));
        }
        MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions mortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions = (MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions) pluginLaunchInstructions;
        return new MortgageOfferFlow(new MortgageOfferFlowContract$InputData(mortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions.f66925a, io3.h.R(pluginPayload, ""), mortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions.f66926b));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oz3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(it3.d r4, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r5, grl.r2 r6, wi0.b r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r3 = this;
            boolean r5 = r9 instanceof mz3.a2
            if (r5 == 0) goto L13
            r5 = r9
            mz3.a2 r5 = (mz3.a2) r5
            int r0 = r5.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.A = r0
            goto L1a
        L13:
            mz3.a2 r5 = new mz3.a2
            gim.c r9 = (gim.c) r9
            r5.<init>(r3, r9)
        L1a:
            java.lang.Object r9 = r5.f210582y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.A
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.String r8 = r5.f210581x
            wi0.b r7 = r5.f210580w
            grl.r2 r6 = r5.v
            it3.d r4 = r5.u
            yhm.o.b(r9)
            goto L53
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            yhm.o.b(r9)
            java.lang.String r9 = r4.f168323a
            r5.u = r4
            r5.v = r6
            r5.f210580w = r7
            r5.f210581x = r8
            r5.A = r2
            java.lang.String r5 = "offer"
            rx3.a r1 = r3.f210589a
            java.lang.Boolean r9 = r1.a(r9, r5)
            if (r9 != r0) goto L53
            return r0
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r5 = r9.booleanValue()
            hs3.v r9 = r4.e
            boolean r0 = r9 instanceof hs3.h0
            r1 = 0
            if (r0 == 0) goto L6d
            if (r9 == 0) goto L65
            hs3.h0 r9 = (hs3.h0) r9
            goto L8c
        L65:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.MortgageOfferMetadata"
            r4.<init>(r5)
            throw r4
        L6d:
            java.util.List r9 = r4.f
            if (r9 == 0) goto L8b
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L77:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r9.next()
            boolean r2 = r0 instanceof hs3.h0
            if (r2 == 0) goto L77
            goto L87
        L86:
            r0 = r1
        L87:
            r9 = r0
            hs3.v r9 = (hs3.v) r9
            goto L8c
        L8b:
            r9 = r1
        L8c:
            hs3.h0 r9 = (hs3.h0) r9
            if (r5 != 0) goto L94
            if (r9 == 0) goto L94
            hs3.c r1 = r9.f154892a
        L94:
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            com.revolut.feature.credit.application.plugins.impl.navigation.plugins.MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions r0 = new com.revolut.feature.credit.application.plugins.impl.navigation.plugins.MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions
            if (r9 == 0) goto L9e
            hs3.j0 r9 = r9.f154893b
            if (r9 != 0) goto La0
        L9e:
            hs3.j0 r9 = hs3.j0.DEFAULT
        La0:
            r0.<init>(r1, r9)
            r5.getClass()
            com.revolut.feature.credit.application.models.plugins.PluginPayload r4 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.a(r4, r6, r7, r8, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.c2.b(it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        return te0.w.o0(skm.p0.f264003c, new b2(payload, this, null));
    }
}
