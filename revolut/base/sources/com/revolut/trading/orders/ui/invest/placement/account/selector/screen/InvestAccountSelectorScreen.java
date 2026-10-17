package com.revolut.trading.orders.ui.invest.placement.account.selector.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$OutputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreen;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$InputData;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njj.l;
import rbh.k;
import rtl.c;
import rtl.p;
import rtl.r;
import te0.w;
import vc.s;
import vkm.d;
import xki.e;
import xsl.b;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/account/selector/screen/InvestAccountSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$OutputData;", "", "Lz0h/s1;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestAccountSelectorScreen extends ViewController<InvestAccountSelectorContract$OutputData> implements a, s1 {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(InvestAccountSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InvestAccountSelectorScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public InvestAccountSelectorScreen(InvestAccountSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: rtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestAccountSelectorScreen f257311b;

            {
                this.f257311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestAccountSelectorScreen investAccountSelectorScreen = this.f257311b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestAccountSelectorScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(investAccountSelectorScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = investAccountSelectorScreen.K;
                        investAccountSelectorScreenContract$InputData.getClass();
                        return new xsl.b(pVar, investAccountSelectorScreenContract$InputData, investAccountSelectorScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestAccountSelectorScreen.X;
                        return (p) ((xsl.b) investAccountSelectorScreen.N.getValue()).f308582h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestAccountSelectorScreen.X;
                        return zhm.v.k((AccountCellItemDelegate) investAccountSelectorScreen.P.getValue(), (ListSubheaderDelegate) investAccountSelectorScreen.Q.getValue(), (ListSubheaderLoadingDelegate) investAccountSelectorScreen.R.getValue(), (RowLoadingDelegate) investAccountSelectorScreen.S.getValue(), (TextDelegate) investAccountSelectorScreen.T.getValue(), (FullScreenStateDelegate) investAccountSelectorScreen.U.getValue());
                    default:
                        KProperty[] kPropertyArr4 = InvestAccountSelectorScreen.X;
                        InvestAccountSelectorScreen investAccountSelectorScreen2 = this.f257311b;
                        return dli.f.a(investAccountSelectorScreen2, (p) investAccountSelectorScreen2.O.getValue(), (List) investAccountSelectorScreen2.V.getValue(), investAccountSelectorScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestAccountSelectorScreen f257311b;

            {
                this.f257311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestAccountSelectorScreen investAccountSelectorScreen = this.f257311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestAccountSelectorScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(investAccountSelectorScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = investAccountSelectorScreen.K;
                        investAccountSelectorScreenContract$InputData.getClass();
                        return new xsl.b(pVar, investAccountSelectorScreenContract$InputData, investAccountSelectorScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestAccountSelectorScreen.X;
                        return (p) ((xsl.b) investAccountSelectorScreen.N.getValue()).f308582h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestAccountSelectorScreen.X;
                        return zhm.v.k((AccountCellItemDelegate) investAccountSelectorScreen.P.getValue(), (ListSubheaderDelegate) investAccountSelectorScreen.Q.getValue(), (ListSubheaderLoadingDelegate) investAccountSelectorScreen.R.getValue(), (RowLoadingDelegate) investAccountSelectorScreen.S.getValue(), (TextDelegate) investAccountSelectorScreen.T.getValue(), (FullScreenStateDelegate) investAccountSelectorScreen.U.getValue());
                    default:
                        KProperty[] kPropertyArr4 = InvestAccountSelectorScreen.X;
                        InvestAccountSelectorScreen investAccountSelectorScreen2 = this.f257311b;
                        return dli.f.a(investAccountSelectorScreen2, (p) investAccountSelectorScreen2.O.getValue(), (List) investAccountSelectorScreen2.V.getValue(), investAccountSelectorScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new rr4.a(6));
        this.Q = w.y0(new rr4.a(7));
        this.R = w.y0(new rr4.a(8));
        this.S = w.y0(new rr4.a(9));
        this.T = w.y0(new rr4.a(10));
        this.U = w.y0(new rr4.a(11));
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: rtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestAccountSelectorScreen f257311b;

            {
                this.f257311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestAccountSelectorScreen investAccountSelectorScreen = this.f257311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestAccountSelectorScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(investAccountSelectorScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = investAccountSelectorScreen.K;
                        investAccountSelectorScreenContract$InputData.getClass();
                        return new xsl.b(pVar, investAccountSelectorScreenContract$InputData, investAccountSelectorScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestAccountSelectorScreen.X;
                        return (p) ((xsl.b) investAccountSelectorScreen.N.getValue()).f308582h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestAccountSelectorScreen.X;
                        return zhm.v.k((AccountCellItemDelegate) investAccountSelectorScreen.P.getValue(), (ListSubheaderDelegate) investAccountSelectorScreen.Q.getValue(), (ListSubheaderLoadingDelegate) investAccountSelectorScreen.R.getValue(), (RowLoadingDelegate) investAccountSelectorScreen.S.getValue(), (TextDelegate) investAccountSelectorScreen.T.getValue(), (FullScreenStateDelegate) investAccountSelectorScreen.U.getValue());
                    default:
                        KProperty[] kPropertyArr4 = InvestAccountSelectorScreen.X;
                        InvestAccountSelectorScreen investAccountSelectorScreen2 = this.f257311b;
                        return dli.f.a(investAccountSelectorScreen2, (p) investAccountSelectorScreen2.O.getValue(), (List) investAccountSelectorScreen2.V.getValue(), investAccountSelectorScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: rtl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestAccountSelectorScreen f257311b;

            {
                this.f257311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvestAccountSelectorScreen investAccountSelectorScreen = this.f257311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestAccountSelectorScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(investAccountSelectorScreen.m2()).a().get(xsl.p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xsl.p.class, " is not found"));
                        }
                        xsl.p pVar = ((xsl.p) aVar2.b()).O;
                        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = investAccountSelectorScreen.K;
                        investAccountSelectorScreenContract$InputData.getClass();
                        return new xsl.b(pVar, investAccountSelectorScreenContract$InputData, investAccountSelectorScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = InvestAccountSelectorScreen.X;
                        return (p) ((xsl.b) investAccountSelectorScreen.N.getValue()).f308582h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = InvestAccountSelectorScreen.X;
                        return zhm.v.k((AccountCellItemDelegate) investAccountSelectorScreen.P.getValue(), (ListSubheaderDelegate) investAccountSelectorScreen.Q.getValue(), (ListSubheaderLoadingDelegate) investAccountSelectorScreen.R.getValue(), (RowLoadingDelegate) investAccountSelectorScreen.S.getValue(), (TextDelegate) investAccountSelectorScreen.T.getValue(), (FullScreenStateDelegate) investAccountSelectorScreen.U.getValue());
                    default:
                        KProperty[] kPropertyArr4 = InvestAccountSelectorScreen.X;
                        InvestAccountSelectorScreen investAccountSelectorScreen2 = this.f257311b;
                        return dli.f.a(investAccountSelectorScreen2, (p) investAccountSelectorScreen2.O.getValue(), (List) investAccountSelectorScreen2.V.getValue(), investAccountSelectorScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((r) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (p) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        int i = rtl.b.f257313a[this.K.f106830a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_selector_toolbar_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_account_selector_toolbar_title_sell, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new k(this, null, 19), 3);
        ViewController.P2(this, new l(new r7b.e(rd0.e.b(((AccountCellItemDelegate) this.P.getValue()).f51551c.f53218h), 17), 29), new rt4.o(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // z0h.s1
    public final d r() {
        return rd0.e.b(((TextDelegate) this.T.getValue()).d);
    }
}
