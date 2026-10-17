package com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$id;
import com.revolut.feature.donations.impl.R$layout;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ltf.b;
import ma6.d;
import maa.r;
import mc6.a;
import mc6.c;
import mc6.g;
import mc6.i;
import pa6.q;
import rd0.e;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/recurring/schedule/RecurringDonationScheduleScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lmc6/i;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/recurring/schedule/RecurringDonationScheduleScreenContract$InputData;", "Lmc6/g;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringDonationScheduleScreen extends BaseRecyclerViewScreen<i, RecurringDonationScheduleScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(RecurringDonationScheduleScreen.class, "binding", "getBinding()Lcom/revolut/feature/donations/impl/databinding/ScreenRecurringDonationScheduleBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputTextDelegate f72106a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final DatePickerDelegate f72107b0;
    public final LargeActionButtonDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SingleChoiceDelegate f72108d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f72109e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringDonationScheduleScreen(RecurringDonationScheduleScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recurring_donation_schedule;
        this.V = R$id.recurringDonationSchedule_recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = w.y0(new b(this, inputData, 27));
        this.Z = w.y0(new r(this, 3));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f72106a0 = inputTextDelegate;
        this.f72107b0 = new DatePickerDelegate();
        this.c0 = new LargeActionButtonDelegate();
        this.f72108d0 = new SingleChoiceDelegate();
        this.f72109e0 = u.c(inputTextDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        i uiState = (i) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d dVarG3 = g3();
        dVarG3.f203960c.setTextClause(uiState.f204282b);
        dVarG3.f203959b.setEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (q) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f72106a0.f52575g.f121375b), null, new mc6.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f72107b0.d.f121375b), null, new m75.i(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f72108d0.p()), null, new mc6.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().d.f59410q), null, new mc6.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f203959b.o), null, new mc6.e(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.donations_recurring_schedule_selection_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        g3().f203959b.setText(new TextLocalisedClause(R$string.donations_recurring_schedule_selection_action_continue, null, null, 14));
        ((j60.a) ((q) this.Y.getValue()).d.get()).d(v.k(this.f72107b0, this.c0, this.f72108d0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d dVarG3 = g3();
        dVarG3.f203960c.setTextClause(uiState.f204282b);
        dVarG3.f203959b.setEnabled(true);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF75588d0() {
        return this.f72109e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.V;
    }

    public final d g3() {
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final mc6.h T2() {
        return (mc6.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
