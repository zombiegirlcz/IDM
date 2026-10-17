package com.revolut.feature.payments.groups.impl.ui_chat.trusted;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.impl.R$id;
import com.revolut.feature.payments.groups.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr9.d;
import rd0.e;
import te0.w;
import vc.s;
import vch.a;
import vs9.b;
import vs9.c;
import vs9.g;
import vs9.h;
import vs9.i;
import vs9.l;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/trusted/GroupChatTrustedScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvs9/i;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/trusted/GroupChatTrustedScreenContract$InputData;", "Lvs9/h;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupChatTrustedScreen extends BaseRecyclerViewScreen<i, GroupChatTrustedScreenContract$InputData, h> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79393b0 = {o0.f186429a.j(new h0(GroupChatTrustedScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/groups/impl/databinding/ScreenGroupChatTrustedBinding;", 0))};
    public final int U;
    public final int V;
    public final ao.h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f79394a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupChatTrustedScreen(GroupChatTrustedScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_group_chat_trusted;
        this.V = R$id.groupChatTrusted_recyclerView;
        this.W = s.t(this, b.f);
        this.X = true;
        this.Y = w.y0(new vqd.b(this, inputData, 5));
        this.Z = w.y0(new a(this, 25));
        this.f79394a0 = u.c(new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) this.Z.getValue()).v2(g.f291751a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.Y.getValue();
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
        gr9.a aVarH3 = h3();
        com.revolut.kompot.navigable.a.g2(this, e.b(aVarH3.f145951c.f59410q), null, new c(this, null, 0), 3);
        TwinVerticalButton twinVerticalButton = aVarH3.f145950b;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.o0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.p0()), null, new c(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        gr9.a aVarH3 = h3();
        aVarH3.f145951c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = aVarH3.f145950b;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_action_join, null, null, 14));
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_action_leave, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.f79394a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f291752a);
        NavBarWithToolbar navBarWithToolbar = h3().f145951c;
        TextLocalisedClause textLocalisedClause = uiState.f291753b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f291754c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final gr9.a h3() {
        ViewBinding value = this.W.getValue(this, f79393b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gr9.a) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
