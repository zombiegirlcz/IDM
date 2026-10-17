package com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.y9;
import b9.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.AddProductDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardsCarouselDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.impl.R$layout;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.revolut.shared.cards.model.card_config.domain.VideoBackground;
import com.revolut.ui_kit.carousel_with_sheet.R$id;
import h30.q;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import no.k;
import org.jetbrains.annotations.NotNull;
import po0.n;
import t73.b0;
import t73.c0;
import t73.e0;
import t73.f0;
import t73.g0;
import t73.g1;
import t73.h1;
import t73.i;
import t73.i0;
import t73.i1;
import t73.j;
import t73.j0;
import t73.k0;
import t73.l;
import t73.l0;
import t73.m0;
import t73.n0;
import t73.q0;
import te0.w;
import tx0.d0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00030\u00052\u00020\u0006:\u0004\b\t\t\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreen;", "Lcom/revolut/cards/shared/ui/screen/BaseCardsCarouselScreen;", "Lt73/q0;", "Lt73/i1;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/a;", "Ltki/c;", "Lno/k;", "Companion", "a", "t73/i", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardsCarouselScreen extends BaseCardsCarouselScreen<q0, i1, a> implements tki.c, k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty[] E0;
    public static final int F0;
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public AnalyticsContext D0;
    public final CardsCarouselScreenContract$InputData R;
    public final h S;
    public final h T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65392a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65393b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65394d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f65395e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final BigTileDelegate f65396h0;
    public final ProgressStepsDelegate i0;
    public final ProductSelectionDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f65397k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Lazy f65398n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f65399o0;
    public final Object p0;
    public ValueAnimator q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final NewRevolutCardsCarouselDelegate f65400r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f65401s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f65402t0;
    public final j u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int f65403v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f65404w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f65405x0;
    public n1 y0;
    public final Object z0;

    /* JADX INFO: renamed from: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(CardsCarouselScreen.class, "oldBinding", "getOldBinding()Lcom/revolut/feature/card_screen/impl/databinding/ScreenCardsCarouselOldBinding;", 0);
        p0 p0Var = o0.f186429a;
        E0 = new KProperty[]{p0Var.j(h0Var), p.a.y(CardsCarouselScreen.class, "newBinding", "getNewBinding()Lcom/revolut/feature/card_screen/impl/databinding/ScreenCardsCarouselNewBinding;", 0, p0Var)};
        INSTANCE = new Companion();
        F0 = Color.parseColor("#212121");
    }

    public CardsCarouselScreen(CardsCarouselScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = inputData;
        this.S = s.t(this, l.f);
        this.T = s.t(this, t73.k.f);
        final int i = 7;
        this.U = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i2) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i22) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        this.W = w.y0(new szl.a(22));
        this.X = w.y0(new szl.a(23));
        this.Y = w.y0(new szl.a(24));
        this.Z = w.y0(new szl.a(25));
        this.f65392a0 = w.y0(new szl.a(26));
        this.f65393b0 = w.y0(new szl.a(27));
        this.c0 = w.y0(new szl.a(28));
        this.f65394d0 = w.y0(new szl.a(29));
        this.f65395e0 = w.y0(new t73.h(0));
        this.f0 = w.y0(new t73.h(1));
        final int i3 = 8;
        this.g0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i22) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        this.f65396h0 = new BigTileDelegate();
        this.i0 = new ProgressStepsDelegate();
        this.j0 = new ProductSelectionDelegate();
        this.f65397k0 = w.y0(new t73.h(2));
        this.l0 = w.y0(new t73.h(3));
        this.m0 = w.y0(new t73.h(4));
        this.f65398n0 = yhm.j.b(new t73.h(5));
        this.f65399o0 = w.y0(new t73.h(6));
        this.p0 = w.y0(new szl.a(21));
        this.f65400r0 = new NewRevolutCardsCarouselDelegate();
        final int i5 = 0;
        this.f65401s0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i22) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        final int i6 = 2;
        this.f65402t0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i22) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        this.u0 = new j(this);
        this.f65403v0 = inputData.e ? R$layout.screen_cards_carousel_new : R$layout.screen_cards_carousel_old;
        this.f65404w0 = R$id.cardsCarousel_recyclerView;
        this.f65405x0 = R$style.UiKitTheme_Transparent;
        final int i21 = 3;
        this.z0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i22) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        final int i22 = 4;
        this.A0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i222) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        final int i32 = 5;
        this.B0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i32;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i222) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
        final int i33 = 6;
        this.C0 = w.y0(new Function0(this) { // from class: t73.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsCarouselScreen f268468b;

            {
                this.f268468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i33;
                CardsCarouselScreen cardsCarouselScreen = this.f268468b;
                switch (i222) {
                    case 0:
                        CardsCarouselScreen.Companion companion = CardsCarouselScreen.INSTANCE;
                        return zhm.d0.E0(((fd6.a) cardsCarouselScreen.R1().f222680j.get()).e, zhm.v.k(new RowLoadingDelegate(), new PlaceholderRowDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new ActionWidgetLoadingDelegate(), (CellDetailsActionDelegate) cardsCarouselScreen.X.getValue(), (AddProductDelegate) cardsCarouselScreen.Y.getValue(), (RowDelegate) cardsCarouselScreen.Z.getValue(), (CellDetailsNoteDelegate) cardsCarouselScreen.f65392a0.getValue(), (PlainTextWarningDelegate) cardsCarouselScreen.f65393b0.getValue(), (PermissionDelegate) cardsCarouselScreen.c0.getValue(), (CircleActionButtonsBarDelegate) cardsCarouselScreen.f65394d0.getValue(), (ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue(), (ScrollerDelegate) cardsCarouselScreen.g0.getValue(), cardsCarouselScreen.f65396h0, cardsCarouselScreen.i0, (LargeActionButtonDelegate) cardsCarouselScreen.W.getValue(), cardsCarouselScreen.j0));
                    case 1:
                        CardsCarouselScreen.Companion companion2 = CardsCarouselScreen.INSTANCE;
                        return new NewRevolutCardLoadingDelegate(rim.d.c(((c90.c) cardsCarouselScreen.R1().f222689w.get()).c() * 0.92f));
                    case 2:
                        CardsCarouselScreen.Companion companion3 = CardsCarouselScreen.INSTANCE;
                        return (j60.a) cardsCarouselScreen.R1().f222678g.get();
                    case 3:
                        CardsCarouselScreen.Companion companion4 = CardsCarouselScreen.INSTANCE;
                        qji.b bVarU2 = cardsCarouselScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.di.CardsCarouselScreenInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        CardsCarouselScreenContract$InputData cardsCarouselScreenContract$InputData = cardsCarouselScreen.R;
                        cardsCarouselScreenContract$InputData.getClass();
                        return new o73.g(eVar, fVar2, cardsCarouselScreen, cardsCarouselScreenContract$InputData);
                    case 4:
                        CardsCarouselScreen.Companion companion5 = CardsCarouselScreen.INSTANCE;
                        return (g1) cardsCarouselScreen.R1().z.get();
                    case 5:
                        CardsCarouselScreen.Companion companion6 = CardsCarouselScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) cardsCarouselScreen.Z.getValue(), (NewRevolutCardLoadingDelegate) cardsCarouselScreen.V.getValue(), cardsCarouselScreen.f65400r0);
                    case 6:
                        CardsCarouselScreen.Companion companion7 = CardsCarouselScreen.INSTANCE;
                        CardsCarouselScreen cardsCarouselScreen2 = this.f268468b;
                        return tki.g.a(cardsCarouselScreen2, (g1) cardsCarouselScreen2.R1().z.get(), cardsCarouselScreen2.l3(), cardsCarouselScreen2.f65404w0, null, cardsCarouselScreen2.P, null, 40);
                    case 7:
                        KProperty[] kPropertyArr = CardsCarouselScreen.E0;
                        if (cardsCarouselScreen.R.e) {
                            ViewBinding value = cardsCarouselScreen.T.getValue(cardsCarouselScreen, kPropertyArr[1]);
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            return new i((g73.c) value);
                        }
                        ViewBinding value2 = cardsCarouselScreen.S.getValue(cardsCarouselScreen, kPropertyArr[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return new i((g73.d) value2);
                    default:
                        CardsCarouselScreen.Companion companion8 = CardsCarouselScreen.INSTANCE;
                        return new ScrollerDelegate(zhm.v.k((ActionWidgetDelegate) cardsCarouselScreen.f65395e0.getValue(), (BannerDelegate) cardsCarouselScreen.f0.getValue()), false);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.f65405x0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!(this.R.d instanceof CardScreenAction.VirtualCardDesignChanged)) {
            return super.F2();
        }
        ((g) R2()).C2(a.C0465a.f65416a);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.D0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getD0() {
        return this.D0;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        v73.j jVar = (v73.j) ((g) R2()).H;
        if (i == 1000) {
            jVar.v.onNext(Boolean.valueOf(i2 == -1));
        } else if (i != 1001) {
            jVar.getClass();
        } else {
            jVar.u.onNext(Boolean.valueOf(i2 == -1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen, com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        q qVar;
        Window window;
        View decorView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = com.revolut.core.ui_kit.R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a5.a styleApplicator = new a5.a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new q(y9Var, styleApplicator, r1Var, context);
        }
        o1 priority = o1.OVERLAY;
        Intrinsics.checkNotNullParameter(priority, "priority");
        n1 n1Var = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        this.y0 = n1Var;
        n1Var.a(y9.LIGHT);
        BasicNavBar basicNavBarF = q3().f();
        basicNavBarF.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        basicNavBarF.setBackground(d0.TRANSPARENT);
        ((j60.a) this.f65402t0.getValue()).d(v.k((LargeActionButtonDelegate) this.f65399o0.getValue(), (RowDelegate) this.f65397k0.getValue(), (TextDelegate) this.l0.getValue(), (ListCellDelegate) this.m0.getValue(), (TwinHorizontalButtonDelegate) this.f65398n0.getValue(), (PermissionDelegate) this.p0.getValue(), new PlainTextDelegate(), this.i0, new ListSubheaderDelegate()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate = this.f65400r0;
        newRevolutCardsCarouselDelegate.getClass();
        j listener = this.u0;
        Intrinsics.checkNotNullParameter(listener, "listener");
        newRevolutCardsCarouselDelegate.f52829s.remove(listener);
        n1 n1Var = this.y0;
        if (n1Var != null) {
            n1Var.b();
        }
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.q0 = null;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 0;
        ViewController.P2(this, rd0.e.b(q3().f().f59211b), new t73.d0(this, null, i), 3);
        NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate = this.f65400r0;
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52827q), new g0(this, null), 3);
        j listener = this.u0;
        Intrinsics.checkNotNullParameter(listener, "listener");
        newRevolutCardsCarouselDelegate.f52829s.add(listener);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52823l.f121375b), new t73.h0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52824m.f121375b), new i0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.i.f121375b), new j0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52822j.f121375b), new k0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52820g.f121375b), new l0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52821h.f121375b), new m0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.k.f121375b), new n0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.o.f121375b), new b0(this, null), 3);
        ViewController.P2(this, rd0.e.b(newRevolutCardsCarouselDelegate.f52826p.f121375b), new c0(this, null), 3);
        t05.c cVar = new t05.c(rd0.e.b(q3().f().f59210a.f57403b), 16);
        ?? r110 = this.Z;
        vkm.d dVarB = rd0.e.b(((RowDelegate) r110.getValue()).f53218h);
        t05.c cVar2 = new t05.c(rd0.e.b(((RowDelegate) r110.getValue()).f53226s), 17);
        vkm.d dVarB2 = rd0.e.b(((LargeActionButtonDelegate) this.W.getValue()).d.f121375b);
        vkm.d dVarB3 = rd0.e.b(((CircleActionButtonsBarDelegate) this.f65394d0.getValue()).f52087c.f121375b);
        ?? r112 = this.f65393b0;
        t05.c cVar3 = new t05.c(rd0.e.b(((PlainTextWarningDelegate) r112.getValue()).d.f121375b), 18);
        vkm.d dVarB4 = rd0.e.b(((PlainTextWarningDelegate) r112.getValue()).f52940c);
        vkm.d dVarB5 = rd0.e.b(((CellDetailsActionDelegate) this.X.getValue()).d);
        t05.c cVar4 = new t05.c(rd0.e.b(((TextDelegate) this.l0.getValue()).d), 19);
        t05.c cVar5 = new t05.c(kii.e.t(this.i0.f53022c, "hide(...)"), 20);
        ?? r3 = this.f65397k0;
        t05.c cVar6 = new t05.c(rd0.e.b(((RowDelegate) r3.getValue()).f53226s), 21);
        t05.c cVar7 = new t05.c(rd0.e.b(((RowDelegate) r3.getValue()).f53218h), 22);
        ?? r310 = this.c0;
        t05.c cVar8 = new t05.c(rd0.e.b(((PermissionDelegate) r310.getValue()).d.f121375b), 23);
        t05.c cVar9 = new t05.c(kii.e.t(((PermissionDelegate) r310.getValue()).e, "hide(...)"), 24);
        t05.c cVar10 = new t05.c(rd0.e.b(this.j0.p()), 15);
        ?? r2 = this.f65395e0;
        rv6.e eVar = new rv6.e(new t05.c(rd0.e.b(((ActionWidgetDelegate) r2.getValue()).f51589c.f121375b), 25), 10);
        rv6.e eVar2 = new rv6.e(new t05.c(rd0.e.b(((ActionWidgetDelegate) r2.getValue()).f51589c.f121375b), 14), 11);
        int i2 = 1;
        Flow[] flowArr = {cVar, dVarB, cVar2, dVarB2, dVarB3, cVar3, dVarB4, dVarB5, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, eVar, eVar2};
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(flowArr), new e0(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.f65399o0.getValue()).d.f121375b), new f0(this, null), 3);
        Lazy lazy = this.f65398n0;
        ViewController.P2(this, rd0.e.b(((TwinHorizontalButtonDelegate) lazy.getValue()).f53572c.f121375b), new e0(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(((TwinHorizontalButtonDelegate) lazy.getValue()).d.f121375b), new e0(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(q3().a().o), new t73.d0(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(((PermissionDelegate) this.p0.getValue()).d.f121375b), new e0(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(((ActionWidgetDelegate) r2.getValue()).f51589c.f121375b), new e0(this, continuation, 4), 3);
    }

    @Override // com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen
    public final void g3() {
        int iV = V();
        q3().b().setAnchorY((iV / 2) + q3().f().getHeight());
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF65403v0() {
        return this.f65403v0;
    }

    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen
    public final RecyclerView h() {
        i iVarQ3 = q3();
        switch (iVarQ3.f268474a) {
            case 0:
                AsyncDiffRecyclerView cardsCarouselRecyclerView = ((g73.c) iVarQ3.f268475b).i;
                Intrinsics.checkNotNullExpressionValue(cardsCarouselRecyclerView, "cardsCarouselRecyclerView");
                return cardsCarouselRecyclerView;
            default:
                AsyncDiffRecyclerView cardsCarouselRecyclerView2 = ((g73.d) iVarQ3.f268475b).i;
                Intrinsics.checkNotNullExpressionValue(cardsCarouselRecyclerView2, "cardsCarouselRecyclerView");
                return cardsCarouselRecyclerView2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen, oki.f
    public final pki.a k() {
        return (tki.a) this.C0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // o10.a
    /* JADX INFO: renamed from: l1 */
    public final List getW() {
        return (List) this.f65401s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen
    public final List l3() {
        return (List) this.B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen
    /* JADX INFO: renamed from: m3 */
    public final dli.c k() {
        return (tki.a) this.C0.getValue();
    }

    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen
    /* JADX INFO: renamed from: n3, reason: from getter */
    public final int getF65404w0() {
        return this.f65404w0;
    }

    public final void p3(CardDetailsDesignConfig cardDetailsDesignConfig, CardDetailsDesignConfig cardDetailsDesignConfig2, float f) {
        Integer num;
        Integer num2;
        int iIntValue = F0;
        int iIntValue2 = (cardDetailsDesignConfig == null || (num2 = cardDetailsDesignConfig.f104705j) == null) ? iIntValue : num2.intValue();
        if (cardDetailsDesignConfig2 != null && (num = cardDetailsDesignConfig2.f104705j) != null) {
            iIntValue = num.intValue();
        }
        q3().c().a(ColorUtils.blendARGB(iIntValue2, iIntValue, f), q3().f());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final i q3() {
        return (i) this.U.getValue();
    }

    @Override // o10.a
    public final void r1() {
        g gVar = (g) R2();
        if (gVar.o.d instanceof CardScreenAction.VirtualCardDesignChanged) {
            gVar.C2(a.C0465a.f65416a);
        } else {
            gVar.C2(a.b.f65417a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: r3, reason: merged with bridge method [inline-methods] */
    public final o73.g R1() {
        return (o73.g) this.z0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen
    /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g1 k3() {
        return (g1) this.A0.getValue();
    }

    @Override // com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen
    /* JADX INFO: renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void B(i1 uiState, Object obj2) {
        Integer num;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        h1 h1Var = obj2 instanceof h1 ? (h1) obj2 : null;
        super.B(uiState, h1Var);
        this.D0 = uiState.f;
        q3().f().setMenuItems(uiState.f268477b);
        if (pd.b.k(h1Var != null ? Boolean.valueOf(h1Var.f268471a) : null)) {
            CardDetailsDesignConfig cardDetailsDesignConfig = uiState.f268480h;
            UiKitPlayerView uiKitPlayerView = q3().d().f51502a;
            uiKitPlayerView.h();
            VideoBackgroundView.a(uiKitPlayerView, false);
            VideoBackground videoBackground = cardDetailsDesignConfig != null ? cardDetailsDesignConfig.k : null;
            if (videoBackground != null) {
                VideoBackgroundView.setVideoBackground$default(q3().d(), videoBackground.f104710a, videoBackground.f104711b, false, null, 12, null);
            }
            q3().c().a((cardDetailsDesignConfig == null || (num = cardDetailsDesignConfig.f104705j) == null) ? F0 : num.intValue(), q3().f());
        }
        if (pd.b.k(h1Var != null ? Boolean.valueOf(h1Var.f268473c) : null)) {
            n nVar = uiState.f268479g;
            if (nVar != null) {
                q3().b().setVisibility(0);
                q3().b().setModel(nVar);
            } else {
                q3().b().setVisibility(8);
            }
        }
        u uVar = uiState.i;
        if (!pd.b.k(h1Var != null ? Boolean.valueOf(h1Var.f268471a) : null) || uVar == null || uVar.f13476a) {
            return;
        }
        uVar.f13476a = true;
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(this, uVar, 25));
        valueAnimatorOfFloat.start();
        this.q0 = valueAnimatorOfFloat;
    }
}
