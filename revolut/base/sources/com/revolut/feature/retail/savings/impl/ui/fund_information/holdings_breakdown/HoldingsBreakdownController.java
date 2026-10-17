package com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown;

import aii.q;
import anb.f;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown.HoldingsBreakdownController;
import com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown.HoldingsBreakdownControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fpb.b;
import fpb.c;
import fpb.d;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/fund_information/holdings_breakdown/HoldingsBreakdownController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfpb/d;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HoldingsBreakdownController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(HoldingsBreakdownController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final HoldingsBreakdownControllerContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public HoldingsBreakdownController(HoldingsBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsBreakdownController f137080b;

            {
                this.f137080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HoldingsBreakdownController holdingsBreakdownController = this.f137080b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsBreakdownController.R;
                        phm.a aVar = (phm.a) ue0.e.j(holdingsBreakdownController.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        HoldingsBreakdownControllerContract$InputData holdingsBreakdownControllerContract$InputData = holdingsBreakdownController.K;
                        holdingsBreakdownControllerContract$InputData.getClass();
                        return new anb.f(nVar, holdingsBreakdownControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingsBreakdownController.R;
                        return (f) ((anb.f) holdingsBreakdownController.O.getValue()).f6637c.get();
                    default:
                        KProperty[] kPropertyArr3 = HoldingsBreakdownController.R;
                        HoldingsBreakdownController holdingsBreakdownController2 = this.f137080b;
                        return dli.f.a(holdingsBreakdownController2, (f) holdingsBreakdownController2.P.getValue(), v.k(new TextDelegate(), new PlainTextDelegate(), new ListCellDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsBreakdownController f137080b;

            {
                this.f137080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HoldingsBreakdownController holdingsBreakdownController = this.f137080b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsBreakdownController.R;
                        phm.a aVar = (phm.a) ue0.e.j(holdingsBreakdownController.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        HoldingsBreakdownControllerContract$InputData holdingsBreakdownControllerContract$InputData = holdingsBreakdownController.K;
                        holdingsBreakdownControllerContract$InputData.getClass();
                        return new anb.f(nVar, holdingsBreakdownControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingsBreakdownController.R;
                        return (f) ((anb.f) holdingsBreakdownController.O.getValue()).f6637c.get();
                    default:
                        KProperty[] kPropertyArr3 = HoldingsBreakdownController.R;
                        HoldingsBreakdownController holdingsBreakdownController2 = this.f137080b;
                        return dli.f.a(holdingsBreakdownController2, (f) holdingsBreakdownController2.P.getValue(), v.k(new TextDelegate(), new PlainTextDelegate(), new ListCellDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsBreakdownController f137080b;

            {
                this.f137080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HoldingsBreakdownController holdingsBreakdownController = this.f137080b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsBreakdownController.R;
                        phm.a aVar = (phm.a) ue0.e.j(holdingsBreakdownController.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        HoldingsBreakdownControllerContract$InputData holdingsBreakdownControllerContract$InputData = holdingsBreakdownController.K;
                        holdingsBreakdownControllerContract$InputData.getClass();
                        return new anb.f(nVar, holdingsBreakdownControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingsBreakdownController.R;
                        return (f) ((anb.f) holdingsBreakdownController.O.getValue()).f6637c.get();
                    default:
                        KProperty[] kPropertyArr3 = HoldingsBreakdownController.R;
                        HoldingsBreakdownController holdingsBreakdownController2 = this.f137080b;
                        return dli.f.a(holdingsBreakdownController2, (f) holdingsBreakdownController2.P.getValue(), v.k(new TextDelegate(), new PlainTextDelegate(), new ListCellDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (fpb.f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f174564b.setText(new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_key_information_document_capitalised, null, null, 14));
        d3().f174564b.setLoadingButtonTag("HOLDING_BREAKDOWN_LARGE_ACTION_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
