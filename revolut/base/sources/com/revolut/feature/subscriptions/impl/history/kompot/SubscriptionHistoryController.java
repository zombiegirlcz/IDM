package com.revolut.feature.subscriptions.impl.history.kompot;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryController;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hae.b;
import hae.c;
import hae.d;
import i9e.o;
import i9e.s;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/history/kompot/SubscriptionHistoryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhae/h;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionHistoryController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SubscriptionHistoryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SubscriptionHistoryControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public final ListSubheaderDelegate Q;
    public final RowLoadingDelegate R;
    public final SwipeToActionDelegate S;
    public final FullScreenStateDelegate T;
    public final Object U;

    public SubscriptionHistoryController(SubscriptionHistoryControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHistoryController f150485b;

            {
                this.f150485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubscriptionHistoryController subscriptionHistoryController = this.f150485b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionHistoryController.V;
                        return (e) ((s) subscriptionHistoryController.M.getValue()).f159744c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionHistoryController.V;
                        phm.a aVar = (phm.a) ue0.e.j(subscriptionHistoryController.m2()).a().get(f9e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).G;
                        SubscriptionHistoryControllerContract$InputData subscriptionHistoryControllerContract$InputData = subscriptionHistoryController.K;
                        subscriptionHistoryControllerContract$InputData.getClass();
                        return new s(oVar, subscriptionHistoryControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionHistoryController.V;
                        SubscriptionHistoryController subscriptionHistoryController2 = this.f150485b;
                        return dli.f.a(subscriptionHistoryController2, (e) subscriptionHistoryController2.L.getValue(), v.k(subscriptionHistoryController2.S, subscriptionHistoryController2.R, subscriptionHistoryController2.Q, subscriptionHistoryController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHistoryController f150485b;

            {
                this.f150485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubscriptionHistoryController subscriptionHistoryController = this.f150485b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionHistoryController.V;
                        return (e) ((s) subscriptionHistoryController.M.getValue()).f159744c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionHistoryController.V;
                        phm.a aVar = (phm.a) ue0.e.j(subscriptionHistoryController.m2()).a().get(f9e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).G;
                        SubscriptionHistoryControllerContract$InputData subscriptionHistoryControllerContract$InputData = subscriptionHistoryController.K;
                        subscriptionHistoryControllerContract$InputData.getClass();
                        return new s(oVar, subscriptionHistoryControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionHistoryController.V;
                        SubscriptionHistoryController subscriptionHistoryController2 = this.f150485b;
                        return dli.f.a(subscriptionHistoryController2, (e) subscriptionHistoryController2.L.getValue(), v.k(subscriptionHistoryController2.S, subscriptionHistoryController2.R, subscriptionHistoryController2.Q, subscriptionHistoryController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = vc.s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new ListSubheaderDelegate();
        this.R = new RowLoadingDelegate();
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        this.T = new FullScreenStateDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: hae.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionHistoryController f150485b;

            {
                this.f150485b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubscriptionHistoryController subscriptionHistoryController = this.f150485b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubscriptionHistoryController.V;
                        return (e) ((s) subscriptionHistoryController.M.getValue()).f159744c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SubscriptionHistoryController.V;
                        phm.a aVar = (phm.a) ue0.e.j(subscriptionHistoryController.m2()).a().get(f9e.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f9e.a.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).G;
                        SubscriptionHistoryControllerContract$InputData subscriptionHistoryControllerContract$InputData = subscriptionHistoryController.K;
                        subscriptionHistoryControllerContract$InputData.getClass();
                        return new s(oVar, subscriptionHistoryControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SubscriptionHistoryController.V;
                        SubscriptionHistoryController subscriptionHistoryController2 = this.f150485b;
                        return dli.f.a(subscriptionHistoryController2, (e) subscriptionHistoryController2.L.getValue(), v.k(subscriptionHistoryController2.S, subscriptionHistoryController2.R, subscriptionHistoryController2.Q, subscriptionHistoryController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        hae.h uiState = (hae.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Clause clause = uiState.f150492b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (hae.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new c(this, null), 3);
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
