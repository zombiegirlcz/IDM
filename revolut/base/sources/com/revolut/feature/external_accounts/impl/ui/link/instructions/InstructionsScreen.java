package com.revolut.feature.external_accounts.impl.ui.link.instructions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.ui.link.instructions.InstructionsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import gn6.b;
import gn6.c;
import gn6.e;
import gn6.f;
import gn6.g;
import jii.x;
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
import we6.g0;
import xf6.t;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/instructions/InstructionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/g0;", "Ldli/a;", "Lgn6/g;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstructionsScreen extends ViewController<g0> implements a {
    public final e K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(InstructionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.link.instructions.InstructionsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InstructionsScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstructionsScreen f144914b;

            {
                this.f144914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstructionsScreen instructionsScreen = this.f144914b;
                switch (i2) {
                    case 0:
                        InstructionsScreen.Companion companion = InstructionsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(instructionsScreen.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        e eVar = instructionsScreen.K;
                        eVar.getClass();
                        return new xf6.w(tVar, eVar);
                    case 1:
                        InstructionsScreen.Companion companion2 = InstructionsScreen.INSTANCE;
                        return (f) ((xf6.w) instructionsScreen.N.getValue()).f305127c.get();
                    default:
                        InstructionsScreen.Companion companion3 = InstructionsScreen.INSTANCE;
                        InstructionsScreen instructionsScreen2 = this.f144914b;
                        return dli.f.a(instructionsScreen2, (f) instructionsScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstructionsScreen f144914b;

            {
                this.f144914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstructionsScreen instructionsScreen = this.f144914b;
                switch (i22) {
                    case 0:
                        InstructionsScreen.Companion companion = InstructionsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(instructionsScreen.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        e eVar = instructionsScreen.K;
                        eVar.getClass();
                        return new xf6.w(tVar, eVar);
                    case 1:
                        InstructionsScreen.Companion companion2 = InstructionsScreen.INSTANCE;
                        return (f) ((xf6.w) instructionsScreen.N.getValue()).f305127c.get();
                    default:
                        InstructionsScreen.Companion companion3 = InstructionsScreen.INSTANCE;
                        InstructionsScreen instructionsScreen2 = this.f144914b;
                        return dli.f.a(instructionsScreen2, (f) instructionsScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: gn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstructionsScreen f144914b;

            {
                this.f144914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstructionsScreen instructionsScreen = this.f144914b;
                switch (i22) {
                    case 0:
                        InstructionsScreen.Companion companion = InstructionsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(instructionsScreen.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        e eVar = instructionsScreen.K;
                        eVar.getClass();
                        return new xf6.w(tVar, eVar);
                    case 1:
                        InstructionsScreen.Companion companion2 = InstructionsScreen.INSTANCE;
                        return (f) ((xf6.w) instructionsScreen.N.getValue()).f305127c.get();
                    default:
                        InstructionsScreen.Companion companion3 = InstructionsScreen.INSTANCE;
                        InstructionsScreen instructionsScreen2 = this.f144914b;
                        return dli.f.a(instructionsScreen2, (f) instructionsScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = d3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        TextClause textClause = uiState.f144921b;
        Clause clause = uiState.e;
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(textClause, null);
        d3().f174574c.setToolbarTitle(textClause);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        Clause clause2 = uiState.f144922c;
        navBarWithToolbar.setSecondDescriptionText(clause2);
        d3().f174574c.setSecondDescriptionVisible(clause2 != null);
        d3().f174574c.setEndIconImage(uiState.d);
        d3().e.setText(clause);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(clause == null ? 8 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (xf6.w) this.N.getValue();
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
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f174573b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
        d3().f174573b.setLoadingButtonTag("CONTINUE_LOADING_TAG");
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new c(this, continuation, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
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
