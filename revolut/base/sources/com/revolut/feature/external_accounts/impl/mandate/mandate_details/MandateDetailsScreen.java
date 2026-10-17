package com.revolut.feature.external_accounts.impl.mandate.mandate_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import frl.a;
import grl.k9;
import hae.k;
import hh6.d;
import hh6.f;
import hh6.g;
import hh6.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.e4;
import no.m;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import xf6.u1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/mandate_details/MandateDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lhh6/l;", "Lcom/revolut/feature/external_accounts/impl/mandate/mandate_details/MandateDetailsScreenContract$InputData;", "Laii/q;", "Lno/m;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MandateDetailsScreen extends BaseRecyclerViewScreen<l, MandateDetailsScreenContract$InputData, q> implements m {
    public final AnalyticsProduct.Retail U;
    public final boolean V;
    public final int W;
    public final int X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f72459a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsDelegate f72460b0;
    public final CellDetailsActionDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TextDelegate f72461d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LargeActionButtonDelegate f72462e0;
    public final List f0;
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(MandateDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MandateDetailsScreen(MandateDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137507t;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = true;
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        this.X = R$id.recyclerView;
        this.Y = s.t(this, d.f);
        this.Z = w.y0(new h1k.a(this, inputData, 27));
        this.f72459a0 = w.y0(new h1g.a(this, 15));
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.f72460b0 = cellDetailsDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.c0 = cellDetailsActionDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.f72461d0 = textDelegate;
        this.f72462e0 = new LargeActionButtonDelegate();
        this.f0 = v.k(cellDetailsDelegate, cellDetailsActionDelegate, new RowLoadingDelegate(), textDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (u1) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new hh6.e(this, continuation, 0), 3);
        r rVarFilter = h3().f174565c.s0().filter(new k(new he4.r(24), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new f(this, null), 3);
        r rVarFilter2 = this.f72460b0.d.filter(new k(new he4.r(25), 22));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter2), null, new g(this, null), 3);
        r rVarFilter3 = this.c0.d.filter(new k(new he4.r(26), 23));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter3), null, new hh6.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new hh6.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f72461d0.d), null, new hba.k(this, (Continuation) null, 15), 3);
        r map = this.f72462e0.d.f121375b.map(new k(new he4.r(27), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new exe.k(2, T2(), hh6.k.class, "onRevokeDialogButtonClicked", "onRevokeDialogButtonClicked(Ljava/lang/String;)V", 4, 24), 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((u1) this.Z.getValue()).d.get()).d(u.c(this.f72462e0));
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_mandate_details_header, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setActions(u.c(new ActionsView.Item("ACTION_REVOKE", null, false, e4.EnabledClickable, null, new TextLocalisedClause(R$string.external_institutions_action_revoke, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32662)));
        h3().f174564b.setText(new TextLocalisedClause(R$string.open_banking_common_action_save, null, null, 14));
        h3().f174564b.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174564b;
        boolean z = uiState.f152264b;
        Clause clause = uiState.d;
        largeActionButton.setEnabled(z);
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f152265c ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setEndIconImage(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.W;
    }

    public final jii.u h3() {
        ViewBinding value = this.Y.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final hh6.k T2() {
        return (hh6.k) this.f72459a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
