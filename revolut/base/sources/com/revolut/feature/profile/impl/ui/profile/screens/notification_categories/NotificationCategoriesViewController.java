package com.revolut.feature.profile.impl.ui.profile.screens.notification_categories;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import coa.c;
import coa.d;
import coa.e;
import coa.k;
import coa.l;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.NotificationCategoriesViewController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fma.d0;
import fma.z;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/notification_categories/NotificationCategoriesViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcoa/d;", "Ldli/a;", "Lcoa/e;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationCategoriesViewController extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(NotificationCategoriesViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final NotificationCategoriesContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;
    public final FullScreenStateDelegate R;
    public final List S;

    public NotificationCategoriesViewController(NotificationCategoriesContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: coa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationCategoriesViewController f25515b;

            {
                this.f25515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NotificationCategoriesViewController notificationCategoriesViewController = this.f25515b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationCategoriesViewController.T;
                        qji.b bVarU2 = notificationCategoriesViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.di.NotificationCategoriesControllerInjector");
                        d0 d0Var = (d0) bVarU2;
                        return new z(d0Var.f136085b, d0Var.f136086c);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationCategoriesViewController.T;
                        return (c) ((z) notificationCategoriesViewController.M.getValue()).f136254c.get();
                    default:
                        KProperty[] kPropertyArr3 = NotificationCategoriesViewController.T;
                        NotificationCategoriesViewController notificationCategoriesViewController2 = this.f25515b;
                        return dli.f.a(notificationCategoriesViewController2, (c) notificationCategoriesViewController2.N.getValue(), notificationCategoriesViewController2.S, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: coa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationCategoriesViewController f25515b;

            {
                this.f25515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NotificationCategoriesViewController notificationCategoriesViewController = this.f25515b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationCategoriesViewController.T;
                        qji.b bVarU2 = notificationCategoriesViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.di.NotificationCategoriesControllerInjector");
                        d0 d0Var = (d0) bVarU2;
                        return new z(d0Var.f136085b, d0Var.f136086c);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationCategoriesViewController.T;
                        return (c) ((z) notificationCategoriesViewController.M.getValue()).f136254c.get();
                    default:
                        KProperty[] kPropertyArr3 = NotificationCategoriesViewController.T;
                        NotificationCategoriesViewController notificationCategoriesViewController2 = this.f25515b;
                        return dli.f.a(notificationCategoriesViewController2, (c) notificationCategoriesViewController2.N.getValue(), notificationCategoriesViewController2.S, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: coa.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationCategoriesViewController f25515b;

            {
                this.f25515b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NotificationCategoriesViewController notificationCategoriesViewController = this.f25515b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NotificationCategoriesViewController.T;
                        qji.b bVarU2 = notificationCategoriesViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.di.NotificationCategoriesControllerInjector");
                        d0 d0Var = (d0) bVarU2;
                        return new z(d0Var.f136085b, d0Var.f136086c);
                    case 1:
                        KProperty[] kPropertyArr2 = NotificationCategoriesViewController.T;
                        return (c) ((z) notificationCategoriesViewController.M.getValue()).f136254c.get();
                    default:
                        KProperty[] kPropertyArr3 = NotificationCategoriesViewController.T;
                        NotificationCategoriesViewController notificationCategoriesViewController2 = this.f25515b;
                        return dli.f.a(notificationCategoriesViewController2, (c) notificationCategoriesViewController2.N.getValue(), notificationCategoriesViewController2.S, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, k.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        this.S = v.k(rowDelegate, fullScreenStateDelegate, new RowLoadingDelegate());
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Clause textLocalisedClause = this.K.f81459a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.profile_notification_settings_title, null, null, 14);
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new co7.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new coa.m(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
