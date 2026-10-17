package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.OverdraftOfferFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x2 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tx3.d f210705a;

    public x2(tx3.d overdraftOfferPrefetcher) {
        Intrinsics.checkNotNullParameter(overdraftOfferPrefetcher, "overdraftOfferPrefetcher");
        this.f210705a = overdraftOfferPrefetcher;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        return new OverdraftOfferFlow(new OverdraftOfferFlowContract$InputData(io3.h.R(pluginPayload, "")));
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
            boolean r5 = r9 instanceof mz3.w2
            if (r5 == 0) goto L13
            r5 = r9
            mz3.w2 r5 = (mz3.w2) r5
            int r0 = r5.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.A = r0
            goto L1a
        L13:
            mz3.w2 r5 = new mz3.w2
            gim.c r9 = (gim.c) r9
            r5.<init>(r3, r9)
        L1a:
            java.lang.Object r9 = r5.f210700y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.A
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.String r8 = r5.f210699x
            wi0.b r7 = r5.f210698w
            grl.r2 r6 = r5.v
            it3.d r4 = r5.u
            yhm.o.b(r9)
            goto L51
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
            r5.f210698w = r7
            r5.f210699x = r8
            r5.A = r2
            tx3.d r1 = r3.f210705a
            java.lang.Object r5 = r1.a(r9, r5)
            if (r5 != r0) goto L51
            return r0
        L51:
            com.revolut.feature.credit.application.models.plugins.PluginPayload$a r5 = com.revolut.feature.credit.application.models.plugins.PluginPayload.INSTANCE
            com.revolut.feature.credit.application.models.plugins.PluginPayload r4 = com.revolut.feature.credit.application.models.plugins.PluginPayload.Companion.b(r5, r4, r6, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.x2.b(it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        rfm.f0 f0VarF = pd.b.n(skm.p0.f264003c, new mpd.p(this, payload, null, 18)).f(new ufm.c(new i(payload, 20), 2));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}
