package com.revolut.feature.card_screen.impl.kompot.cards_list.screen;

import a07.d;
import a32.g;
import a83.i;
import a83.j;
import a83.w;
import a83.y;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.impl.R$id;
import com.revolut.feature.card_screen.impl.R$layout;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ihm.b;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import ny0.l;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import rp0.z1;
import tki.c;
import vc.s;
import xv0.x;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/screen/CardListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La83/w;", "Ltki/c;", "La83/y;", "Lno/k;", "Ldte/c;", "Companion", "a", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardListScreen extends ViewController<w> implements c, k, dte.c {
    public final h K;
    public final int L;
    public final int M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final b S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final RateEmojiDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65465a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65466b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65467d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f65468e0;
    public AnalyticsContext f0;
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(CardListScreen.class, "binding", "getBinding()Lcom/revolut/feature/card_screen/impl/databinding/ScreenCardListBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CardListScreen(CardsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, a83.b.f);
        this.L = R$layout.screen_card_list;
        this.M = R$style.UiKitTheme_TransparentSlider;
        this.N = true;
        this.O = te0.w.y0(new a07.b(this, inputData, 13));
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: a83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardListScreen f2032b;

            {
                this.f2032b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                CardListScreen cardListScreen = this.f2032b;
                switch (i2) {
                    case 0:
                        CardListScreen.Companion companion = CardListScreen.INSTANCE;
                        return (x) cardListScreen.R1().u.get();
                    case 1:
                        CardListScreen.Companion companion2 = CardListScreen.INSTANCE;
                        CardListScreen cardListScreen2 = this.f2032b;
                        return tki.g.a(cardListScreen2, cardListScreen2.R2(), zhm.d0.E0(((fd6.a) cardListScreen2.R1().i.get()).e, zhm.v.k(cardListScreen2.g3(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardListScreen2.V.getValue(), cardListScreen2.Z, (TextDelegate) cardListScreen2.f65465a0.getValue(), (InputDisclosureDelegate) cardListScreen2.f65466b0.getValue(), (ActionWidgetDelegate) cardListScreen2.c0.getValue(), (MapPlainDelegate) cardListScreen2.f65467d0.getValue(), (MapPlainLoadingDelegate) cardListScreen2.f65468e0.getValue())), R$id.cardsListScreen_recyclerView, null, null, null, 56);
                    case 2:
                        CardListScreen.Companion companion3 = CardListScreen.INSTANCE;
                        return new tw0.n(new l(cardListScreen, i3));
                    default:
                        return new ItemTouchHelper((tw0.n) cardListScreen.R.getValue());
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: a83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardListScreen f2032b;

            {
                this.f2032b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                CardListScreen cardListScreen = this.f2032b;
                switch (i22) {
                    case 0:
                        CardListScreen.Companion companion = CardListScreen.INSTANCE;
                        return (x) cardListScreen.R1().u.get();
                    case 1:
                        CardListScreen.Companion companion2 = CardListScreen.INSTANCE;
                        CardListScreen cardListScreen2 = this.f2032b;
                        return tki.g.a(cardListScreen2, cardListScreen2.R2(), zhm.d0.E0(((fd6.a) cardListScreen2.R1().i.get()).e, zhm.v.k(cardListScreen2.g3(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardListScreen2.V.getValue(), cardListScreen2.Z, (TextDelegate) cardListScreen2.f65465a0.getValue(), (InputDisclosureDelegate) cardListScreen2.f65466b0.getValue(), (ActionWidgetDelegate) cardListScreen2.c0.getValue(), (MapPlainDelegate) cardListScreen2.f65467d0.getValue(), (MapPlainLoadingDelegate) cardListScreen2.f65468e0.getValue())), R$id.cardsListScreen_recyclerView, null, null, null, 56);
                    case 2:
                        CardListScreen.Companion companion3 = CardListScreen.INSTANCE;
                        return new tw0.n(new l(cardListScreen, i3));
                    default:
                        return new ItemTouchHelper((tw0.n) cardListScreen.R.getValue());
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: a83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardListScreen f2032b;

            {
                this.f2032b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                CardListScreen cardListScreen = this.f2032b;
                switch (i22) {
                    case 0:
                        CardListScreen.Companion companion = CardListScreen.INSTANCE;
                        return (x) cardListScreen.R1().u.get();
                    case 1:
                        CardListScreen.Companion companion2 = CardListScreen.INSTANCE;
                        CardListScreen cardListScreen2 = this.f2032b;
                        return tki.g.a(cardListScreen2, cardListScreen2.R2(), zhm.d0.E0(((fd6.a) cardListScreen2.R1().i.get()).e, zhm.v.k(cardListScreen2.g3(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardListScreen2.V.getValue(), cardListScreen2.Z, (TextDelegate) cardListScreen2.f65465a0.getValue(), (InputDisclosureDelegate) cardListScreen2.f65466b0.getValue(), (ActionWidgetDelegate) cardListScreen2.c0.getValue(), (MapPlainDelegate) cardListScreen2.f65467d0.getValue(), (MapPlainLoadingDelegate) cardListScreen2.f65468e0.getValue())), R$id.cardsListScreen_recyclerView, null, null, null, 56);
                    case 2:
                        CardListScreen.Companion companion3 = CardListScreen.INSTANCE;
                        return new tw0.n(new l(cardListScreen, i32));
                    default:
                        return new ItemTouchHelper((tw0.n) cardListScreen.R.getValue());
                }
            }
        });
        b bVarE = b.e(0);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.S = bVarE;
        final int i5 = 3;
        this.T = te0.w.y0(new Function0(this) { // from class: a83.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardListScreen f2032b;

            {
                this.f2032b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 0;
                CardListScreen cardListScreen = this.f2032b;
                switch (i22) {
                    case 0:
                        CardListScreen.Companion companion = CardListScreen.INSTANCE;
                        return (x) cardListScreen.R1().u.get();
                    case 1:
                        CardListScreen.Companion companion2 = CardListScreen.INSTANCE;
                        CardListScreen cardListScreen2 = this.f2032b;
                        return tki.g.a(cardListScreen2, cardListScreen2.R2(), zhm.d0.E0(((fd6.a) cardListScreen2.R1().i.get()).e, zhm.v.k(cardListScreen2.g3(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardListScreen2.V.getValue(), cardListScreen2.Z, (TextDelegate) cardListScreen2.f65465a0.getValue(), (InputDisclosureDelegate) cardListScreen2.f65466b0.getValue(), (ActionWidgetDelegate) cardListScreen2.c0.getValue(), (MapPlainDelegate) cardListScreen2.f65467d0.getValue(), (MapPlainLoadingDelegate) cardListScreen2.f65468e0.getValue())), R$id.cardsListScreen_recyclerView, null, null, null, 56);
                    case 2:
                        CardListScreen.Companion companion3 = CardListScreen.INSTANCE;
                        return new tw0.n(new l(cardListScreen, i32));
                    default:
                        return new ItemTouchHelper((tw0.n) cardListScreen.R.getValue());
                }
            }
        });
        this.U = te0.w.y0(new g(10));
        this.V = te0.w.y0(new g(11));
        this.W = te0.w.y0(new g(12));
        this.X = te0.w.y0(new g(13));
        this.Y = te0.w.y0(new g(14));
        this.Z = new RateEmojiDelegate();
        this.f65465a0 = te0.w.y0(new g(15));
        this.f65466b0 = te0.w.y0(new g(16));
        this.c0 = te0.w.y0(new g(17));
        this.f65467d0 = te0.w.y0(new g(18));
        this.f65468e0 = te0.w.y0(new g(19));
    }

    @Override // dte.c
    public final f A0() {
        return ((z1) R1().f319891t.get()).f256232c;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        y uiState = (y) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        this.f0 = uiState.f2097c;
        d3().f141086c.setMenuItems(uiState.f2096b);
        NavBarWithToolbar navBarWithToolbar = d3().f141086c;
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        ScreenContentRecyclerView cardsListScreenRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(cardsListScreenRecyclerView, "cardsListScreenRecyclerView");
        Context context = d3().f141084a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l.a(cardsListScreenRecyclerView, kli.a.w(uiState.e, context), "REACTIVATE_ITEM_BOTTOM_PADDING_TOKEN", 7);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getV() {
        return this.f0;
    }

    @Override // dte.c
    public final f S0() {
        return ((z1) R1().f319891t.get()).e;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((ItemTouchHelper) this.T.getValue()).attachToRecyclerView(d3().d);
        ((j60.a) R1().d.get()).d(v.k(g3(), (LargeActionButtonDelegate) this.X.getValue(), (CellDetailsDelegate) this.Y.getValue(), (PlainTextDelegate) this.W.getValue(), new ListCellDelegate(), new TextDelegate(), new ProgressStepsDelegate()));
        d3().f141086c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f141085b;
        largeActionButton.setText(new TextLocalisedClause(R$string.card_home_button_add_new, null, null, 14));
        largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlack), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 11;
        ViewController.P2(this, e.b(d3().f141086c.f59410q), new d(this, continuation, i), 3);
        ViewController.P2(this, e.b(g3().f53227t), new a83.k(this, null), 3);
        ViewController.P2(this, vkm.q.J(e.b(((FullScreenStateDelegate) this.V.getValue()).f52371h.f121375b), new a15.d(e.b(d3().f141086c.o.f57403b), 9), e.b(g3().f53218h), e.b(g3().f53220l), new a15.d(e.b(g3().f53226s), 10), e.b(((LargeActionButtonDelegate) this.X.getValue()).d.f121375b), new a15.d(e.b(d3().f141085b.o), i), new a15.d(e.b(((TextDelegate) this.f65465a0.getValue()).f53530c), 12), new a15.d(e.b(((InputDisclosureDelegate) this.f65466b0.getValue()).f52538c), 13), new a15.d(e.b(((MapPlainDelegate) this.f65467d0.getValue()).f52768c), 14)), new i(this, continuation, 5), 3);
        RateEmojiDelegate rateEmojiDelegate = this.Z;
        ViewController.P2(this, e.b(rateEmojiDelegate.f53143c), new i(this, continuation, 0), 3);
        ViewController.P2(this, e.b(rateEmojiDelegate.e), new i(this, continuation, 1), 3);
        ViewController.P2(this, e.b(rateEmojiDelegate.d), new i(this, continuation, 2), 3);
        d3().d.addOnScrollListener(new j(this));
        ScreenContentRecyclerView cardsListScreenRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(cardsListScreenRecyclerView, "cardsListScreenRecyclerView");
        ViewController.P2(this, e.b(te0.w.l(x.c(cardsListScreenRecyclerView, 7), this.S)), new i(this, continuation, 3), 3);
        ViewController.P2(this, e.b(((ActionWidgetDelegate) this.c0.getValue()).f51589c.f121375b), new i(this, continuation, 4), 3);
    }

    public final g73.a d3() {
        ViewBinding value = this.K.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (g73.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final z73.d R1() {
        return (z73.d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final a83.x e3() {
        return (a83.x) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RowDelegate g3() {
        return (RowDelegate) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }

    @Override // dte.c
    public final f v1() {
        return ((z1) R1().f319891t.get()).f256231b;
    }
}
