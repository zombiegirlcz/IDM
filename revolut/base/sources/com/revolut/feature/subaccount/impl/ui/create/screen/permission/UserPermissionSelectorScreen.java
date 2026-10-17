package com.revolut.feature.subaccount.impl.ui.create.screen.permission;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r6e.t;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import wp0.b;
import wrj.m;
import x7e.a;
import x7e.c;
import x7e.d;
import x7e.g;
import x7e.h;
import x7e.i;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/screen/permission/UserPermissionSelectorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lx7e/h;", "Lcom/revolut/feature/subaccount/impl/ui/create/screen/permission/UserPermissionSelectorScreenContract$InputData;", "Lx7e/g;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserPermissionSelectorScreen extends BaseRecyclerViewScreen<h, UserPermissionSelectorScreenContract$InputData, g> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89049d0 = {o0.f186429a.j(new h0(UserPermissionSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f89050a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f89051b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPermissionSelectorScreen(UserPermissionSelectorScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        this.Y = w.y0(new m(this, inputData, 18));
        this.Z = w.y0(new b(this, 17));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f89050a0 = rowDelegate;
        this.f89051b0 = new TwinHorizontalButtonDelegate();
        this.c0 = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (t) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174565c.f59410q), null, new x7e.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f89050a0.f53225r), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174564b.o), null, new x7e.b(this, null, 1), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f89051b0;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.group_pockets_withdrawal_permissions_creation_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.group_pockets_withdrawal_permissions_creation_header_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        g3().f174564b.setText(new TextLocalisedClause(R$string.vaults_common_action_continue, null, null, 14));
        ((j60.a) ((t) this.Y.getValue()).d.get()).d(u.c(this.f89051b0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final jii.u g3() {
        ViewBinding value = this.X.getValue(this, f89049d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
