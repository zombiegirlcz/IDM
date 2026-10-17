package com.revolut.feature.defi.exchange.impl.ui.exchange_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.j8;
import cli.o;
import cli.q;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.defi.exchange.impl.R$layout;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountScreen;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyh.c;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import vc.s;
import vkm.z1;
import vy5.d0;
import x36.b;
import x36.d;
import x36.f;
import x36.i;
import x36.j;
import x36.k;
import x36.l;
import x36.r;
import x36.y;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/DeFiExchangeAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx36/b;", "Ldli/a;", "Lx36/d;", "Lkyh/c;", "Companion", "a", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiExchangeAmountScreen extends ViewController<b> implements dli.a, c {
    public final DeFiExchangeAmountContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final z1 Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DeFiExchangeAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/defi/exchange/impl/databinding/ScreenDefiExchangeAmountBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public DeFiExchangeAmountScreen(DeFiExchangeAmountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_defi_exchange_amount;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: x36.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeAmountScreen f302666b;

            {
                this.f302666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiExchangeAmountScreen deFiExchangeAmountScreen = this.f302666b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeAmountScreen.T;
                        qji.b bVarU2 = deFiExchangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_amount.di.DeFiExchangeAmountScreenInjector");
                        r36.f fVar = (r36.f) bVarU2;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = deFiExchangeAmountScreen.K;
                        deFiExchangeAmountContract$InputData.getClass();
                        return new r36.c(eVar, fVar2, deFiExchangeAmountScreen, deFiExchangeAmountContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeAmountScreen.T;
                        return (c) ((r36.c) deFiExchangeAmountScreen.M.getValue()).k.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiExchangeAmountScreen.T;
                        return (KeyboardSuggestionsControllerExtension) ((r36.c) deFiExchangeAmountScreen.M.getValue()).f251161h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = DeFiExchangeAmountScreen.T;
                        return new CenteredAmountDelegate(new x2g.b(deFiExchangeAmountScreen, 1));
                    default:
                        KProperty[] kPropertyArr5 = DeFiExchangeAmountScreen.T;
                        DeFiExchangeAmountScreen deFiExchangeAmountScreen2 = this.f302666b;
                        return dli.f.a(deFiExchangeAmountScreen2, deFiExchangeAmountScreen2.d(), zhm.u.c((CenteredAmountDelegate) deFiExchangeAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: x36.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeAmountScreen f302666b;

            {
                this.f302666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiExchangeAmountScreen deFiExchangeAmountScreen = this.f302666b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeAmountScreen.T;
                        qji.b bVarU2 = deFiExchangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_amount.di.DeFiExchangeAmountScreenInjector");
                        r36.f fVar = (r36.f) bVarU2;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = deFiExchangeAmountScreen.K;
                        deFiExchangeAmountContract$InputData.getClass();
                        return new r36.c(eVar, fVar2, deFiExchangeAmountScreen, deFiExchangeAmountContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeAmountScreen.T;
                        return (c) ((r36.c) deFiExchangeAmountScreen.M.getValue()).k.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiExchangeAmountScreen.T;
                        return (KeyboardSuggestionsControllerExtension) ((r36.c) deFiExchangeAmountScreen.M.getValue()).f251161h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = DeFiExchangeAmountScreen.T;
                        return new CenteredAmountDelegate(new x2g.b(deFiExchangeAmountScreen, 1));
                    default:
                        KProperty[] kPropertyArr5 = DeFiExchangeAmountScreen.T;
                        DeFiExchangeAmountScreen deFiExchangeAmountScreen2 = this.f302666b;
                        return dli.f.a(deFiExchangeAmountScreen2, deFiExchangeAmountScreen2.d(), zhm.u.c((CenteredAmountDelegate) deFiExchangeAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = s.t(this, f.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: x36.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeAmountScreen f302666b;

            {
                this.f302666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiExchangeAmountScreen deFiExchangeAmountScreen = this.f302666b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeAmountScreen.T;
                        qji.b bVarU2 = deFiExchangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_amount.di.DeFiExchangeAmountScreenInjector");
                        r36.f fVar = (r36.f) bVarU2;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = deFiExchangeAmountScreen.K;
                        deFiExchangeAmountContract$InputData.getClass();
                        return new r36.c(eVar, fVar2, deFiExchangeAmountScreen, deFiExchangeAmountContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeAmountScreen.T;
                        return (c) ((r36.c) deFiExchangeAmountScreen.M.getValue()).k.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiExchangeAmountScreen.T;
                        return (KeyboardSuggestionsControllerExtension) ((r36.c) deFiExchangeAmountScreen.M.getValue()).f251161h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = DeFiExchangeAmountScreen.T;
                        return new CenteredAmountDelegate(new x2g.b(deFiExchangeAmountScreen, 1));
                    default:
                        KProperty[] kPropertyArr5 = DeFiExchangeAmountScreen.T;
                        DeFiExchangeAmountScreen deFiExchangeAmountScreen2 = this.f302666b;
                        return dli.f.a(deFiExchangeAmountScreen2, deFiExchangeAmountScreen2.d(), zhm.u.c((CenteredAmountDelegate) deFiExchangeAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = ta6.a.a(0);
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: x36.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeAmountScreen f302666b;

            {
                this.f302666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DeFiExchangeAmountScreen deFiExchangeAmountScreen = this.f302666b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeAmountScreen.T;
                        qji.b bVarU2 = deFiExchangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_amount.di.DeFiExchangeAmountScreenInjector");
                        r36.f fVar = (r36.f) bVarU2;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = deFiExchangeAmountScreen.K;
                        deFiExchangeAmountContract$InputData.getClass();
                        return new r36.c(eVar, fVar2, deFiExchangeAmountScreen, deFiExchangeAmountContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeAmountScreen.T;
                        return (c) ((r36.c) deFiExchangeAmountScreen.M.getValue()).k.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiExchangeAmountScreen.T;
                        return (KeyboardSuggestionsControllerExtension) ((r36.c) deFiExchangeAmountScreen.M.getValue()).f251161h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = DeFiExchangeAmountScreen.T;
                        return new CenteredAmountDelegate(new x2g.b(deFiExchangeAmountScreen, 1));
                    default:
                        KProperty[] kPropertyArr5 = DeFiExchangeAmountScreen.T;
                        DeFiExchangeAmountScreen deFiExchangeAmountScreen2 = this.f302666b;
                        return dli.f.a(deFiExchangeAmountScreen2, deFiExchangeAmountScreen2.d(), zhm.u.c((CenteredAmountDelegate) deFiExchangeAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: x36.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiExchangeAmountScreen f302666b;

            {
                this.f302666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                DeFiExchangeAmountScreen deFiExchangeAmountScreen = this.f302666b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiExchangeAmountScreen.T;
                        qji.b bVarU2 = deFiExchangeAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.exchange_amount.di.DeFiExchangeAmountScreenInjector");
                        r36.f fVar = (r36.f) bVarU2;
                        r36.e eVar = fVar.f251183b;
                        r36.f fVar2 = fVar.f251184c;
                        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = deFiExchangeAmountScreen.K;
                        deFiExchangeAmountContract$InputData.getClass();
                        return new r36.c(eVar, fVar2, deFiExchangeAmountScreen, deFiExchangeAmountContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiExchangeAmountScreen.T;
                        return (c) ((r36.c) deFiExchangeAmountScreen.M.getValue()).k.get();
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiExchangeAmountScreen.T;
                        return (KeyboardSuggestionsControllerExtension) ((r36.c) deFiExchangeAmountScreen.M.getValue()).f251161h.get();
                    case 3:
                        KProperty[] kPropertyArr4 = DeFiExchangeAmountScreen.T;
                        return new CenteredAmountDelegate(new x2g.b(deFiExchangeAmountScreen, 1));
                    default:
                        KProperty[] kPropertyArr5 = DeFiExchangeAmountScreen.T;
                        DeFiExchangeAmountScreen deFiExchangeAmountScreen2 = this.f302666b;
                        return dli.f.a(deFiExchangeAmountScreen2, deFiExchangeAmountScreen2.d(), zhm.u.c((CenteredAmountDelegate) deFiExchangeAmountScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j8 j8Var = uiState.f302664c;
        NavBarWithAvatar navBarWithAvatar = d3().f232692c;
        Intrinsics.checkNotNullExpressionValue(navBarWithAvatar, "navBarWithAvatar");
        navBarWithAvatar.setModel(j8Var);
        d3().f232691b.setEnabled(uiState.f302663b);
        ((KeyboardSuggestionsControllerExtension) this.P.getValue()).S("defi_exchange_amount", uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kyh.c
    public final vkm.d C1() {
        return e.b(((CenteredAmountDelegate) this.R.getValue()).f.f121375b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r36.c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f232692c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f232691b;
        largeActionButton.setVisibility(0);
        largeActionButton.setText(new TextLocalisedClause(R$string.cryptobuysell_editor_review_order, null, null, 14));
        largeActionButton.setEnabled(false);
    }

    @Override // kyh.c
    public final void Z() {
        y yVar = (y) d();
        yVar.getClass();
        yVar.n2(new r(yVar, null, 6), new whi.b(6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((KeyboardSuggestionsControllerExtension) this.P.getValue()).S("defi_exchange_amount", f0.f322471a);
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e.b(d3().f232692c.f59338a), new i(this, continuation, 0), 3);
        ViewController.P2(this, e.b(d3().f232692c.f59343j), new i(this, continuation, 1), 3);
        ViewController.P2(this, e.b(d3().f232691b.o), new i(this, continuation, 2), 3);
        ?? r87 = this.R;
        ViewController.P2(this, vkm.q.J(e.b(((CenteredAmountDelegate) r87.getValue()).f51965h.f121375b), e.b(((CenteredAmountDelegate) r87.getValue()).i.f121375b)), new j(this, null), 3);
        ViewController.P2(this, this.Q, new k(this, null), 3);
        ViewController.P2(this, e.b(((CenteredAmountDelegate) r87.getValue()).e.f121375b), new l(this, null), 3);
        ViewController.P2(this, new d0(((KeyboardSuggestionsControllerExtension) this.P.getValue()).R("defi_exchange_amount"), 15), new wuh.q(this, continuation, 25), 3);
    }

    public final p36.a d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p36.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x36.c d() {
        return (x36.c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
