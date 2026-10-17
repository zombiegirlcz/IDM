package com.revolut.feature.rewards.impl.ui.details.status.optin;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.p6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$string;
import ip0.zj;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import ric.c;
import ric.d;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/status/optin/PerkDetailsOptInScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lric/c;", "Lno/m;", "<init>", "()V", "Companion", "a", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerkDetailsOptInScreen extends SimpleViewController<c> implements m {
    public final /* synthetic */ zhc.a N = zhc.a.f322393a;
    public final j O = new j(7, u.c(new FullScreenStateDelegate()), false);
    public final h P = s.t(this, b.f);
    public final int Q = R$layout.screen_recycler_navbar_action_footer;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PerkDetailsOptInScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c3(ric.b.f254576a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.N.getClass();
        return new AnalyticsProduct.Retail(zhc.a.f322394b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setMenuItems(u.c(new TextNavBarMenuItem("MENU_NOT_NOW_ID", new TextLocalisedClause(R$string.common_action_notnow, null, null, 14), null, null, 12)));
        d3().f174533b.setModel(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.perks_opt_in_next, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenRecyclerNavbarActionFooterRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterRecyclerView, "screenRecyclerNavbarActionFooterRecyclerView");
        j jVar = this.O;
        y.h(screenRecyclerNavbarActionFooterRecyclerView, jVar, new LinearLayoutManager(screenRecyclerNavbarActionFooterRecyclerView.getContext()));
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.o.f57403b), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d(this, null, 2), 3);
        jVar.c(u.c(new FullScreenStateDelegate.Model("OPT_IN_ITEM_ID", new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.perks_opt_in_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.perks_opt_in_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D042", null, null, null, 30)), null, zj.REGULAR, true, null, null, p6.HEADING2, 832)));
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.Q;
    }
}
