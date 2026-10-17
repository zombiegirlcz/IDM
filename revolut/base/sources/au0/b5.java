package au0;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarSelectorDrawable;
import com.revolut.core.ui_kit.internal.drawing.ai.AiBorderDrawableDecorator;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.BottomSwipeView;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.CircleProgressBarWithText;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.internal.views.VerticalProgressStepView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperAssetOverlayDrawable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import hs0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.s3;
import mx0.p0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9153b;

    public /* synthetic */ b5(Object obj2, int i) {
        this.f9152a = i;
        this.f9153b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        float fA;
        int i = this.f9152a;
        Object obj2 = this.f9153b;
        switch (i) {
            case 0:
                e5 e5Var = (e5) obj2;
                float fFloatValue = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                e5Var.f = fFloatValue;
                e5Var.a(fFloatValue);
                return;
            case 1:
                WallpaperAssetOverlayDrawable wallpaperAssetOverlayDrawable = (WallpaperAssetOverlayDrawable) obj2;
                WallpaperAssetOverlayDrawable.Companion aVar = WallpaperAssetOverlayDrawable.INSTANCE;
                Intrinsics.checkNotNullParameter(anim, "anim");
                wallpaperAssetOverlayDrawable.f57375m = true;
                Object animatedValue = anim.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                wallpaperAssetOverlayDrawable.b(((Float) animatedValue).floatValue());
                return;
            case 2:
                ((LottieDrawable) obj2).setAlpha(((Integer) z9h.n.g(anim, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue());
                return;
            case 3:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$0((ClippableRoundedCornerLayout) obj2, anim);
                return;
            case 4:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) obj2, anim);
                return;
            case 5:
                int i2 = RevolutShimmerDrawable.k;
                Intrinsics.checkNotNullParameter(anim, "it");
                ((RevolutShimmerDrawable) obj2).invalidateSelf();
                return;
            case 6:
                ct0.f fVar = (ct0.f) obj2;
                float fFloatValue2 = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                if (fFloatValue2 == fVar.f108592j) {
                    return;
                }
                fVar.f108588b.invoke();
                fVar.f108592j = fFloatValue2;
                return;
            case 7:
                AnimatedBorderGradientDrawable animatedBorderGradientDrawable = (AnimatedBorderGradientDrawable) obj2;
                AnimatedBorderGradientDrawable.Companion aVar2 = AnimatedBorderGradientDrawable.INSTANCE;
                animatedBorderGradientDrawable.f = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                animatedBorderGradientDrawable.invalidateSelf();
                return;
            case 8:
                CrossfadeDrawable crossfadeDrawable = (CrossfadeDrawable) obj2;
                CrossfadeDrawable.a aVar3 = CrossfadeDrawable.Companion;
                crossfadeDrawable.e = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                crossfadeDrawable.invalidateSelf();
                return;
            case 9:
                FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = (FloatingBottomBarSelectorDrawable) obj2;
                int i3 = FloatingBottomBarSelectorDrawable.A;
                floatingBottomBarSelectorDrawable.f55984p = ((Float) z9h.n.g(anim, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                floatingBottomBarSelectorDrawable.invalidateSelf();
                return;
            case 10:
                SliderLayout sliderLayout = (SliderLayout) obj2;
                SliderLayout.a aVar4 = SliderLayout.Companion;
                float fFloatValue3 = ((Float) z9h.n.g(anim, "valueAnimation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                View viewI = sliderLayout.I();
                sliderLayout.K().b(viewI, sliderLayout, fFloatValue3);
                boolean z = sliderLayout.f59658c == dy0.m.IN;
                ArrayList arrayList = sliderLayout.D;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
                if (z) {
                    float f = sliderLayout.f59663m;
                    fA = j6.a.a(1.0f, f, fFloatValue3, f);
                } else {
                    fA = fFloatValue3 * sliderLayout.f59663m;
                }
                sliderLayout.K().c(viewI, sliderLayout, fA);
                return;
            case 11:
                int i5 = TransferToChatTransitionFlowContainerLayout.f107124p;
                float fFloatValue4 = ((Float) z9h.n.g(anim, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                Iterator it8 = ((List) obj2).iterator();
                while (it8.hasNext()) {
                    ((View) it8.next()).setAlpha(fFloatValue4);
                }
                return;
            case 12:
                es0.q qVar = (es0.q) obj2;
                qVar.d = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                qVar.b();
                return;
            case 13:
                et0.p0 p0Var = (et0.p0) obj2;
                int i6 = et0.p0.f129086m;
                float fFloatValue5 = 1 - ((Float) z9h.n.g(anim, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                p0Var.f129087a.setAlpha(fFloatValue5);
                AppCompatImageView appCompatImageView = p0Var.f129087a;
                appCompatImageView.setScaleX(fFloatValue5);
                appCompatImageView.setScaleY(fFloatValue5);
                return;
            case 14:
                AiBorderDrawableDecorator aiBorderDrawableDecorator = (AiBorderDrawableDecorator) obj2;
                float f4 = AiBorderDrawableDecorator.f56030n;
                aiBorderDrawableDecorator.f56036h = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                aiBorderDrawableDecorator.invalidateSelf();
                return;
            case 15:
                a.C0887a c0887a = hs0.a.Companion;
                ((ImageView) obj2).setImageTintList(ColorStateList.valueOf(((Integer) z9h.n.g(anim, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue()));
                return;
            case 16:
                ir0.e eVar = (ir0.e) obj2;
                eVar.f167936c = ((Float) z9h.n.g(anim, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                eVar.f167934a.invalidate();
                return;
            case 17:
                ir0.j jVar = (ir0.j) obj2;
                jVar.h(((Float) z9h.n.g(anim, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                jVar.f167940a.invalidate();
                return;
            case 18:
                iv0.f fVar2 = (iv0.f) obj2;
                Intrinsics.checkNotNullParameter(anim, "valueAnimator");
                vs0.a aVar5 = (vs0.a) fVar2.d;
                iv0.g gVar = fVar2.e;
                Object animatedValue2 = anim.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                aVar5.setScaleAnimatorValue(gVar.f168677a.getInterpolation(kotlin.ranges.f.f(((Float) animatedValue2).floatValue() / 0.7058824f, BitmapDescriptorFactory.HUE_RED, 1.0f)));
                View view = fVar2.d;
                Object animatedValue3 = anim.getAnimatedValue();
                Intrinsics.i(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                ((vs0.a) view).setHighlightAnimatorValue(gVar.f168677a.getInterpolation(kotlin.ranges.f.f((((Float) animatedValue3).floatValue() - 0.5294118f) / 0.47058824f, BitmapDescriptorFactory.HUE_RED, 1.0f)));
                view.invalidate();
                return;
            case 19:
                Intrinsics.checkNotNullParameter(anim, "valueAnimator");
                iv0.l lVar = ((iv0.j) obj2).f;
                Object animatedValue4 = anim.getAnimatedValue();
                Intrinsics.i(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                lVar.a(((Float) animatedValue4).floatValue());
                return;
            case 20:
                float fFloatValue6 = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                for (View view2 : ((ix0.h2) obj2).f169242a) {
                    view2.setAlpha(fFloatValue6);
                }
                return;
            case 21:
                ((jy0.m) obj2).b(((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                return;
            case 22:
                BottomSwipeView.g0((BottomSwipeView) obj2, anim);
                return;
            case 23:
                CircleProgressBar.Companion companion = CircleProgressBar.INSTANCE;
                Intrinsics.checkNotNullParameter(anim, "animation");
                Iterator it9 = ((CircleProgressBar) obj2).f56136j.iterator();
                while (it9.hasNext()) {
                    ((ValueAnimator.AnimatorUpdateListener) it9.next()).onAnimationUpdate(anim);
                }
                return;
            case 24:
                CircleProgressBarWithText.f0((CircleProgressBarWithText) obj2, anim);
                return;
            case 25:
                ProductIntroView productIntroView = (ProductIntroView) obj2;
                ProductIntroView.Companion aVar6 = ProductIntroView.INSTANCE;
                float fFloatValue7 = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                productIntroView.f56307q.setTranslationY(fFloatValue7);
                productIntroView.f56308r.setTranslationY(fFloatValue7);
                productIntroView.f56309s.setTranslationY(fFloatValue7);
                return;
            case 26:
                Intrinsics.checkNotNullParameter(anim, "it");
                ((ms0.i3) obj2).c(anim.getAnimatedFraction());
                return;
            case 27:
                ms0.s3 s3Var = (ms0.s3) obj2;
                s3.a aVar7 = ms0.s3.Companion;
                Intrinsics.checkNotNullParameter(anim, "anim");
                Paint paint = s3Var.f208416b;
                Object animatedValue5 = anim.getAnimatedValue();
                Intrinsics.i(animatedValue5, "null cannot be cast to non-null type kotlin.Int");
                paint.setColor(((Integer) animatedValue5).intValue());
                s3Var.invalidate();
                return;
            case 28:
                VerticalProgressStepView verticalProgressStepView = (VerticalProgressStepView) obj2;
                VerticalProgressStepView.a aVar8 = VerticalProgressStepView.Companion;
                verticalProgressStepView.f56492y = ((Float) z9h.n.g(anim, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                verticalProgressStepView.invalidate();
                return;
            default:
                mx0.p0 p0Var2 = (mx0.p0) obj2;
                p0.a aVar9 = mx0.p0.Companion;
                p0Var2.z = ((Float) z9h.n.g(anim, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                p0Var2.invalidate();
                return;
        }
    }
}
