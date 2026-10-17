package com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.R$id;
import com.revolut.feature.wealth.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ebi.i;
import ech.c;
import ech.f;
import ech.g;
import ech.j;
import ech.l;
import ech.m;
import efm.r;
import gch.d;
import gch.e;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import sji.b;
import te0.w;
import vc.s;
import wp5.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/schedule/ScheduleScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lech/l;", "Lcom/revolut/feature/wealth/impl/ui/screens/composite_add_money/schedule/ScheduleScreenContract$Input;", "Lech/j;", "Lgch/e;", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScheduleScreen extends BaseRecyclerViewScreen<l, ScheduleScreenContract$Input, j> implements e {
    public final Object U;
    public final h V;
    public final boolean W;
    public final InputTextDelegate X;
    public final RowDelegate Y;
    public final d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final DatePickerDelegate f95598a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95597b0 = {o0.f186429a.j(new h0(ScheduleScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/impl/databinding/ScreenScheduleBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleScreen(ScheduleScreenContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = w.y0(new e58.e(this, 7));
        this.V = s.t(this, ech.a.f);
        this.W = true;
        this.X = new InputTextDelegate(null);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        this.Z = new d(rowDelegate);
        this.f95598a0 = new DatePickerDelegate();
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((m) T2()).v2(g.f124738a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (h9h.g) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f243076c.f59410q), null, new ech.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f243075b.f0()), null, new ech.b(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.X;
        com.revolut.kompot.navigable.a.g2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), null, new c(2, 4, f.class, T2(), "onInputTextDelegateClick", "onInputTextDelegateClick(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f95598a0.f52176c.f121375b), null, new cyc.c(2, T2(), f.class, "onDialogDatePickerDelegateClick", "onDialogDatePickerDelegateClick(Lcom/revolut/core/ui_kit/delegates/DatePickerDelegate$ClickData;)V", 4, 14), 3);
        r rVarFilter = h3().f243076c.o.f57403b.filter(new e8h.c(25, new i(8)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new ech.b(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f243076c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        h3().f243075b.setButtonText(new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_set, null, null, 14));
        ((j60.a) ((h9h.g) this.U.getValue()).e.get()).d(v.k(this.f95598a0, this.Y));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getJ0() {
        return u.c(this.X);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getF104199a0() {
        return R$id.screenSchedule_recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f243075b.setDescription(uiState.f124745b);
        h3().f243076c.setMenuItems(v.l(uiState.f124746c ? new TextNavBarMenuItem("LIST_ID_REMOVE_MENU_ITEM", new TextLocalisedClause(R.string.common_action_remove, null, null, 14), null, null, 12) : null));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getK() {
        return R$layout.screen_schedule;
    }

    public final q8h.b h3() {
        ViewBinding value = this.V.getValue(this, f95597b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q8h.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final f T2() {
        return (f) ((h9h.g) this.U.getValue()).o.get();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
