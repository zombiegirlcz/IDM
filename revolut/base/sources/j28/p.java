package j28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import x8h.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements e {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n28.d f170733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f170734b;

    public p(n28.d widgetAvailabilityProvider, n0 stockLendingInteractor) {
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        this.f170733a = widgetAvailabilityProvider;
        this.f170734b = stockLendingInteractor;
    }

    @Override // j28.e
    public final int a() {
        return 3;
    }

    @Override // j28.e
    public final Flow b(InvestWidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return nim.a.v(vkm.q.q(rd0.e.b(this.f170734b.a(TradingAccountType.Gia.f105270a))), new j1.e(this, 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j28.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof j28.o
            if (r7 == 0) goto L13
            r7 = r8
            j28.o r7 = (j28.o) r7
            int r0 = r7.f170732w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f170732w = r0
            goto L1a
        L13:
            j28.o r7 = new j28.o
            gim.c r8 = (gim.c) r8
            r7.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f170732w
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r8)
            goto L79
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L49
        L39:
            yhm.o.b(r8)
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r8 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.SECURITIES
            r7.f170732w = r3
            n28.d r1 = r6.f170733a
            java.lang.Object r8 = r1.d(r8, r7)
            if (r8 != r0) goto L49
            goto L78
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L54:
            x8h.n0 r8 = r6.f170734b
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r1 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            efm.r r8 = r8.a(r1)
            j0g.b r1 = new j0g.b
            r5 = 8
            r1.<init>(r5)
            efm.r r8 = m70.a.g(r8, r4, r1, r3)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            r7.f170732w = r2
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r0) goto L79
        L78:
            return r0
        L79:
            boolean r7 = r8 instanceof n4l.c
            if (r7 == 0) goto L80
            r4 = r8
            n4l.c r4 = (n4l.c) r4
        L80:
            if (r4 != 0) goto L85
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L85:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode r7 = r4.f212471b
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode$GiaSecurityLending r8 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode.GiaSecurityLending.f105307a
            boolean r7 = r7.equals(r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j28.p.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
