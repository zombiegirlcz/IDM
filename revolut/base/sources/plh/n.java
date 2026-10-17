package plh;

import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n33.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements mf1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f237411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oih.j f237412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.l f237413c;
    public final gte.a d;

    public n(tzg.m wealthAccountsInteractor, oih.j wealthStocksAccountCommandProvider, ybl.l tradingConfigInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f237411a = wealthAccountsInteractor;
        this.f237412b = wealthStocksAccountCommandProvider;
        this.f237413c = tradingConfigInteractor;
        this.d = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return nim.a.u(new j(2, null), ybl.l.d(this.f237413c));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mf1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof plh.k
            if (r0 == 0) goto L13
            r0 = r6
            plh.k r0 = (plh.k) r0
            int r1 = r0.f237409w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f237409w = r1
            goto L1a
        L13:
            plh.k r0 = new plh.k
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f237409w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            oih.j r6 = r5.f237412b
            r2 = 3
            r4 = 0
            ufm.i r6 = oih.j.a(r6, r4, r4, r2)
            plh.l r2 = plh.l.f
            o0.a r2 = new o0.a
            r4 = 23
            r2.<init>(r4)
            ufm.i r4 = new ufm.i
            r4.<init>(r6, r2, r3)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            r0.f237409w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: plh.n.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        if (((jte.d) this.d).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c)) {
            return new go.g(Boolean.FALSE, 2);
        }
        return rd0.e.e(new r0(mo3.a.g(tzg.m.a(this.f237411a, WealthAccountType.SECURITIES), null, new pj9.m(14), 1), 21), m72.b.w("InvestAddNewProductWidgetDataSource", "isAvailable"), new otd.a(3, 10, null));
    }
}
