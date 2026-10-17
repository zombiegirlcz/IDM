package com.revolut.feature.subscriptions.impl.block_future_payments.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import i9e.j;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sw6.a;
import t9e.b;
import t9e.c;
import t9e.d;
import t9e.h;
import t9e.k;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_future_payments/screen/BlockFuturePaymentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lt9e/k;", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/screen/BlockFuturePaymentsScreenContract$InputData;", "Lt9e/h;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockFuturePaymentsScreen extends BaseRecyclerViewScreen<k, BlockFuturePaymentsScreenContract$InputData, h> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89179d0 = {o0.f186429a.j(new h0(BlockFuturePaymentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f89180a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f89181b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockFuturePaymentsScreen(BlockFuturePaymentsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b.f);
        this.W = w.y0(new a(this, inputData, 10));
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: t9e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockFuturePaymentsScreen f268982b;

            {
                this.f268982b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BlockFuturePaymentsScreen blockFuturePaymentsScreen = this.f268982b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BlockFuturePaymentsScreen.f89179d0;
                        return (j60.a) ((i9e.j) blockFuturePaymentsScreen.W.getValue()).f159687g.get();
                    default:
                        KProperty[] kPropertyArr2 = BlockFuturePaymentsScreen.f89179d0;
                        return (j) ((i9e.j) blockFuturePaymentsScreen.W.getValue()).k.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: t9e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockFuturePaymentsScreen f268982b;

            {
                this.f268982b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BlockFuturePaymentsScreen blockFuturePaymentsScreen = this.f268982b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlockFuturePaymentsScreen.f89179d0;
                        return (j60.a) ((i9e.j) blockFuturePaymentsScreen.W.getValue()).f159687g.get();
                    default:
                        KProperty[] kPropertyArr2 = BlockFuturePaymentsScreen.f89179d0;
                        return (j) ((i9e.j) blockFuturePaymentsScreen.W.getValue()).k.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f89180a0 = fullScreenStateDelegate;
        this.f89181b0 = v.k(rowDelegate, new ListSubheaderDelegate(), new RowLoadingDelegate(), fullScreenStateDelegate);
        this.c0 = w.y0(new t73.h(17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (t9e.j) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, f89179d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new t05.m(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f89180a0.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b), null, new t9e.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.X.getValue()).d(v.k((LargeActionButtonDelegate) this.c0.getValue(), this.Z, new RowLoadingDelegate()));
        ViewBinding value = this.V.getValue(this, f89179d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.block_future_payments_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.block_future_payments_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF89181b0() {
        return this.f89181b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.U;
    }
}
