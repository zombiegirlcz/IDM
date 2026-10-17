package com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import efm.r;
import grl.k9;
import java.util.Date;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import nsh.e;
import o10.c;
import o2g.f;
import o3g.d;
import o3g.g;
import o3g.i;
import o3g.j;
import ofm.q;
import sji.b;
import te0.w;
import vc.s;
import z0g.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lo3g/j;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$InputData;", "Lo3g/g;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesDatesSelectionScreen extends BaseScreen<j, TravelExperiencesDatesSelectionScreenContract$InputData, g> implements m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelExperiencesDatesSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesDatesSelectionBinding;", 0))};
    public final AnalyticsProduct.Retail M;
    public final int N;
    public final boolean O;
    public final h P;
    public final Object Q;
    public final Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesDatesSelectionScreen(TravelExperiencesDatesSelectionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137510y;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.N = R$layout.screen_experiences_dates_selection;
        this.O = true;
        this.P = s.t(this, o3g.a.f);
        this.Q = w.y0(new e(this, inputData, 16));
        this.R = w.y0(new c(this, 3));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        o3g.h hVar = oVar instanceof o3g.h ? (o3g.h) oVar : null;
        if (hVar == null || hVar.f221811a) {
            CalendarPickerRangeView calendarPickerRangeView = Z2().f293702b;
            d dVar = uiState.f221814a;
            calendarPickerRangeView.setCalendarData(dVar.f221804a, dVar.e, dVar.f221805b, dVar.f221806c, dVar.d, dVar.f);
            vim.d dVar2 = uiState.f221814a.e;
            if (dVar2 != null) {
                Z2().f293703c.setDescriptionText(new TimeRangeClause(((Date) dVar2.getStart()).getTime(), ((Date) dVar2.b()).getTime(), null, null, 12));
            }
        }
        if (hVar == null || hVar.f221813c) {
            Z2().f293703c.setMenuItems(uiState.f221816c);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (n0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r map = Z2().f293702b.b().map(new o28.g(new f(10), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new o3g.b(this, continuation, 0), 3);
        NavBarWithToolbar navBarWithToolbar = Z2().f293703c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new o3g.c(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new o3g.b(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(Z2().d.o), null, new o3g.c(this, continuation, i), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Z2().f293703c.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        NavBarWithToolbar experiencesDatesSelectionNavBarWithToolbar = Z2().f293703c;
        Intrinsics.checkNotNullExpressionValue(experiencesDatesSelectionNavBarWithToolbar, "experiencesDatesSelectionNavBarWithToolbar");
        experiencesDatesSelectionNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_date_picker_title, null, null, 14), null);
        Z2().f293703c.setToolbarTitle(new TextLocalisedClause(R$string.experiences_date_picker_title, null, null, 14));
        Z2().f293703c.setDescriptionVisible(true);
        Z2().d.o(LargeActionButton.ButtonStyle.f58725a);
        Z2().d.setText(new TextLocalisedClause(R$string.experiences_common_action_continue, null, null, 14));
    }

    public final w0g.f Z2() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
