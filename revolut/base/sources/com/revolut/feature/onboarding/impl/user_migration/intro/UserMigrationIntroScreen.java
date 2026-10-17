package com.revolut.feature.onboarding.impl.user_migration.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.user_migration.intro.UserMigrationIntroScreen;
import com.revolut.feature.onboarding.impl.user_migration.intro.UserMigrationIntroScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ed9.b;
import ed9.c;
import ed9.d;
import ed9.e;
import ed9.f;
import ed9.g;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/user_migration/intro/UserMigrationIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Led9/d;", "Ldli/a;", "Led9/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserMigrationIntroScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(UserMigrationIntroScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final UserMigrationIntroScreenContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final SimpleMediaDelegate N;
    public final ListSubheaderDelegate O;
    public final int P;
    public final boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public UserMigrationIntroScreen(UserMigrationIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new SimpleMediaDelegate();
        this.O = new ListSubheaderDelegate();
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        this.Q = true;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ed9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationIntroScreen f124951b;

            {
                this.f124951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UserMigrationIntroScreen userMigrationIntroScreen = this.f124951b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UserMigrationIntroScreen.U;
                        qji.b bVarU2 = userMigrationIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.user_migration.intro.di.UserMigrationIntroScreenInjector");
                        dd9.f fVar = (dd9.f) bVarU2;
                        dd9.e eVar = fVar.f113145b;
                        dd9.f fVar2 = fVar.f113146c;
                        UserMigrationIntroScreenContract$InputData userMigrationIntroScreenContract$InputData = userMigrationIntroScreen.K;
                        userMigrationIntroScreenContract$InputData.getClass();
                        return new dd9.g(eVar, fVar2, userMigrationIntroScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserMigrationIntroScreen.U;
                        return (e) ((dd9.g) userMigrationIntroScreen.R.getValue()).f113149c.get();
                    default:
                        KProperty[] kPropertyArr3 = UserMigrationIntroScreen.U;
                        UserMigrationIntroScreen userMigrationIntroScreen2 = this.f124951b;
                        return dli.f.a(userMigrationIntroScreen2, (e) userMigrationIntroScreen2.S.getValue(), v.k(userMigrationIntroScreen2.M, userMigrationIntroScreen2.N, userMigrationIntroScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ed9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationIntroScreen f124951b;

            {
                this.f124951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UserMigrationIntroScreen userMigrationIntroScreen = this.f124951b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserMigrationIntroScreen.U;
                        qji.b bVarU2 = userMigrationIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.user_migration.intro.di.UserMigrationIntroScreenInjector");
                        dd9.f fVar = (dd9.f) bVarU2;
                        dd9.e eVar = fVar.f113145b;
                        dd9.f fVar2 = fVar.f113146c;
                        UserMigrationIntroScreenContract$InputData userMigrationIntroScreenContract$InputData = userMigrationIntroScreen.K;
                        userMigrationIntroScreenContract$InputData.getClass();
                        return new dd9.g(eVar, fVar2, userMigrationIntroScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserMigrationIntroScreen.U;
                        return (e) ((dd9.g) userMigrationIntroScreen.R.getValue()).f113149c.get();
                    default:
                        KProperty[] kPropertyArr3 = UserMigrationIntroScreen.U;
                        UserMigrationIntroScreen userMigrationIntroScreen2 = this.f124951b;
                        return dli.f.a(userMigrationIntroScreen2, (e) userMigrationIntroScreen2.S.getValue(), v.k(userMigrationIntroScreen2.M, userMigrationIntroScreen2.N, userMigrationIntroScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: ed9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationIntroScreen f124951b;

            {
                this.f124951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UserMigrationIntroScreen userMigrationIntroScreen = this.f124951b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UserMigrationIntroScreen.U;
                        qji.b bVarU2 = userMigrationIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.user_migration.intro.di.UserMigrationIntroScreenInjector");
                        dd9.f fVar = (dd9.f) bVarU2;
                        dd9.e eVar = fVar.f113145b;
                        dd9.f fVar2 = fVar.f113146c;
                        UserMigrationIntroScreenContract$InputData userMigrationIntroScreenContract$InputData = userMigrationIntroScreen.K;
                        userMigrationIntroScreenContract$InputData.getClass();
                        return new dd9.g(eVar, fVar2, userMigrationIntroScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserMigrationIntroScreen.U;
                        return (e) ((dd9.g) userMigrationIntroScreen.R.getValue()).f113149c.get();
                    default:
                        KProperty[] kPropertyArr3 = UserMigrationIntroScreen.U;
                        UserMigrationIntroScreen userMigrationIntroScreen2 = this.f124951b;
                        return dli.f.a(userMigrationIntroScreen2, (e) userMigrationIntroScreen2.S.getValue(), v.k(userMigrationIntroScreen2.M, userMigrationIntroScreen2.N, userMigrationIntroScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(uiState.f124954a);
        navBarWithToolbar.setTitle(uiState.f124954a, null);
        Clause clause = uiState.f124955b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((g) ((e) this.S.getValue())).C2(d.a.f124952a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (dd9.g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        d3().f174564b.setText(new TextLocalisedClause(R$string.user_migration_fr_branch_intro_prompt_action_update_info, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
