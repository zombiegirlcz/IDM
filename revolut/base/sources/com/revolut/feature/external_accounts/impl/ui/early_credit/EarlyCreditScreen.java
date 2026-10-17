package com.revolut.feature.external_accounts.impl.ui.early_credit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import cm6.b;
import cm6.c;
import cm6.e;
import cm6.f;
import cm6.g;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.early_credit.EarlyCreditScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import we6.t;
import xf6.m1;
import xf6.n1;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/early_credit/EarlyCreditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/t;", "Ldli/a;", "Lcm6/g;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarlyCreditScreen extends ViewController<t> implements a {
    public final e K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EarlyCreditScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.early_credit.EarlyCreditScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public EarlyCreditScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_two_buttons;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: cm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarlyCreditScreen f25148b;

            {
                this.f25148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EarlyCreditScreen earlyCreditScreen = this.f25148b;
                switch (i2) {
                    case 0:
                        EarlyCreditScreen.Companion companion = EarlyCreditScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(earlyCreditScreen.m2()).a().get(n1.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n1.class, " is not found"));
                        }
                        n1 n1Var = ((n1) aVar2.b()).f304963h;
                        e eVar = earlyCreditScreen.K;
                        eVar.getClass();
                        return new m1(n1Var, earlyCreditScreen, eVar);
                    case 1:
                        EarlyCreditScreen.Companion companion2 = EarlyCreditScreen.INSTANCE;
                        return (f) ((m1) earlyCreditScreen.N.getValue()).e.get();
                    default:
                        EarlyCreditScreen.Companion companion3 = EarlyCreditScreen.INSTANCE;
                        EarlyCreditScreen earlyCreditScreen2 = this.f25148b;
                        return dli.f.a(earlyCreditScreen2, (f) earlyCreditScreen2.O.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: cm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarlyCreditScreen f25148b;

            {
                this.f25148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EarlyCreditScreen earlyCreditScreen = this.f25148b;
                switch (i22) {
                    case 0:
                        EarlyCreditScreen.Companion companion = EarlyCreditScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(earlyCreditScreen.m2()).a().get(n1.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n1.class, " is not found"));
                        }
                        n1 n1Var = ((n1) aVar2.b()).f304963h;
                        e eVar = earlyCreditScreen.K;
                        eVar.getClass();
                        return new m1(n1Var, earlyCreditScreen, eVar);
                    case 1:
                        EarlyCreditScreen.Companion companion2 = EarlyCreditScreen.INSTANCE;
                        return (f) ((m1) earlyCreditScreen.N.getValue()).e.get();
                    default:
                        EarlyCreditScreen.Companion companion3 = EarlyCreditScreen.INSTANCE;
                        EarlyCreditScreen earlyCreditScreen2 = this.f25148b;
                        return dli.f.a(earlyCreditScreen2, (f) earlyCreditScreen2.O.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: cm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EarlyCreditScreen f25148b;

            {
                this.f25148b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EarlyCreditScreen earlyCreditScreen = this.f25148b;
                switch (i22) {
                    case 0:
                        EarlyCreditScreen.Companion companion = EarlyCreditScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(earlyCreditScreen.m2()).a().get(n1.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n1.class, " is not found"));
                        }
                        n1 n1Var = ((n1) aVar2.b()).f304963h;
                        e eVar = earlyCreditScreen.K;
                        eVar.getClass();
                        return new m1(n1Var, earlyCreditScreen, eVar);
                    case 1:
                        EarlyCreditScreen.Companion companion2 = EarlyCreditScreen.INSTANCE;
                        return (f) ((m1) earlyCreditScreen.N.getValue()).e.get();
                    default:
                        EarlyCreditScreen.Companion companion3 = EarlyCreditScreen.INSTANCE;
                        EarlyCreditScreen earlyCreditScreen2 = this.f25148b;
                        return dli.f.a(earlyCreditScreen2, (f) earlyCreditScreen2.O.getValue(), u.c(new SimpleMediaDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174562g;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_early_credit_consent_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.open_banking_early_credit_consent_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174560b.setText(new TextLocalisedClause(R$string.open_banking_early_credit_consent_primary_action, null, null, 14));
        d3().f174560b.setLoadingButtonTag("CONTINUE_LOADING_TAG");
        d3().f.setText(new TextLocalisedClause(R$string.open_banking_early_credit_consent_secondary_action, null, null, 14));
        d3().f.o(LargeActionButton.ButtonStyle.f58726b);
        d3().d.setTextClause(new TextLocalisedClause(R$string.open_banking_early_credit_consent_footer, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174562g.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174560b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f.o), null, new c(this, continuation, 2), 3);
    }

    public final jii.t d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.t) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
