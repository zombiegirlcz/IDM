package com.revolut.feature.card_label.ui.screen.card_label_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_label.R$id;
import com.revolut.feature.card_label.R$layout;
import com.revolut.feature.card_label.api.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import iwh.f;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import ofm.q;
import te0.w;
import vc.s;
import vw4.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvy2/e;", "Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData;", "Lcom/revolut/feature/card_label/ui/screen/card_label_screen/a;", "feature_card_label_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardLabelScreen extends BaseRecyclerViewScreen<vy2.e, CardLabelScreenContract$InputData, a> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f64758b0 = {o0.f186429a.j(new h0(CardLabelScreen.class, "binding", "getBinding()Lcom/revolut/feature/card_label/databinding/ScreenCardLabelBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final InputTextDelegate X;
    public final List Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f64759a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLabelScreen(CardLabelScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_card_label;
        this.V = R$id.cardLabel_recyclerView;
        this.W = s.t(this, vy2.a.f);
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.X = inputTextDelegate;
        this.Y = u.c(inputTextDelegate);
        this.Z = w.y0(new vqd.b(this, inputData, 19));
        this.f64759a0 = w.y0(new vt3.a(this, 4));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        vy2.e uiState = (vy2.e) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f284055c.setEnabled(uiState.f293123b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final Flow P2() {
        return rd0.e.b(this.X.e.f121375b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (vy2.d) this.f64759a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f284054b.f59410q), null, new vy2.b(this, null, 0), 3);
        r map = this.X.e.f121375b.map(new vx9.w(new j(13), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new vrl.d(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f284055c.o), null, new vy2.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f284054b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        CardLabelScreenContract$InputData cardLabelScreenContract$InputData = (CardLabelScreenContract$InputData) this.G;
        Clause textLocalisedClause = cardLabelScreenContract$InputData.f64762c;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_label_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause textLocalisedClause2 = cardLabelScreenContract$InputData.f64762c;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.card_label_title, null, null, 14);
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause2);
        g3().f284055c.setText(new TextLocalisedClause(R$string.card_label_button_text, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        vy2.e uiState = (vy2.e) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f284055c.setEnabled(uiState.f293123b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final uy2.a g3() {
        ViewBinding value = this.W.getValue(this, f64758b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (uy2.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }
}
