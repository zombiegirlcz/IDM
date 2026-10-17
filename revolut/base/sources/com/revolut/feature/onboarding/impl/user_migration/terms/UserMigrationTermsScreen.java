package com.revolut.feature.onboarding.impl.user_migration.terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$id;
import com.revolut.feature.onboarding.impl.R$layout;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.user_migration.terms.UserMigrationTermsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import gaa.b;
import gd9.e;
import gd9.f;
import gd9.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import n99.c;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/onboarding/impl/user_migration/terms/UserMigrationTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgd9/e;", "Ldli/a;", "Lgd9/g;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserMigrationTermsScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(UserMigrationTermsScreen.class, "binding", "getBinding()Lcom/revolut/feature/onboarding/impl/databinding/ScreenUserMigrationTermsBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object Q;
    public final int K = R$layout.screen_user_migration_terms;
    public final boolean L = true;
    public final h O = s.t(this, a.f);
    public final Object P = w.y0(new b(8));

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/onboarding/impl/databinding/ScreenUserMigrationTermsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.footerActionButtonView;
            FooterActionButtonView footerActionButtonView = (FooterActionButtonView) ViewBindings.findChildViewById(p0, i);
            if (footerActionButtonView != null) {
                i = R$id.navBarWithToolbarView;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new c(footerActionButtonView, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public UserMigrationTermsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationTermsScreen f143115b;

            {
                this.f143115b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UserMigrationTermsScreen userMigrationTermsScreen = this.f143115b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UserMigrationTermsScreen.R;
                        qji.b bVarU2 = userMigrationTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.user_migration.terms.di.UserMigrationTermsScreenInjector");
                        dd9.e eVar = ((dd9.f) bVarU2).f113145b;
                        dd9.h hVar = new dd9.h();
                        hVar.f113150a = e4m.b.b(new d9g.a(eVar, hVar));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UserMigrationTermsScreen.R;
                        return (f) ((dd9.h) userMigrationTermsScreen.M.getValue()).f113150a.get();
                    default:
                        KProperty[] kPropertyArr3 = UserMigrationTermsScreen.R;
                        UserMigrationTermsScreen userMigrationTermsScreen2 = this.f143115b;
                        return dli.f.a(userMigrationTermsScreen2, (f) userMigrationTermsScreen2.N.getValue(), u.c((RowDelegate) userMigrationTermsScreen2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationTermsScreen f143115b;

            {
                this.f143115b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UserMigrationTermsScreen userMigrationTermsScreen = this.f143115b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserMigrationTermsScreen.R;
                        qji.b bVarU2 = userMigrationTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.user_migration.terms.di.UserMigrationTermsScreenInjector");
                        dd9.e eVar = ((dd9.f) bVarU2).f113145b;
                        dd9.h hVar = new dd9.h();
                        hVar.f113150a = e4m.b.b(new d9g.a(eVar, hVar));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UserMigrationTermsScreen.R;
                        return (f) ((dd9.h) userMigrationTermsScreen.M.getValue()).f113150a.get();
                    default:
                        KProperty[] kPropertyArr3 = UserMigrationTermsScreen.R;
                        UserMigrationTermsScreen userMigrationTermsScreen2 = this.f143115b;
                        return dli.f.a(userMigrationTermsScreen2, (f) userMigrationTermsScreen2.N.getValue(), u.c((RowDelegate) userMigrationTermsScreen2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gd9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationTermsScreen f143115b;

            {
                this.f143115b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UserMigrationTermsScreen userMigrationTermsScreen = this.f143115b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserMigrationTermsScreen.R;
                        qji.b bVarU2 = userMigrationTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.user_migration.terms.di.UserMigrationTermsScreenInjector");
                        dd9.e eVar = ((dd9.f) bVarU2).f113145b;
                        dd9.h hVar = new dd9.h();
                        hVar.f113150a = e4m.b.b(new d9g.a(eVar, hVar));
                        return hVar;
                    case 1:
                        KProperty[] kPropertyArr2 = UserMigrationTermsScreen.R;
                        return (f) ((dd9.h) userMigrationTermsScreen.M.getValue()).f113150a.get();
                    default:
                        KProperty[] kPropertyArr3 = UserMigrationTermsScreen.R;
                        UserMigrationTermsScreen userMigrationTermsScreen2 = this.f143115b;
                        return dli.f.a(userMigrationTermsScreen2, (f) userMigrationTermsScreen2.N.getValue(), u.c((RowDelegate) userMigrationTermsScreen2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f213612b.setButtonEnabled(uiState.f143119b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (dd9.h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f213613c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.user_migration_terms_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.user_migration_terms_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        FooterActionButtonView footerActionButtonView = d3().f213612b;
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.user_migration_terms_agree, null, null, 14));
        footerActionButtonView.setDescription(new TextLocalisedClause(R$string.user_migration_terms_disclaimer, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f213613c.f59410q), null, new gd9.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f213612b.f0()), null, new gd9.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new gd9.c(this, null), 3);
    }

    public final c d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
