package com.revolut.feature.payments.groups.impl.ui_chat.members;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oa2.b;
import oqj.d;
import os2.a;
import os9.f;
import os9.g;
import os9.i;
import os9.l;
import os9.o;
import os9.p;
import os9.q;
import os9.u;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/members/GroupChatMembersScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Los9/q;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/members/GroupChatMembersScreenContract$InputData;", "Los9/o;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupChatMembersScreen extends BaseRecyclerViewScreen<q, GroupChatMembersScreenContract$InputData, o> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79369e0 = {o0.f186429a.j(new h0(GroupChatMembersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f79370a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f79371b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f79372d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupChatMembersScreen(GroupChatMembersScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = R$id.recyclerView;
        this.W = s.t(this, g.f);
        this.X = true;
        this.Y = w.y0(new b(this, inputData, 29));
        this.Z = w.y0(new a(this, 1));
        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f79370a0 = rowDelegate;
        this.f79371b0 = w.y0(new d(6));
        this.c0 = w.y0(new d(7));
        this.f79372d0 = v.k(rowLoadingDelegate, rowDelegate, new ListSubheaderDelegate());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((u) T2()).v2(l.f229273a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, jki.o oVar) {
        q uiState = (q) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f229276a);
        g3().f174539b.setMenuItems(uiState.f229277b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (kr9.u) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        jii.m mVarG3 = g3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(mVarG3.f174539b.f59410q), null, new os9.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(mVarG3.f174539b.o.f57403b), null, new os9.h(this, null, 1), 3);
        RowDelegate rowDelegate = this.f79370a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(rowDelegate.f53218h, new or4.h(28))), null, new i(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(rowDelegate.k, new or4.h(29))), null, new i(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((RowDelegate) this.f79371b0.getValue()).f53218h, new f(0))), null, new i(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b, new f(1))), null, new i(this, continuation, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_groups_details_list_header_members, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_groups_details_list_header_members, null, null, 14));
        ((j60.a) ((kr9.u) this.Y.getValue()).e.get()).d(v.k((RowDelegate) this.f79371b0.getValue(), (LargeActionButtonDelegate) this.c0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, jki.o oVar) {
        q uiState = (q) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f229276a);
        g3().f174539b.setMenuItems(uiState.f229277b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f79372d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    public final jii.m g3() {
        ViewBinding value = this.W.getValue(this, f79369e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final p T2() {
        return (p) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
