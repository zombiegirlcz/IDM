package com.revolut.feature.payments.groups.impl.ui_new.customize;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr9.f;
import rd0.e;
import te0.w;
import yhm.d;
import zh0.b;
import zhm.u;
import zhm.v;
import zk7.a;
import zs9.i;
import zs9.j;
import zs9.k;
import zs9.l;
import zs9.m;
import zs9.n;
import zs9.o;
import zs9.q;
import zs9.r;
import zs9.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/customize/GroupCustomizationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lzs9/s;", "Lcom/revolut/feature/payments/groups/impl/ui_new/customize/GroupCustomizationScreenContract$InputData;", "Lzs9/q;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class GroupCustomizationScreen extends BaseRecyclerViewScreen<s, GroupCustomizationScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(GroupCustomizationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarvaultsActionFooterBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputTextDelegate f79396a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final SuggestionsBarDelegate f79397b0;
    public final ListSubheaderDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RowDelegate f79398d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LargeActionButtonDelegate f79399e0;
    public final List f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupCustomizationScreen(GroupCustomizationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbarvaults_action_footer;
        this.V = R$id.screenRecyclerNavbarVaultsActionFooter_recyclerView;
        this.W = vc.s.t(this, zs9.h.f);
        this.X = true;
        this.Y = w.y0(new a(this, inputData, 17));
        this.Z = w.y0(new b(this, 18));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f79396a0 = inputTextDelegate;
        SuggestionsBarDelegate suggestionsBarDelegate = new SuggestionsBarDelegate();
        this.f79397b0 = suggestionsBarDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.c0 = listSubheaderDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f79398d0 = rowDelegate;
        this.f79399e0 = new LargeActionButtonDelegate();
        this.f0 = v.k(inputTextDelegate, suggestionsBarDelegate, listSubheaderDelegate, rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        z zVarH3 = h3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(zVarH3.f174579c.f59328m), null, new i(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(zVarH3.f174579c.u.k), null, new i(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(zVarH3.f174578b.f), null, new i(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f79396a0.e.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f79397b0.p().d), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d), null, new l(this, null), 3);
        RowDelegate rowDelegate = this.f79398d0;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(rowDelegate.f53218h, rowDelegate.f53220l, "merge(...)"), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53225r), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f79399e0.d.f121375b), null, new o(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarVaults navBarVaults = h3().f174579c;
        navBarVaults.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarVaults.setToolbarTitle(new TextLocalisedClause(R$string.payments_groups_customisation_title, null, null, 14));
        navBarVaults.setDescription(new TextLocalisedClause(R$string.payments_groups_customisation_title, null, null, 14));
        navBarVaults.setEndBottomIconImage(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_camera, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), R$attr.uikit_colorAccentNeutral, 4.0f, null, null, 48));
        ((j60.a) ((f) this.Y.getValue()).f188736p.get()).d(u.c(this.f79399e0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(s uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f324840a);
        h3().f174579c.setBackgroundImage(uiState.f324841b);
        h3().f174578b.setModel(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.payments_groups_actions_create_group, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f324842c, null, null, 988), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final z h3() {
        ViewBinding value = this.W.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (z) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final r T2() {
        return (r) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
