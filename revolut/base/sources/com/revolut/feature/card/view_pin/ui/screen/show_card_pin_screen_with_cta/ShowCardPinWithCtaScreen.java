package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ShowPinDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card.view_pin.R$id;
import com.revolut.feature.card.view_pin.R$layout;
import com.revolut.feature.card.view_pin.api.R$string;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import iwh.l;
import java.util.List;
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
import yk6.m;
import yv2.i;
import yv2.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/a;", "Ltki/c;", "Lyv2/i;", "Lin0/g;", "Companion", "a", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShowCardPinWithCtaScreen extends ViewController<a> implements tki.c, g {
    public final ShowCardPinWithCtaScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ShowCardPinWithCtaScreen.class, "binding", "getBinding()Lcom/revolut/feature/card/view_pin/databinding/ScreenShowCardPinWithCtaBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ShowCardPinWithCtaScreen(ShowCardPinWithCtaScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_show_card_pin_with_cta;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowCardPinWithCtaScreen f317099b;

            {
                this.f317099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShowCardPinWithCtaScreen showCardPinWithCtaScreen = this.f317099b;
                switch (i2) {
                    case 0:
                        ShowCardPinWithCtaScreen.Companion companion = ShowCardPinWithCtaScreen.INSTANCE;
                        qji.b bVarU2 = showCardPinWithCtaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.di.ShowCardPinWithCtaScreenInjector");
                        iwh.e eVar = (iwh.e) ((kwh.a) bVarU2);
                        iwh.c cVar = eVar.f169098b;
                        iwh.e eVar2 = eVar.f169099c;
                        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = showCardPinWithCtaScreen.K;
                        showCardPinWithCtaScreenContract$InputData.getClass();
                        return new iwh.l(cVar, eVar2, showCardPinWithCtaScreenContract$InputData);
                    case 1:
                        ShowCardPinWithCtaScreen.Companion companion2 = ShowCardPinWithCtaScreen.INSTANCE;
                        return (h) ((iwh.l) showCardPinWithCtaScreen.M.getValue()).f169116c.get();
                    default:
                        ShowCardPinWithCtaScreen.Companion companion3 = ShowCardPinWithCtaScreen.INSTANCE;
                        ShowCardPinWithCtaScreen showCardPinWithCtaScreen2 = this.f317099b;
                        return tki.g.a(showCardPinWithCtaScreen2, (h) showCardPinWithCtaScreen2.N.getValue(), v.k(new NewRevolutCardDelegate(kli.a.k(((c90.c) ((iwh.l) showCardPinWithCtaScreen2.M.getValue()).f169115b.f169094j.get()).f22265a, 170.0f)), new ShowPinDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.showCardPinWithCta_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowCardPinWithCtaScreen f317099b;

            {
                this.f317099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShowCardPinWithCtaScreen showCardPinWithCtaScreen = this.f317099b;
                switch (i22) {
                    case 0:
                        ShowCardPinWithCtaScreen.Companion companion = ShowCardPinWithCtaScreen.INSTANCE;
                        qji.b bVarU2 = showCardPinWithCtaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.di.ShowCardPinWithCtaScreenInjector");
                        iwh.e eVar = (iwh.e) ((kwh.a) bVarU2);
                        iwh.c cVar = eVar.f169098b;
                        iwh.e eVar2 = eVar.f169099c;
                        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = showCardPinWithCtaScreen.K;
                        showCardPinWithCtaScreenContract$InputData.getClass();
                        return new iwh.l(cVar, eVar2, showCardPinWithCtaScreenContract$InputData);
                    case 1:
                        ShowCardPinWithCtaScreen.Companion companion2 = ShowCardPinWithCtaScreen.INSTANCE;
                        return (h) ((iwh.l) showCardPinWithCtaScreen.M.getValue()).f169116c.get();
                    default:
                        ShowCardPinWithCtaScreen.Companion companion3 = ShowCardPinWithCtaScreen.INSTANCE;
                        ShowCardPinWithCtaScreen showCardPinWithCtaScreen2 = this.f317099b;
                        return tki.g.a(showCardPinWithCtaScreen2, (h) showCardPinWithCtaScreen2.N.getValue(), v.k(new NewRevolutCardDelegate(kli.a.k(((c90.c) ((iwh.l) showCardPinWithCtaScreen2.M.getValue()).f169115b.f169094j.get()).f22265a, 170.0f)), new ShowPinDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.showCardPinWithCta_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShowCardPinWithCtaScreen f317099b;

            {
                this.f317099b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShowCardPinWithCtaScreen showCardPinWithCtaScreen = this.f317099b;
                switch (i22) {
                    case 0:
                        ShowCardPinWithCtaScreen.Companion companion = ShowCardPinWithCtaScreen.INSTANCE;
                        qji.b bVarU2 = showCardPinWithCtaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.di.ShowCardPinWithCtaScreenInjector");
                        iwh.e eVar = (iwh.e) ((kwh.a) bVarU2);
                        iwh.c cVar = eVar.f169098b;
                        iwh.e eVar2 = eVar.f169099c;
                        ShowCardPinWithCtaScreenContract$InputData showCardPinWithCtaScreenContract$InputData = showCardPinWithCtaScreen.K;
                        showCardPinWithCtaScreenContract$InputData.getClass();
                        return new iwh.l(cVar, eVar2, showCardPinWithCtaScreenContract$InputData);
                    case 1:
                        ShowCardPinWithCtaScreen.Companion companion2 = ShowCardPinWithCtaScreen.INSTANCE;
                        return (h) ((iwh.l) showCardPinWithCtaScreen.M.getValue()).f169116c.get();
                    default:
                        ShowCardPinWithCtaScreen.Companion companion3 = ShowCardPinWithCtaScreen.INSTANCE;
                        ShowCardPinWithCtaScreen showCardPinWithCtaScreen2 = this.f317099b;
                        return tki.g.a(showCardPinWithCtaScreen2, (h) showCardPinWithCtaScreen2.N.getValue(), v.k(new NewRevolutCardDelegate(kli.a.k(((c90.c) ((iwh.l) showCardPinWithCtaScreen2.M.getValue()).f169115b.f169094j.get()).f22265a, 170.0f)), new ShowPinDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.showCardPinWithCta_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, yv2.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        sv2.c cVarD3 = d3();
        FooterTextView footerTextView = cVarD3.f265834c;
        LargeActionButton showCardPinWithCtaButton = cVarD3.f265833b;
        Clause clause = uiState.f317109b;
        boolean z = uiState.f317112h;
        footerTextView.setTextClause(clause);
        NavBarWithToolbar navBarWithToolbar = cVarD3.d;
        navBarWithToolbar.setTitle(uiState.f317110c, null);
        Clause clause2 = uiState.d;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        if (z) {
            showCardPinWithCtaButton.setText(uiState.e);
            showCardPinWithCtaButton.setIcon(uiState.f);
            showCardPinWithCtaButton.L(uiState.i);
        }
        Intrinsics.checkNotNullExpressionValue(showCardPinWithCtaButton, "showCardPinWithCtaButton");
        showCardPinWithCtaButton.setVisibility(z ? 0 : 8);
        showCardPinWithCtaButton.setEnabled(uiState.f317111g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((e) ((yv2.h) this.N.getValue())).J2(j.f317113a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yv2.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        sv2.c cVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = cVarD3.d;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        LargeActionButton largeActionButton = cVarD3.f265833b;
        largeActionButton.setText(new TextLocalisedClause(R$string.card_view_pin_card_unblocked_action, null, null, 14));
        largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new yph.b(rd0.e.b(d3().d.f59410q), 12), new yph.b(rd0.e.b(d3().d.p0()), 13), new yph.b(rd0.e.b(d3().f265833b.o), 14)), new m(this, (Continuation) null, 18), 3);
    }

    public final sv2.c d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (sv2.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
