package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ghk.t;
import gr2.j0;
import gs2.c;
import gs2.d;
import gs2.f;
import gs2.g;
import gs2.n;
import gs2.p;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import tr2.o;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/payments_list/page/BlockedPaymentsListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgs2/p;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/payments_list/page/BlockedPaymentsListScreenContract$Input;", "Lgs2/n;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockedPaymentsListScreen extends BaseRecyclerViewScreen<p, BlockedPaymentsListScreenContract$Input, n> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f64254d0 = {o0.f186429a.j(new h0(BlockedPaymentsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f64255a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f64256b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedPaymentsListScreen(BlockedPaymentsListScreenContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.U = s.t(this, c.f);
        this.V = R$layout.screen_recycler_navbar;
        this.W = true;
        this.X = w.y0(new t(this, input, 19));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: gs2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockedPaymentsListScreen f146280b;

            {
                this.f146280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BlockedPaymentsListScreen blockedPaymentsListScreen = this.f146280b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BlockedPaymentsListScreen.f64254d0;
                        return (o) ((tr2.o) blockedPaymentsListScreen.X.getValue()).f273679j.get();
                    default:
                        KProperty[] kPropertyArr2 = BlockedPaymentsListScreen.f64254d0;
                        return zhm.v.k((ListSubheaderDelegate) blockedPaymentsListScreen.Z.getValue(), (RowDelegate) blockedPaymentsListScreen.f64255a0.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
        this.Z = w.y0(new j0(3));
        this.f64255a0 = w.y0(new j0(4));
        this.f64256b0 = w.y0(new j0(5));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: gs2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockedPaymentsListScreen f146280b;

            {
                this.f146280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BlockedPaymentsListScreen blockedPaymentsListScreen = this.f146280b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlockedPaymentsListScreen.f64254d0;
                        return (o) ((tr2.o) blockedPaymentsListScreen.X.getValue()).f273679j.get();
                    default:
                        KProperty[] kPropertyArr2 = BlockedPaymentsListScreen.f64254d0;
                        return zhm.v.k((ListSubheaderDelegate) blockedPaymentsListScreen.Z.getValue(), (RowDelegate) blockedPaymentsListScreen.f64255a0.getValue(), new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (o) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(((RowDelegate) this.f64255a0.getValue()).f53218h), null, new d(this, null), 3);
        ?? r56 = this.Z;
        a.g2(this, e.b(((ListSubheaderDelegate) r56.getValue()).f52707c), null, new gs2.e(this, null), 3);
        a.g2(this, e.b(((ListSubheaderDelegate) r56.getValue()).d), null, new f(this, null), 3);
        a.g2(this, e.b(((ListSubheaderDelegate) r56.getValue()).e), null, new g(this, null), 3);
        a.g2(this, e.b(((LargeActionButtonDelegate) this.f64256b0.getValue()).d.f121375b), null, new gs2.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.U.getValue(this, f64254d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
        ((j60.a) ((o) this.X.getValue()).e.get()).d(v.k((LargeActionButtonDelegate) this.f64256b0.getValue(), (RowDelegate) this.f64255a0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106558a0() {
        return (List) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final gs2.o T2() {
        return (gs2.o) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
