package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ShowPinDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card.view_pin.R$id;
import com.revolut.feature.card.view_pin.R$layout;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import in0.g;
import iwh.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import wrj.m;
import wv2.b;
import wv2.c;
import wv2.e;
import wv2.f;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen/ShowCardPinScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwv2/e;", "Ldli/a;", "Lwv2/g;", "Lin0/g;", "Companion", "a", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShowCardPinScreen extends ViewController<e> implements a, g {
    public final int K;
    public final TextDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ShowCardPinScreen.class, "binding", "getBinding()Lcom/revolut/feature/card/view_pin/databinding/ScreenShowCardPinBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ShowCardPinScreen(ShowCardPinScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_show_card_pin;
        this.L = new TextDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowCardPinScreen f300269b;

            {
                this.f300269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                c90.c cVar;
                switch (i) {
                    case 0:
                        ShowCardPinScreen.Companion companion = ShowCardPinScreen.INSTANCE;
                        ShowCardPinScreen showCardPinScreen = this.f300269b;
                        f fVar = (f) showCardPinScreen.P.getValue();
                        iwh.j jVar = (iwh.j) showCardPinScreen.O.getValue();
                        switch (jVar.f169108a) {
                            case 0:
                                cVar = (c90.c) ((iwh.c) jVar.e).i.get();
                                break;
                            default:
                                cVar = (c90.c) ((uv2.a) jVar.e).d.get();
                                break;
                        }
                        return dli.f.a(showCardPinScreen, fVar, v.k(new NewRevolutCardDelegate((int) (cVar.c() * 0.8f)), new ShowPinDelegate(), showCardPinScreen.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.showCardPinScreen_recyclerView, null, null, null, 56);
                    default:
                        ShowCardPinScreen.Companion companion2 = ShowCardPinScreen.INSTANCE;
                        iwh.j jVar2 = (iwh.j) this.f300269b.O.getValue();
                        switch (jVar2.f169108a) {
                            case 0:
                                return (f) jVar2.d.get();
                            default:
                                return (f) jVar2.d.get();
                        }
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new m(this, inputData, 5));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowCardPinScreen f300269b;

            {
                this.f300269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                c90.c cVar;
                switch (i2) {
                    case 0:
                        ShowCardPinScreen.Companion companion = ShowCardPinScreen.INSTANCE;
                        ShowCardPinScreen showCardPinScreen = this.f300269b;
                        f fVar = (f) showCardPinScreen.P.getValue();
                        iwh.j jVar = (iwh.j) showCardPinScreen.O.getValue();
                        switch (jVar.f169108a) {
                            case 0:
                                cVar = (c90.c) ((iwh.c) jVar.e).i.get();
                                break;
                            default:
                                cVar = (c90.c) ((uv2.a) jVar.e).d.get();
                                break;
                        }
                        return dli.f.a(showCardPinScreen, fVar, v.k(new NewRevolutCardDelegate((int) (cVar.c() * 0.8f)), new ShowPinDelegate(), showCardPinScreen.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.showCardPinScreen_recyclerView, null, null, null, 56);
                    default:
                        ShowCardPinScreen.Companion companion2 = ShowCardPinScreen.INSTANCE;
                        iwh.j jVar2 = (iwh.j) this.f300269b.O.getValue();
                        switch (jVar2.f169108a) {
                            case 0:
                                return (f) jVar2.d.get();
                            default:
                                return (f) jVar2.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        wv2.g uiState = (wv2.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f300276b;
        if (clause != null) {
            NavBarWithToolbar showCardPinScreenNavBarWithToolbar = d3().f265831c;
            Intrinsics.checkNotNullExpressionValue(showCardPinScreenNavBarWithToolbar, "showCardPinScreenNavBarWithToolbar");
            showCardPinScreenNavBarWithToolbar.setTitle(clause, null);
        }
        d3().f265830b.setTextClause(uiState.f300277c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f265831c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f265831c.f59410q), null, new wkg.e(this, null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53530c), null, new c(this, null), 3);
    }

    public final sv2.b d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (sv2.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
