package com.revolut.feature.credit.card.impl.ui.statement;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import enb.f;
import eq8.b;
import et6.m0;
import ev4.d;
import ev4.i;
import ev4.j;
import ev4.k;
import grl.k9;
import java.util.List;
import jki.o;
import jm4.w2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/CreditCardStatementScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lev4/k;", "Lcom/revolut/feature/credit/card/impl/ui/statement/CreditCardStatementScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementScreen extends BaseRecyclerViewScreen<k, CreditCardStatementScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(CreditCardStatementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final boolean W;
    public final int X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f69651a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f69652b0;
    public final FixedTabsDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final FullScreenStateDelegate f69653d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final InputTextDelegate f69654e0;
    public final CellDetailsDelegate f0;
    public final CellDetailsActionDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final MonthPickerDelegate f69655h0;
    public final Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardStatementScreen(CreditCardStatementScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.U = a.h(k9Var, "value", k9Var);
        this.V = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 1;
        this.W = true;
        this.X = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
        this.Y = s.t(this, d.f);
        this.Z = w.y0(new b(this, inputData, 11));
        final int i2 = 0;
        this.f69651a0 = w.y0(new Function0(this) { // from class: ev4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementScreen f129705b;

            {
                this.f129705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CreditCardStatementScreen creditCardStatementScreen = this.f129705b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementScreen.j0;
                        return (h) ((w2) creditCardStatementScreen.Z.getValue()).f176422h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementScreen.j0;
                        return (j60.a) ((w2) creditCardStatementScreen.Z.getValue()).e.get();
                    default:
                        return v.k(creditCardStatementScreen.c0, creditCardStatementScreen.f69653d0, creditCardStatementScreen.f69654e0, creditCardStatementScreen.f0, creditCardStatementScreen.f69655h0, creditCardStatementScreen.g0, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListCellDelegate());
                }
            }
        });
        this.f69652b0 = w.y0(new Function0(this) { // from class: ev4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementScreen f129705b;

            {
                this.f129705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CreditCardStatementScreen creditCardStatementScreen = this.f129705b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementScreen.j0;
                        return (h) ((w2) creditCardStatementScreen.Z.getValue()).f176422h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementScreen.j0;
                        return (j60.a) ((w2) creditCardStatementScreen.Z.getValue()).e.get();
                    default:
                        return v.k(creditCardStatementScreen.c0, creditCardStatementScreen.f69653d0, creditCardStatementScreen.f69654e0, creditCardStatementScreen.f0, creditCardStatementScreen.f69655h0, creditCardStatementScreen.g0, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListCellDelegate());
                }
            }
        });
        this.c0 = new FixedTabsDelegate();
        this.f69653d0 = new FullScreenStateDelegate();
        this.f69654e0 = new InputTextDelegate(null);
        this.f0 = new CellDetailsDelegate();
        this.g0 = new CellDetailsActionDelegate();
        this.f69655h0 = new MonthPickerDelegate();
        final int i3 = 2;
        this.i0 = w.y0(new Function0(this) { // from class: ev4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementScreen f129705b;

            {
                this.f129705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                CreditCardStatementScreen creditCardStatementScreen = this.f129705b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementScreen.j0;
                        return (h) ((w2) creditCardStatementScreen.Z.getValue()).f176422h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementScreen.j0;
                        return (j60.a) ((w2) creditCardStatementScreen.Z.getValue()).e.get();
                    default:
                        return v.k(creditCardStatementScreen.c0, creditCardStatementScreen.f69653d0, creditCardStatementScreen.f69654e0, creditCardStatementScreen.f0, creditCardStatementScreen.f69655h0, creditCardStatementScreen.g0, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListCellDelegate());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (w2) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ev4.h) this.f69651a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().e.f59410q), null, new ev4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174557b.o), null, new ev4.e(this, null, 1), 3);
        r map = this.c0.f52339c.f121375b.map(new m0(10, new eul.d(11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = e.b(map);
        vkm.d dVarB2 = e.b(this.g0.d);
        vkm.d dVarB3 = e.b(this.f69653d0.f52371h.f121375b);
        vkm.d dVarB4 = e.b(this.f69655h0.f52775c.f121375b);
        InputTextDelegate inputTextDelegate = this.f69654e0;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(dVarB, dVarB2, dVarB3, dVarB4, e.b(inputTextDelegate.f52575g.f121375b), e.b(inputTextDelegate.i.f121375b)), null, new f(this, null, 24), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.f69652b0.getValue()).d(v.k(this.f69655h0, this.g0, this.f0));
        ScreenContentRecyclerView screenContentRecyclerView = h3().d;
        screenContentRecyclerView.setNestedScrollingEnabled(false);
        screenContentRecyclerView.setOverScrollMode(2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF95992b0() {
        return (List) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        j jVar = uiState.f129717a;
        NavBarWithToolbar navBarWithToolbar = h3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(jVar.f129714a, null);
        navBarWithToolbar.setToolbarTitle(jVar.f129715b);
        navBarWithToolbar.setTitleClickable(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(jVar.f129716c);
        h3().f174558c.setTextClause(uiState.f129719c);
        i iVar = uiState.d;
        LargeActionButton largeActionButton = h3().f174557b;
        largeActionButton.setVisibility(iVar.f129713c ? 0 : 8);
        largeActionButton.setEnabled(iVar.f129712b);
        largeActionButton.setText(iVar.f129711a);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.V;
    }

    public final jii.s h3() {
        ViewBinding value = this.Y.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
