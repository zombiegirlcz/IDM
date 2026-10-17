package com.revolut.feature.subaccount.impl.ui.members.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r0e.c;
import r6e.g;
import r8e.a;
import r8e.d;
import r8e.f;
import r8e.i;
import r8e.j;
import rd0.e;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/members/screen/GroupMembersScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lr8e/j;", "Lcom/revolut/feature/subaccount/impl/ui/members/screen/GroupMembersScreenContract$InputData;", "Laii/q;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupMembersScreen extends BaseRecyclerViewScreen<j, GroupMembersScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(GroupMembersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsDelegate f89098a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f89099b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f89100d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f89101e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMembersScreen(GroupMembersScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = w.y0(new qvf.a(this, inputData, 21));
        this.Z = w.y0(new r1a.a(this, 5));
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f89098a0 = actionsDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f89099b0 = rowDelegate;
        this.c0 = new RowDelegate(null, null, 7);
        this.f89100d0 = new TwinHorizontalButtonDelegate();
        this.f89101e0 = v.k(rowDelegate, actionsDelegate, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (g) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new c(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f89098a0.f51611c.f121375b), null, new r8e.b(this, null), 3);
        RowDelegate rowDelegate = this.f89099b0;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new r8e.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53220l), null, new d(this, null), 3);
        RowDelegate rowDelegate2 = this.c0;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate2.f53218h), null, new r8e.e(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f89100d0;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new f(this, null, 1), 3);
        ((j60.a) ((g) this.Y.getValue()).d.get()).d(v.k(rowDelegate2, twinHorizontalButtonDelegate));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.moneyboxes_details_shared_vault_members, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78936d0() {
        return this.f89101e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
