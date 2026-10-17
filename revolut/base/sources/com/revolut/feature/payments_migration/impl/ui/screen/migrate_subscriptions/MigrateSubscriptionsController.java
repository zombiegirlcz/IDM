package com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.payments_migration.impl.R$id;
import com.revolut.feature.payments_migration.impl.R$layout;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ft.d;
import g6a.g;
import g6a.j;
import g6a.k;
import g6a.l;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/ui/screen/migrate_subscriptions/MigrateSubscriptionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg6a/j;", "Ldli/a;", "Lg6a/l;", "Lno/m;", "<init>", "()V", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MigrateSubscriptionsController extends ViewController<j> implements dli.a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(MigrateSubscriptionsController.class, "binding", "getBinding()Lcom/revolut/feature/payments_migration/impl/databinding/ScreenMigrateSubscriptionsBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final d6a.j L = new d6a.j();
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, s5a.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/payments_migration/impl/databinding/ScreenMigrateSubscriptionsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.screenMigrateSubscription_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.screenMigrateSubscription_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.screenMigrateSubscription_tabs;
                    Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                    if (tabs != null) {
                        return new s5a.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, screenContentRecyclerView, tabs);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public MigrateSubscriptionsController() {
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: g6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigrateSubscriptionsController f140895b;

            {
                this.f140895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MigrateSubscriptionsController migrateSubscriptionsController = this.f140895b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MigrateSubscriptionsController.R;
                        return (g) ((u5a.c) migrateSubscriptionsController.O.getValue()).f277409b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MigrateSubscriptionsController.R;
                        qji.b bVarU2 = migrateSubscriptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.di.MigrateSubscriptionsControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        return new u5a.c(gVar.f277428a, gVar.f277429b);
                    default:
                        KProperty[] kPropertyArr3 = MigrateSubscriptionsController.R;
                        MigrateSubscriptionsController migrateSubscriptionsController2 = this.f140895b;
                        return dli.f.a(migrateSubscriptionsController2, migrateSubscriptionsController2.R2(), migrateSubscriptionsController2.L.a(), R$id.screenMigrateSubscription_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: g6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigrateSubscriptionsController f140895b;

            {
                this.f140895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MigrateSubscriptionsController migrateSubscriptionsController = this.f140895b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MigrateSubscriptionsController.R;
                        return (g) ((u5a.c) migrateSubscriptionsController.O.getValue()).f277409b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MigrateSubscriptionsController.R;
                        qji.b bVarU2 = migrateSubscriptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.di.MigrateSubscriptionsControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        return new u5a.c(gVar.f277428a, gVar.f277429b);
                    default:
                        KProperty[] kPropertyArr3 = MigrateSubscriptionsController.R;
                        MigrateSubscriptionsController migrateSubscriptionsController2 = this.f140895b;
                        return dli.f.a(migrateSubscriptionsController2, migrateSubscriptionsController2.R2(), migrateSubscriptionsController2.L.a(), R$id.screenMigrateSubscription_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_migrate_subscriptions;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: g6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigrateSubscriptionsController f140895b;

            {
                this.f140895b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MigrateSubscriptionsController migrateSubscriptionsController = this.f140895b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MigrateSubscriptionsController.R;
                        return (g) ((u5a.c) migrateSubscriptionsController.O.getValue()).f277409b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MigrateSubscriptionsController.R;
                        qji.b bVarU2 = migrateSubscriptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.di.MigrateSubscriptionsControllerComponent.Injector");
                        u5a.g gVar = (u5a.g) bVarU2;
                        return new u5a.c(gVar.f277428a, gVar.f277429b);
                    default:
                        KProperty[] kPropertyArr3 = MigrateSubscriptionsController.R;
                        MigrateSubscriptionsController migrateSubscriptionsController2 = this.f140895b;
                        return dli.f.a(migrateSubscriptionsController2, migrateSubscriptionsController2.R2(), migrateSubscriptionsController2.L.a(), R$id.screenMigrateSubscription_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        String str = uiState.d;
        boolean z = uiState.f;
        if (str.length() == 0) {
            d3().f260053b.i0();
        }
        d3().f260053b.setSearchButtonActive(z);
        boolean z3 = uiState.e;
        List<com.revolut.core.ui_kit.views.q> list = uiState.f140911b;
        String str2 = uiState.f140912c;
        Tabs screenMigrateSubscriptionTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenMigrateSubscriptionTabs, "screenMigrateSubscriptionTabs");
        screenMigrateSubscriptionTabs.setVisibility(z3 ? 0 : 8);
        d3().d.setItems(list, str2);
        k kVar = qVar instanceof k ? (k) qVar : null;
        if (kVar == null) {
            return;
        }
        if (kVar.f140909b || kVar.f140908a) {
            d3().f260054c.scrollToPosition(0);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u5a.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f260053b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_migration_move_subscriptions_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.payments_migration_search_hint, null, null, 14));
        ScreenContentRecyclerView screenMigrateSubscriptionRecyclerView = d3().f260054c;
        Intrinsics.checkNotNullExpressionValue(screenMigrateSubscriptionRecyclerView, "screenMigrateSubscriptionRecyclerView");
        y.g(screenMigrateSubscriptionRecyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f58882b), new g6a.b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f260053b.f59410q), new d(this, continuation, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f260053b.X0), new g6a.b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f260053b.f59409p.f57337m), new g6a.b(this, continuation, 2), 3);
        d6a.j jVar = this.L;
        ViewController.P2(this, rd0.e.b(jVar.f111473a.f52371h.f121375b), new g6a.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(jVar.f111474b.d.f121375b), new g6a.d(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(jVar.f.f53608c), rd0.e.b(jVar.f111475c.q()), rd0.e.b(jVar.d.f53218h)), new g6a.b(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(jVar.e.d), new g6a.b(this, continuation, 4), 3);
    }

    public final s5a.a d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (s5a.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
