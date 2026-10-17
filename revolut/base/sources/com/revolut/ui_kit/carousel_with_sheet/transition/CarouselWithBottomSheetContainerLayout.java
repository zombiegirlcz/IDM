package com.revolut.ui_kit.carousel_with_sheet.transition;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import aq0.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.CardsCarouselView;
import com.revolut.core.ui_kit.views.j;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.c;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.ui_kit.carousel_with_sheet.R$id;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout;
import foh.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lki.z;
import org.jetbrains.annotations.NotNull;
import pxl.b;
import pxl.e;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0011,B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/revolut/ui_kit/carousel_with_sheet/transition/CarouselWithBottomSheetContainerLayout;", "Lcom/revolut/kompot/view/ControllerContainerConstraintLayout;", "Lcom/revolut/kompot/navigable/c;", "Llki/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llki/z;", "transitionListener", "", "setTransitionListener", "(Llki/z;)V", "Lpxl/e;", "k", "Lkotlin/Lazy;", "getCarouselHostView", "()Lpxl/e;", "carouselHostView", "Lcom/revolut/core/ui_kit/views/j;", "l", "getExpandableLayout", "()Lcom/revolut/core/ui_kit/views/j;", "expandableLayout", "Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "m", "getNavBar", "()Lcom/revolut/core/ui_kit/views/navbar/BasicNavBar;", "navBar", "Landroid/view/ViewGroup;", "n", "getBgContainer", "()Landroid/view/ViewGroup;", "bgContainer", "Landroid/view/View;", "blurredBackgroundContainer", "Landroid/view/View;", "getBlurredBackgroundContainer", "()Landroid/view/View;", "Companion", "a", "ui_kit_carousel_with_sheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CarouselWithBottomSheetContainerLayout extends ControllerContainerConstraintLayout implements c, lki.c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f107104h;
    public Function0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f107105j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f107106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f107107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f107108n;
    public ValueAnimator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107109p;

    /* JADX INFO: renamed from: com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselWithBottomSheetContainerLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // lki.c
    public final void B(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.i = block;
    }

    @Override // com.revolut.kompot.navigable.c
    public final void Y(boolean z, TransitionAnimation.ViewDelegated animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!(animation instanceof CarouselTransition)) {
            throw new IllegalStateException("Transition must be CarouselTransition");
        }
        this.f107105j = true;
        if (this.f107109p) {
            return;
        }
        boolean z3 = !z;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.setDuration(!z ? 500L : 300L);
            valueAnimatorOfFloat.setInterpolator(!z ? new OvershootInterpolator(0.5f) : new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new b(this, z3, 0));
            valueAnimatorOfFloat.addListener(new k(this, 11));
            valueAnimatorOfFloat.start();
            this.o = valueAnimatorOfFloat;
        }
    }

    public final void f0(float f) {
        if (f >= 1.0f) {
            if (this.f107109p) {
                this.f107109p = false;
                g0(true);
                return;
            }
            return;
        }
        if (BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) {
            return;
        }
        if (!this.f107109p && this.f107105j) {
            this.f107109p = true;
        }
        h0(f, this.f107105j, false, false);
    }

    public final void g0(boolean z) {
        if (z) {
            z zVar = this.f107104h;
            if (zVar != null) {
                zVar.n();
            }
        } else {
            z zVar2 = this.f107104h;
            if (zVar2 != null) {
                zVar2.r();
            }
            z zVar3 = this.f107104h;
            if (zVar3 != null) {
                zVar3.q();
            }
        }
        this.f107104h = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public ViewGroup getBgContainer() {
        Object value = this.f107108n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewGroup) value;
    }

    public View getBlurredBackgroundContainer() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public e getCarouselHostView() {
        return (e) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public j getExpandableLayout() {
        Object value = this.f107106l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @NotNull
    public BasicNavBar getNavBar() {
        Object value = this.f107107m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BasicNavBar) value;
    }

    public void h0(float f, boolean z, boolean z3, boolean z4) {
        if (z) {
            float fMin = Float.min(1.0f, Float.max(BitmapDescriptorFactory.HUE_RED, (3 * f) - 2.0f));
            getNavBar().setAlpha(fMin);
            getBgContainer().setAlpha(fMin);
        }
        float f4 = 1.0f - f;
        getCarouselHostView().getView().setTranslationY(i.j(-100) * f4);
        getCarouselHostView().getView().setAlpha(f);
        View blurredBackgroundContainer = getBlurredBackgroundContainer();
        if (blurredBackgroundContainer != null) {
            blurredBackgroundContainer.setAlpha(f);
        }
        if (z3) {
            getExpandableLayout().setTranslationY(i.j(600) * f4);
        }
    }

    @Override // com.revolut.kompot.navigable.c
    public void setTransitionListener(z transitionListener) {
        this.f107104h = transitionListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselWithBottomSheetContainerLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselWithBottomSheetContainerLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.k = w.y0(new Function0(this) { // from class: pxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselWithBottomSheetContainerLayout f240631b;

            {
                this.f240631b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = this.f240631b;
                switch (i3) {
                    case 0:
                        CarouselWithBottomSheetContainerLayout.Companion companion = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        View viewFindViewById = carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_cardsCarouselView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new c((CardsCarouselView) viewFindViewById);
                    case 1:
                        CarouselWithBottomSheetContainerLayout.Companion companion2 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (j) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_expandableLayoutView);
                    case 2:
                        CarouselWithBottomSheetContainerLayout.Companion companion3 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (BasicNavBar) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_navBar);
                    default:
                        CarouselWithBottomSheetContainerLayout.Companion companion4 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (ViewGroup) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_bgContainer);
                }
            }
        });
        final int i3 = 1;
        this.f107106l = w.y0(new Function0(this) { // from class: pxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselWithBottomSheetContainerLayout f240631b;

            {
                this.f240631b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = this.f240631b;
                switch (i32) {
                    case 0:
                        CarouselWithBottomSheetContainerLayout.Companion companion = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        View viewFindViewById = carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_cardsCarouselView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new c((CardsCarouselView) viewFindViewById);
                    case 1:
                        CarouselWithBottomSheetContainerLayout.Companion companion2 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (j) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_expandableLayoutView);
                    case 2:
                        CarouselWithBottomSheetContainerLayout.Companion companion3 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (BasicNavBar) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_navBar);
                    default:
                        CarouselWithBottomSheetContainerLayout.Companion companion4 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (ViewGroup) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_bgContainer);
                }
            }
        });
        final int i5 = 2;
        this.f107107m = w.y0(new Function0(this) { // from class: pxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselWithBottomSheetContainerLayout f240631b;

            {
                this.f240631b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = this.f240631b;
                switch (i32) {
                    case 0:
                        CarouselWithBottomSheetContainerLayout.Companion companion = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        View viewFindViewById = carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_cardsCarouselView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new c((CardsCarouselView) viewFindViewById);
                    case 1:
                        CarouselWithBottomSheetContainerLayout.Companion companion2 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (j) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_expandableLayoutView);
                    case 2:
                        CarouselWithBottomSheetContainerLayout.Companion companion3 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (BasicNavBar) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_navBar);
                    default:
                        CarouselWithBottomSheetContainerLayout.Companion companion4 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (ViewGroup) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_bgContainer);
                }
            }
        });
        final int i6 = 3;
        this.f107108n = w.y0(new Function0(this) { // from class: pxl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselWithBottomSheetContainerLayout f240631b;

            {
                this.f240631b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = this.f240631b;
                switch (i32) {
                    case 0:
                        CarouselWithBottomSheetContainerLayout.Companion companion = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        View viewFindViewById = carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_cardsCarouselView);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                        return new c((CardsCarouselView) viewFindViewById);
                    case 1:
                        CarouselWithBottomSheetContainerLayout.Companion companion2 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (j) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_expandableLayoutView);
                    case 2:
                        CarouselWithBottomSheetContainerLayout.Companion companion3 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (BasicNavBar) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_navBar);
                    default:
                        CarouselWithBottomSheetContainerLayout.Companion companion4 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                        return (ViewGroup) carouselWithBottomSheetContainerLayout.findViewById(R$id.carouselWithSheet_bgContainer);
                }
            }
        });
    }

    public /* synthetic */ CarouselWithBottomSheetContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
