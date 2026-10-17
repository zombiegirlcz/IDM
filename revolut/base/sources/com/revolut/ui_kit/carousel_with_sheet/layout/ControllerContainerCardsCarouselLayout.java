package com.revolut.ui_kit.carousel_with_sheet.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.j;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.ui_kit.carousel_with_sheet.R$id;
import com.revolut.ui_kit.carousel_with_sheet.layout.ControllerContainerCardsCarouselLayout;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout;
import foh.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pxl.d;
import pxl.e;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u0004\u0018\u00010 8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010#R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/revolut/ui_kit/carousel_with_sheet/layout/ControllerContainerCardsCarouselLayout;", "Lcom/revolut/ui_kit/carousel_with_sheet/transition/CarouselWithBottomSheetContainerLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpxl/e;", "q", "Lkotlin/Lazy;", "getCarouselHostView", "()Lpxl/e;", "carouselHostView", "Lcom/revolut/core/ui_kit/views/j;", "r", "getExpandableLayout", "()Lcom/revolut/core/ui_kit/views/j;", "expandableLayout", "Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "s", "getNavBar", "()Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "navBar", "Landroid/view/ViewGroup;", "t", "getBgContainer", "()Landroid/view/ViewGroup;", "bgContainer", "Landroid/view/View;", "u", "getBlurredBackgroundContainer", "()Landroid/view/View;", "blurredBackgroundContainer", "v", "getCardCarouselView", "cardCarouselView", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "w", "getGooglePayButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "googlePayButton", "Companion", "a", "ui_kit_carousel_with_sheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ControllerContainerCardsCarouselLayout extends CarouselWithBottomSheetContainerLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f107098x = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f107099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f107100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f107101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f107102t;
    public final Object u;
    public final Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f107103w;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCardsCarouselLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout
    @NotNull
    public ViewGroup getBgContainer() {
        Object value = this.f107102t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewGroup) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout
    public View getBlurredBackgroundContainer() {
        return (View) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public View getCardCarouselView() {
        return (View) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout
    @NotNull
    public e getCarouselHostView() {
        return (e) this.f107099q.getValue();
    }

    @Override // com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout
    public final void h0(float f, boolean z, boolean z3, boolean z4) {
        super.h0(f, z, z3, z4);
        if (z4 || getGooglePayButton().getVisibility() != 0) {
            return;
        }
        getGooglePayButton().setAlpha(f);
        getGooglePayButton().setTranslationY((1.0f - f) * i.j(600));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCardsCarouselLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout
    @NotNull
    public j getExpandableLayout() {
        Object value = this.f107100r.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public LargeActionButton getGooglePayButton() {
        Object value = this.f107103w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LargeActionButton) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout
    @NotNull
    public BasicNavBar getNavBar() {
        Object value = this.f107101s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BasicNavBar) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCardsCarouselLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f107099q = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i3) {
                    case 0:
                        int i5 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i6 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i21 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i22 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i32 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
        final int i3 = 1;
        this.f107100r = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i32) {
                    case 0:
                        int i5 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i6 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i21 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i22 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i322 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
        final int i5 = 2;
        this.f107101s = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i32) {
                    case 0:
                        int i59 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i6 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i21 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i22 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i322 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
        final int i6 = 3;
        this.f107102t = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i32) {
                    case 0:
                        int i59 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i66 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i21 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i22 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i322 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
        final int i21 = 4;
        this.u = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i21;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i32) {
                    case 0:
                        int i59 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i66 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i212 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i22 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i322 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
        final int i22 = 5;
        this.v = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i22;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i32) {
                    case 0:
                        int i59 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i66 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i212 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i222 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i322 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
        final int i32 = 6;
        this.f107103w = w.y0(new Function0(this) { // from class: oxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ControllerContainerCardsCarouselLayout f230866b;

            {
                this.f230866b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i32;
                ControllerContainerCardsCarouselLayout controllerContainerCardsCarouselLayout = this.f230866b;
                switch (i322) {
                    case 0:
                        int i59 = ControllerContainerCardsCarouselLayout.f107098x;
                        View viewFindViewById = controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_recyclerView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new d((RecyclerView) viewFindViewById);
                    case 1:
                        int i66 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (j) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_expandableLayoutView);
                    case 2:
                        int i212 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (BasicNavBar) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_navBar);
                    case 3:
                        int i222 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (ViewGroup) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgContainer);
                    case 4:
                        int i3222 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_bgBlurredImageBackgroundView);
                    case 5:
                        int i33 = ControllerContainerCardsCarouselLayout.f107098x;
                        return controllerContainerCardsCarouselLayout.getCarouselHostView().getView();
                    default:
                        int i43 = ControllerContainerCardsCarouselLayout.f107098x;
                        return (LargeActionButton) controllerContainerCardsCarouselLayout.findViewById(R$id.cardsCarousel_addToGpayButton);
                }
            }
        });
    }

    public /* synthetic */ ControllerContainerCardsCarouselLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
