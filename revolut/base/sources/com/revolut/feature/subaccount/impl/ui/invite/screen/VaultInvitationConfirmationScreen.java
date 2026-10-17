package com.revolut.feature.subaccount.impl.ui.invite.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.x;
import jki.o;
import kob.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l8e.b;
import l8e.c;
import l8e.g;
import l8e.h;
import l8e.l;
import ofm.q;
import r6e.u;
import rd0.e;
import te0.w;
import vc.s;
import yy0.i;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/invite/screen/VaultInvitationConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ll8e/h;", "Lcom/revolut/feature/subaccount/impl/ui/invite/screen/VaultInvitationConfirmationScreenContract$InputData;", "Ll8e/g;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VaultInvitationConfirmationScreen extends BaseRecyclerViewScreen<h, VaultInvitationConfirmationScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(VaultInvitationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListCellDelegate f89094a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f89095b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultInvitationConfirmationScreen(VaultInvitationConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        this.V = R$layout.screen_recycler_navbar_two_buttons;
        this.W = true;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new kpl.b(this, inputData, 17));
        this.Z = w.y0(new a(this, 19));
        ListCellDelegate listCellDelegate = new ListCellDelegate();
        this.f89094a0 = listCellDelegate;
        this.f89095b0 = v.k(new ListSubheaderDelegate(), listCellDelegate, new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (u) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174574c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174573b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().e.o), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f89094a0.d), null, new l1g.e(this, (Continuation) null, 10), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        x xVarH3 = h3();
        xVarH3.f174574c.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        xVarH3.f174573b.setText(new TextLocalisedClause(R$string.subaccount_group_invite_actions_accept, null, null, 14));
        LargeActionButton largeActionButton = xVarH3.e;
        largeActionButton.setText(new TextLocalisedClause(R$string.subaccount_group_invite_actions_decline, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f89095b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174574c;
        TextLocalisedClause textLocalisedClause = uiState.f192965a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(uiState.f192966b);
        navBarWithToolbar.setDescriptionVisible(true);
        i iVar = yy0.l.Companion;
        Image image = uiState.f192967c;
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(image));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final x h3() {
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
