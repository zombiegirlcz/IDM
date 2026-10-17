package com.revolut.feature.insurance_embedded.impl.ui.screen.detail;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.R$id;
import com.revolut.feature.insurance_embedded.impl.R$layout;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import cv7.a;
import cv7.c;
import cv7.d;
import cv7.f;
import cv7.g;
import cv7.k;
import cv7.l;
import cv7.m;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.y;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/detail/EmbeddedInsuranceDetailScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcv7/m;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/detail/EmbeddedInsuranceDetailScreenContract$InputData;", "Laii/q;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmbeddedInsuranceDetailScreen extends BaseRecyclerViewScreen<m, EmbeddedInsuranceDetailScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f76088d0 = {o0.f186429a.j(new h0(EmbeddedInsuranceDetailScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_embedded/impl/databinding/ScreenEmbeddedInsuranceDetailBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsActionDelegate f76089a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f76090b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedInsuranceDetailScreen(EmbeddedInsuranceDetailScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_embedded_insurance_detail;
        this.V = s.t(this, a.f);
        this.W = R$id.embeddedDetail_recyclerView;
        this.X = w.y0(new cf6.a(this, inputData, 29));
        this.Y = w.y0(new co7.a(this, 12));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.f76089a0 = cellDetailsActionDelegate;
        this.f76090b0 = new LargeActionButtonDelegate();
        this.c0 = v.k(rowDelegate, cellDetailsActionDelegate, new ListCellDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new TextDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (y) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f168526c.f59357t), null, new cv7.b(this, continuation, 0), 3);
        ?? r62 = this.X;
        j60.a aVarB = ((y) r62.getValue()).b();
        LargeActionButtonDelegate largeActionButtonDelegate = this.f76090b0;
        aVarB.d(u.c(largeActionButtonDelegate));
        com.revolut.kompot.navigable.a.g2(this, e.b(((y) r62.getValue()).b().C()), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(largeActionButtonDelegate.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f168525b.o), null, new cv7.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f168526c.b()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f168526c.K()), null, new cv7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f76089a0.d), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53218h), null, new g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f168526c.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        h3().f168525b.setText(new TextLocalisedClause(R$string.embedded_insurance_action_get_help, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithBigTile navBarWithBigTile = h3().f168526c;
        k kVar = uiState.f109310b;
        navBarWithBigTile.setToolbarTitle(kVar.f109306a);
        navBarWithBigTile.setTitle(kVar.f109306a);
        navBarWithBigTile.setBackgroundImage(kVar.f109307b);
        navBarWithBigTile.setActions(kVar.d);
        navBarWithBigTile.setMenuItems(kVar.e);
        navBarWithBigTile.setActionStatusLabel(kVar.f109308c);
        LargeActionButton embeddedDetailButton = h3().f168525b;
        Intrinsics.checkNotNullExpressionValue(embeddedDetailButton, "embeddedDetailButton");
        embeddedDetailButton.setVisibility(uiState.f109311c ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final iu7.a h3() {
        ViewBinding value = this.V.getValue(this, f76088d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iu7.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.Y.getValue();
    }
}
