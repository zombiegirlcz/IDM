package com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rtl.y;
import rxe.b;
import s3g.a;
import s3g.c;
import s3g.e;
import s3g.f;
import s3g.g;
import te0.w;
import vc.s;
import w0g.z;
import z0g.r;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/visitor_information/TravelExperiencesVisitorInformationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls3g/g;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/visitor_information/TravelExperiencesVisitorInformationScreenContract$InputData;", "Ls3g/e;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesVisitorInformationScreen extends BaseRecyclerViewScreen<g, TravelExperiencesVisitorInformationScreenContract$InputData, e> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(TravelExperiencesVisitorInformationScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesVisitorInformationBinding;", 0))};
    public final h U;
    public final int V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93171a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93172b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesVisitorInformationScreen(TravelExperiencesVisitorInformationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, a.f);
        this.V = R$layout.screen_travel_experiences_visitor_information;
        this.W = R$id.travelExperiencesVisitorInformationScreen_recyclerView;
        Lazy lazyY0 = w.y0(new s1g.a(8));
        this.X = lazyY0;
        Lazy lazyY02 = w.y0(new s1g.a(9));
        this.Y = lazyY02;
        this.Z = v.k((InputTextDelegate) lazyY0.getValue(), (ListSubheaderDelegate) lazyY02.getValue());
        this.f93171a0 = w.y0(new b(this, inputData, 19));
        this.f93172b0 = w.y0(new y(this, 20));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293756b.setEnabled(uiState.f259671b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r) this.f93171a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.f93172b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f293757c.f59410q), null, new s3g.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f293756b.o), null, new s3g.b(this, null, 1), 3);
        ?? r62 = this.X;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r62.getValue()).f.f121375b), null, new rt4.o(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r62.getValue()).e.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f293757c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_visitor_information_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_visitor_information_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f293756b.setText(new TextLocalisedClause(R$string.experiences_common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        g uiState = (g) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f293756b.setEnabled(uiState.f259671b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final z g3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (z) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }
}
