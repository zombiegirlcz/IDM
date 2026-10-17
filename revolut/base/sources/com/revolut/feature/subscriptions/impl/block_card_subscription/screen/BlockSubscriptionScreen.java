package com.revolut.feature.subscriptions.impl.block_card_subscription.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import i9e.k;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.x8;
import n9e.a;
import n9e.e;
import n9e.f;
import n9e.i;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_card_subscription/screen/BlockSubscriptionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ln9e/f;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/screen/BlockSubscriptionScreenContract$InputData;", "Ln9e/e;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockSubscriptionScreen extends BaseRecyclerViewScreen<f, BlockSubscriptionScreenContract$InputData, e> {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(BlockSubscriptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final h V;
    public final Object W;
    public final Object X;
    public final List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockSubscriptionScreen(BlockSubscriptionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = s.t(this, a.f);
        this.W = w.y0(new mzb.e(this, inputData, 17));
        this.X = w.y0(new x8(this, 21));
        this.Y = v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.f59410q), null, new n9e.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174564b.o), null, new n9e.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.subscription_block_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.subscription_block_confirmation_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f174564b.setText(new TextLocalisedClause(R$string.subscription_block_confirmation_button_block, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    public final u g3() {
        ViewBinding value = this.V.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }
}
