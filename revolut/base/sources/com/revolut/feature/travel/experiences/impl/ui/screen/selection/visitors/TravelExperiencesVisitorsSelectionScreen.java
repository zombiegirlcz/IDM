package com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import frl.a;
import grl.k9;
import java.util.List;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pt4.d;
import q3g.c;
import q3g.e;
import q3g.f;
import q3g.g;
import sji.b;
import te0.w;
import vc.s;
import w0g.p;
import z0g.t;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/visitors/TravelExperiencesVisitorsSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lq3g/f;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/visitors/TravelExperiencesVisitorsSelectionScreenContract$InputData;", "Lq3g/e;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesVisitorsSelectionScreen extends BaseRecyclerViewScreen<f, TravelExperiencesVisitorsSelectionScreenContract$InputData, e> implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93166e0 = {o0.f186429a.j(new h0(TravelExperiencesVisitorsSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesVisitorsSelectionBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f93167a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f93168b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93169d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesVisitorsSelectionScreen(TravelExperiencesVisitorsSelectionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_visitors_selection;
        this.W = R$id.experiencesVisitorsSelection_recyclerView;
        this.X = true;
        Lazy lazyY0 = w.y0(new q1l.e(13));
        this.Y = lazyY0;
        Lazy lazyY02 = w.y0(new q1l.e(14));
        this.Z = lazyY02;
        this.f93167a0 = s.t(this, q3g.a.f);
        this.f93168b0 = v.k((CellIncrementDelegate) lazyY0.getValue(), (TextDelegate) lazyY02.getValue());
        this.c0 = w.y0(new d(this, inputData, 19));
        this.f93169d0 = w.y0(new pyc.a(this, 13));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293731c.setEnabled(uiState.f241969b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f93169d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f293730b.f59410q), null, new q3g.b(this, null, 0), 3);
        ?? r62 = this.Y;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellIncrementDelegate) r62.getValue()).f51948c), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellIncrementDelegate) r62.getValue()).d), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f293731c.o), null, new q3g.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        g3().f293730b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        NavBarWithToolbar experiencesVisitorsSelectionNavBarWithToolbar = g3().f293730b;
        Intrinsics.checkNotNullExpressionValue(experiencesVisitorsSelectionNavBarWithToolbar, "experiencesVisitorsSelectionNavBarWithToolbar");
        experiencesVisitorsSelectionNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_age_bands_title, null, null, 14), null);
        g3().f293730b.setToolbarTitle(new TextLocalisedClause(R$string.experiences_age_bands_title, null, null, 14));
        g3().f293731c.o(LargeActionButton.ButtonStyle.f58725a);
        g3().f293731c.setText(new TextLocalisedClause(R$string.experiences_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293731c.setEnabled(uiState.f241969b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF93168b0() {
        return this.f93168b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final p g3() {
        ViewBinding value = this.f93167a0.getValue(this, f93166e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
