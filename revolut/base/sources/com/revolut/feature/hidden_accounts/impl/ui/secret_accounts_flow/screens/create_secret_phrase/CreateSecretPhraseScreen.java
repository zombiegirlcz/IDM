package com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.CreateSecretPhraseScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import q2e.i0;
import qb7.b;
import qb7.c;
import qb7.e;
import qb7.f;
import qb7.g;
import ta7.k;
import ta7.l;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/screens/create_secret_phrase/CreateSecretPhraseScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqb7/e;", "Ldli/a;", "Lqb7/f;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateSecretPhraseScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CreateSecretPhraseScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final h K = s.t(this, a.f);
    public final InputTextDelegate L = new InputTextDelegate(null);
    public final int O = R$layout.screen_recycler_navbar_nextbutton;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public CreateSecretPhraseScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateSecretPhraseScreen f244124b;

            {
                this.f244124b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreateSecretPhraseScreen createSecretPhraseScreen = this.f244124b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreateSecretPhraseScreen.Q;
                        l lVar = (l) createSecretPhraseScreen.N.getValue();
                        switch (lVar.f269144a) {
                            case 0:
                                return (g) lVar.f269145b.get();
                            default:
                                return (g) lVar.f269145b.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CreateSecretPhraseScreen.Q;
                        qji.b bVarU2 = createSecretPhraseScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.di.CreateSecretPhraseScreenInjector");
                        return (l) ((k) ((rb7.a) bVarU2).b().mo3808a(createSecretPhraseScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CreateSecretPhraseScreen.Q;
                        CreateSecretPhraseScreen createSecretPhraseScreen2 = this.f244124b;
                        return dli.f.a(createSecretPhraseScreen2, createSecretPhraseScreen2.R2(), zhm.u.c(createSecretPhraseScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateSecretPhraseScreen f244124b;

            {
                this.f244124b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreateSecretPhraseScreen createSecretPhraseScreen = this.f244124b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateSecretPhraseScreen.Q;
                        l lVar = (l) createSecretPhraseScreen.N.getValue();
                        switch (lVar.f269144a) {
                            case 0:
                                return (g) lVar.f269145b.get();
                            default:
                                return (g) lVar.f269145b.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CreateSecretPhraseScreen.Q;
                        qji.b bVarU2 = createSecretPhraseScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.di.CreateSecretPhraseScreenInjector");
                        return (l) ((k) ((rb7.a) bVarU2).b().mo3808a(createSecretPhraseScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CreateSecretPhraseScreen.Q;
                        CreateSecretPhraseScreen createSecretPhraseScreen2 = this.f244124b;
                        return dli.f.a(createSecretPhraseScreen2, createSecretPhraseScreen2.R2(), zhm.u.c(createSecretPhraseScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qb7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateSecretPhraseScreen f244124b;

            {
                this.f244124b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreateSecretPhraseScreen createSecretPhraseScreen = this.f244124b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateSecretPhraseScreen.Q;
                        l lVar = (l) createSecretPhraseScreen.N.getValue();
                        switch (lVar.f269144a) {
                            case 0:
                                return (g) lVar.f269145b.get();
                            default:
                                return (g) lVar.f269145b.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = CreateSecretPhraseScreen.Q;
                        qji.b bVarU2 = createSecretPhraseScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.di.CreateSecretPhraseScreenInjector");
                        return (l) ((k) ((rb7.a) bVarU2).b().mo3808a(createSecretPhraseScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CreateSecretPhraseScreen.Q;
                        CreateSecretPhraseScreen createSecretPhraseScreen2 = this.f244124b;
                        return dli.f.a(createSecretPhraseScreen2, createSecretPhraseScreen2.R2(), zhm.u.c(createSecretPhraseScreen2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f244130b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.hidden_accounts_secret_phrase_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.L;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new i0(this, (Continuation) null, 27), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
