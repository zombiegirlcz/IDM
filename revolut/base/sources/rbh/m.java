package rbh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import tnb.g0;
import ybh.n0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f253077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1h.k f253078n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final prl.e f253079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f253080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tbh.a f253081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f253082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f253083t;

    public m(j60.a bottomExpandableDialogControllerExtension, r pocketPickerProvider, m1h.k portfolioInfoProvider, e input, prl.e wealthBalancesFilterInteractorFactory, g0 tradingCurrencyCompatibilityInteractor, tbh.a allowedBalanceTypesProvider) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(pocketPickerProvider, "pocketPickerProvider");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(wealthBalancesFilterInteractorFactory, "wealthBalancesFilterInteractorFactory");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(allowedBalanceTypesProvider, "allowedBalanceTypesProvider");
        this.f253077m = pocketPickerProvider;
        this.f253078n = portfolioInfoProvider;
        this.o = input;
        this.f253079p = wealthBalancesFilterInteractorFactory;
        this.f253080q = tradingCurrencyCompatibilityInteractor;
        this.f253081r = allowedBalanceTypesProvider;
        this.f253083t = new c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g3(rbh.m r6, com.revolut.retail.trading.core.domain.PocketInfo r7, gim.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof rbh.l
            if (r0 == 0) goto L16
            r0 = r8
            rbh.l r0 = (rbh.l) r0
            int r1 = r0.f253076x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f253076x = r1
            goto L1b
        L16:
            rbh.l r0 = new rbh.l
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253076x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.revolut.retail.trading.core.domain.PocketInfo r7 = r0.u
            yhm.o.b(r8)
            goto L54
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r8)
            tnb.g0 r8 = r6.f253080q
            akg.n r8 = r8.h()
            r6d.h r2 = new r6d.h
            r5 = 29
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r3, r2, r4)
            r0.u = r7
            r0.f253076x = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r0 = r8
            java.util.Set r0 = (java.util.Set) r0
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L60
            goto L61
        L60:
            r8 = r3
        L61:
            java.util.Set r8 = (java.util.Set) r8
            com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreen r0 = new com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreen
            com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreenContract$Input r1 = new com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreenContract$Input
            java.lang.String r7 = r7.getF104477a()
            r1.<init>(r7, r3, r8)
            r0.<init>(r1)
            rbh.g r7 = new rbh.g
            r8 = 2
            r7.<init>(r6, r8)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r8 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            r6.M2(r0, r8, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rbh.m.g3(rbh.m, com.revolut.retail.trading.core.domain.PocketInfo, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        e eVar = this.o;
        String str = eVar.f253067b;
        Continuation continuation = null;
        yji.n.j2(this, vkm.q.R(rd0.e.n(str != null ? this.f253077m.b(str) : boh.f.e(this.f253078n.g(eVar.f253066a), new g(this, 0)), h0.f322473a), new hr4.b(3, 16, continuation)), null, new h(this, continuation, 1), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f253083t;
    }

    @Override // rbh.d
    public final Object e3(n0 n0Var) {
        return vkm.q.x(mo3.a.g(new qij.s(c3(), 4), null, null, 3), n0Var);
    }

    @Override // rbh.d
    public final void f3() {
        V2(new k(this, null, 0), new yi5.b(29));
    }
}
