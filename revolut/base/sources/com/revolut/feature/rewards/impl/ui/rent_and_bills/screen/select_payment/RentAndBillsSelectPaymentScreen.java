package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.m6;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljc.b;
import ljc.c;
import ljc.f;
import ljc.j;
import ljc.l;
import mra.d;
import te0.w;
import vc.s;
import whc.x;
import whc.z;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/rent_and_bills/screen/select_payment/RentAndBillsSelectPaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lljc/j;", "Ldli/a;", "Lljc/l;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RentAndBillsSelectPaymentScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RentAndBillsSelectPaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final RentAndBillsSelectPaymentScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final RowDelegate O;
    public final SelectableDelegate P;
    public final FullScreenStateDelegate Q;
    public final ListSubheaderDelegate R;
    public final Object S;
    public final h T;
    public final Object U;

    public RentAndBillsSelectPaymentScreen(RentAndBillsSelectPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = R$style.UiKitTheme_Mono;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ljc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsSelectPaymentScreen f195620b;

            {
                this.f195620b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen = this.f195620b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RentAndBillsSelectPaymentScreen.V;
                        return (k) ((x) rentAndBillsSelectPaymentScreen.U.getValue()).f297610c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RentAndBillsSelectPaymentScreen.V;
                        RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen2 = this.f195620b;
                        return dli.f.a(rentAndBillsSelectPaymentScreen2, rentAndBillsSelectPaymentScreen2.d(), v.k(rentAndBillsSelectPaymentScreen2.O, rentAndBillsSelectPaymentScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), rentAndBillsSelectPaymentScreen2.R, rentAndBillsSelectPaymentScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RentAndBillsSelectPaymentScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsSelectPaymentScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = rentAndBillsSelectPaymentScreen.K;
                        rentAndBillsSelectPaymentScreenContract$InputData.getClass();
                        return new x(zVar, rentAndBillsSelectPaymentScreenContract$InputData);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new SelectableDelegate(rowDelegate);
        this.Q = new FullScreenStateDelegate();
        this.R = new ListSubheaderDelegate();
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ljc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsSelectPaymentScreen f195620b;

            {
                this.f195620b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen = this.f195620b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RentAndBillsSelectPaymentScreen.V;
                        return (k) ((x) rentAndBillsSelectPaymentScreen.U.getValue()).f297610c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RentAndBillsSelectPaymentScreen.V;
                        RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen2 = this.f195620b;
                        return dli.f.a(rentAndBillsSelectPaymentScreen2, rentAndBillsSelectPaymentScreen2.d(), v.k(rentAndBillsSelectPaymentScreen2.O, rentAndBillsSelectPaymentScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), rentAndBillsSelectPaymentScreen2.R, rentAndBillsSelectPaymentScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RentAndBillsSelectPaymentScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsSelectPaymentScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = rentAndBillsSelectPaymentScreen.K;
                        rentAndBillsSelectPaymentScreenContract$InputData.getClass();
                        return new x(zVar, rentAndBillsSelectPaymentScreenContract$InputData);
                }
            }
        });
        this.T = s.t(this, b.f);
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ljc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RentAndBillsSelectPaymentScreen f195620b;

            {
                this.f195620b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen = this.f195620b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RentAndBillsSelectPaymentScreen.V;
                        return (k) ((x) rentAndBillsSelectPaymentScreen.U.getValue()).f297610c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = RentAndBillsSelectPaymentScreen.V;
                        RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen2 = this.f195620b;
                        return dli.f.a(rentAndBillsSelectPaymentScreen2, rentAndBillsSelectPaymentScreen2.d(), v.k(rentAndBillsSelectPaymentScreen2.O, rentAndBillsSelectPaymentScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), rentAndBillsSelectPaymentScreen2.R, rentAndBillsSelectPaymentScreen2.Q), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = RentAndBillsSelectPaymentScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(rentAndBillsSelectPaymentScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        z zVar = ((z) aVar2.b()).f297622n;
                        RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = rentAndBillsSelectPaymentScreen.K;
                        rentAndBillsSelectPaymentScreenContract$InputData.getClass();
                        return new x(zVar, rentAndBillsSelectPaymentScreenContract$InputData);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        f3(uiState.f195628b);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setSearchButtonActive(true);
        Clause clause = uiState.f195629c;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData = this.K;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(d.E(rentAndBillsSelectPaymentScreenContract$InputData.f84983a, R$string.rent_and_bills_select_payment_title_rent, R$string.rent_and_bills_select_payment_title_bills), null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.rent_and_bills_select_payment_search_hint_text, null, null, 14));
        if (rentAndBillsSelectPaymentScreenContract$InputData.f84984b.d.f84784c.contains(com.revolut.feature.rewards.api.model.rent_and_bills.b.STANDING_ORDER)) {
            navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "CREATE_RECURRING_PAYMENT_MENU_ITEM_ID", new TextLocalisedClause(R$string.rent_and_bills_select_payment_bar_button_new, null, null, 14))));
        }
        f3(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59409p.f57337m), null, new ljc.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new ljc.d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new ljc.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.r()), null, new f(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.T.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ljc.k d() {
        return (ljc.k) this.N.getValue();
    }

    public final void f3(boolean z) {
        d3().f174533b.setModel(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.rent_and_bills_select_payment_link_payment, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, null, 988), null, null, 55));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
