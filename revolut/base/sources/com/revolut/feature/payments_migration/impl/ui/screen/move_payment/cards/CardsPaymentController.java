package com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardsCarouselDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentController;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import jii.k;
import k6a.b;
import k6a.c;
import k6a.d;
import k6a.f;
import k6a.g;
import k6a.l;
import k6a.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/move_payment/cards/CardsPaymentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk6a/l;", "Ldli/a;", "Lk6a/n;", "Lno/m;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardsPaymentController extends ViewController<l> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CardsPaymentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CardsPaymentControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final NewRevolutCardsCarouselDelegate N;
    public final LargeActionButtonDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CardsPaymentController(CardsPaymentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = s.t(this, b.f);
        this.N = new NewRevolutCardsCarouselDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: k6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsPaymentController f181654b;

            {
                this.f181654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardsPaymentController cardsPaymentController = this.f181654b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardsPaymentController.T;
                        phm.a aVar = (phm.a) ue0.e.j(cardsPaymentController.m2()).a().get(u5a.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u5a.j.class, " is not found"));
                        }
                        u5a.f fVar = ((u5a.f) ((u5a.j) aVar2.b())).o;
                        CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData = cardsPaymentController.K;
                        cardsPaymentControllerContract$InputData.getClass();
                        return new u5a.b(fVar, cardsPaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardsPaymentController.T;
                        return (k) ((u5a.b) cardsPaymentController.Q.getValue()).f277407c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardsPaymentController.T;
                        CardsPaymentController cardsPaymentController2 = this.f181654b;
                        return dli.f.a(cardsPaymentController2, cardsPaymentController2.d(), v.k(new LargeActionButtonLoadingDelegate(), new NewRevolutCardLoadingDelegate(rim.d.c(cardsPaymentController2.m2().getResources().getDisplayMetrics().widthPixels * 0.92f)), new RowDelegate(null, null, 7), new RowLoadingDelegate(), cardsPaymentController2.N, cardsPaymentController2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: k6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsPaymentController f181654b;

            {
                this.f181654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardsPaymentController cardsPaymentController = this.f181654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardsPaymentController.T;
                        phm.a aVar = (phm.a) ue0.e.j(cardsPaymentController.m2()).a().get(u5a.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u5a.j.class, " is not found"));
                        }
                        u5a.f fVar = ((u5a.f) ((u5a.j) aVar2.b())).o;
                        CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData = cardsPaymentController.K;
                        cardsPaymentControllerContract$InputData.getClass();
                        return new u5a.b(fVar, cardsPaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardsPaymentController.T;
                        return (k) ((u5a.b) cardsPaymentController.Q.getValue()).f277407c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardsPaymentController.T;
                        CardsPaymentController cardsPaymentController2 = this.f181654b;
                        return dli.f.a(cardsPaymentController2, cardsPaymentController2.d(), v.k(new LargeActionButtonLoadingDelegate(), new NewRevolutCardLoadingDelegate(rim.d.c(cardsPaymentController2.m2().getResources().getDisplayMetrics().widthPixels * 0.92f)), new RowDelegate(null, null, 7), new RowLoadingDelegate(), cardsPaymentController2.N, cardsPaymentController2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: k6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsPaymentController f181654b;

            {
                this.f181654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardsPaymentController cardsPaymentController = this.f181654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardsPaymentController.T;
                        phm.a aVar = (phm.a) ue0.e.j(cardsPaymentController.m2()).a().get(u5a.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u5a.j.class, " is not found"));
                        }
                        u5a.f fVar = ((u5a.f) ((u5a.j) aVar2.b())).o;
                        CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData = cardsPaymentController.K;
                        cardsPaymentControllerContract$InputData.getClass();
                        return new u5a.b(fVar, cardsPaymentControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardsPaymentController.T;
                        return (k) ((u5a.b) cardsPaymentController.Q.getValue()).f277407c.get();
                    default:
                        KProperty[] kPropertyArr3 = CardsPaymentController.T;
                        CardsPaymentController cardsPaymentController2 = this.f181654b;
                        return dli.f.a(cardsPaymentController2, cardsPaymentController2.d(), v.k(new LargeActionButtonLoadingDelegate(), new NewRevolutCardLoadingDelegate(rim.d.c(cardsPaymentController2.m2().getResources().getDisplayMetrics().widthPixels * 0.92f)), new RowDelegate(null, null, 7), new RowLoadingDelegate(), cardsPaymentController2.N, cardsPaymentController2.O), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        k6a.m mVar = uiState.f181662a;
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        TextLocalisedClause textLocalisedClause = mVar.f181661a;
        screenRecyclerNavbarActionFooterNavBar.setTitle(textLocalisedClause, null);
        d3().f174534c.setToolbarTitle(textLocalisedClause);
        ActionFooterView actionFooterView = d3().f174533b;
        i iVar = uiState.f181663b;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u5a.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, continuation, 1), 3);
        NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate = this.N;
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52823l.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52824m.f121375b), new k6a.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52827q), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52820g.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52821h.f121375b), new k6a.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new k6a.i(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k6a.k d() {
        return (k6a.k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
