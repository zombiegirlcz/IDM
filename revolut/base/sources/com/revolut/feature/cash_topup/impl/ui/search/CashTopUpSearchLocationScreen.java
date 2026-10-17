package com.revolut.feature.cash_topup.impl.ui.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mb3.t;
import os2.a;
import ot1.p;
import ox5.r;
import p0l.d;
import pc3.c;
import pc3.e;
import pc3.f;
import pc3.g;
import sji.b;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/search/CashTopUpSearchLocationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpc3/f;", "Lcom/revolut/feature/cash_topup/impl/ui/search/CashTopUpSearchLocationScreenContract$InputData;", "Lpc3/e;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpSearchLocationScreen extends BaseRecyclerViewScreen<f, CashTopUpSearchLocationScreenContract$InputData, e> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65680a0 = {o0.f186429a.j(new h0(CashTopUpSearchLocationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final Lazy V;
    public final RowDelegate W;
    public final List X;
    public final Lazy Y;
    public final h Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpSearchLocationScreen(CashTopUpSearchLocationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = j.b(new p(this, inputData, 26));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.W = rowDelegate;
        this.X = v.k(rowDelegate, new RowLoadingDelegate());
        this.Y = j.b(new a(this, 22));
        this.Z = s.t(this, pc3.a.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.f59409p.f57337m), null, new r(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174539b.f59409p.f57336l), null, new d(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f53218h), null, new pc3.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.f59417v0 = false;
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.topup_cash_search_hint, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z) {
            if (D2().isLaidOut()) {
                g3().f174539b.E0();
            } else if (D2().getViewTreeObserver().isAlive()) {
                D2().getViewTreeObserver().addOnGlobalLayoutListener(new c(this));
            }
        }
    }

    public final m g3() {
        ViewBinding value = this.Z.getValue(this, f65680a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }
}
