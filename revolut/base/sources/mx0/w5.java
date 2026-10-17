package mx0;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.camera.facelift.CameraMaskView;
import com.revolut.core.ui_kit.drawables.AirTipHintAnimationDrawable;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedPieSmallView;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.FadingImageBackgroundLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.jvm.internal.Intrinsics;
import vu0.j;
import yw0.f;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class w5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210073b;

    public /* synthetic */ w5(Object obj2, int i) {
        this.f210072a = i;
        this.f210073b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        int i = this.f210072a;
        Object obj2 = this.f210073b;
        switch (i) {
            case 0:
                FadingImageBackgroundLayout fadingImageBackgroundLayout = (FadingImageBackgroundLayout) obj2;
                FadingImageBackgroundLayout.Companion aVar = FadingImageBackgroundLayout.INSTANCE;
                int iIntValue = ((Integer) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                fadingImageBackgroundLayout.f58542h = iIntValue;
                fadingImageBackgroundLayout.f58540b.setAlpha(iIntValue / 255.0f);
                fadingImageBackgroundLayout.invalidate();
                break;
            case 1:
                ((DefaultTimeBar) obj2).lambda$new$1(animator);
                break;
            case 2:
                ou0.a aVar2 = (ou0.a) obj2;
                float fFloatValue = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                Paint paint = aVar2.f229752c;
                if (paint != null) {
                    paint.setAlpha((int) (255 * fFloatValue));
                }
                aVar2.c(fFloatValue);
                break;
            case 3:
                SegmentedPieSmallView segmentedPieSmallView = (SegmentedPieSmallView) obj2;
                SegmentedPieSmallView.a aVar3 = SegmentedPieSmallView.Companion;
                segmentedPieSmallView.f57159l = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                segmentedPieSmallView.invalidate();
                break;
            case 4:
                rp0.e eVar = (rp0.e) obj2;
                eVar.f = ((Float) z9h.n.g(animator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                eVar.f256065a.invalidate();
                break;
            case 5:
                AirTipHintAnimationDrawable airTipHintAnimationDrawable = (AirTipHintAnimationDrawable) obj2;
                AirTipHintAnimationDrawable.a aVar4 = AirTipHintAnimationDrawable.Companion;
                airTipHintAnimationDrawable.f55744s = ((Float) z9h.n.g(animator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                airTipHintAnimationDrawable.invalidateSelf();
                break;
            case 6:
                ComparisonLineChartView comparisonLineChartView = (ComparisonLineChartView) obj2;
                ComparisonLineChartView.Companion aVar5 = ComparisonLineChartView.INSTANCE;
                int iIntValue2 = ((Integer) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
                comparisonLineChartView.J = iIntValue2;
                comparisonLineChartView.u.setColor(iIntValue2);
                Paint paint2 = comparisonLineChartView.v;
                paint2.setColor(iIntValue2);
                paint2.setAlpha((int) (255 * 0.5f));
                comparisonLineChartView.invalidate();
                break;
            case 7:
                ((RecyclerView) obj2).scrollBy(0, -((Integer) z9h.n.g(animator, "update", "null cannot be cast to non-null type kotlin.Int")).intValue());
                break;
            case 8:
                NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) obj2;
                NavBarWithContainerHeaderView.Companion aVar6 = NavBarWithContainerHeaderView.INSTANCE;
                navBarWithContainerHeaderView.C = ((Float) z9h.n.g(animator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                navBarWithContainerHeaderView.s();
                break;
            case 9:
                PhotoHeaderView.x((PhotoHeaderView) obj2, animator);
                break;
            case 10:
                WallpaperAssetSwitcher.Companion aVar7 = WallpaperAssetSwitcher.INSTANCE;
                Intrinsics.checkNotNullParameter(animator, "animator");
                UiKitPlayerView uiKitPlayerView = ((WallpaperAssetSwitcher) obj2).f59491a;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                uiKitPlayerView.setAlpha(((Float) animatedValue).floatValue());
                break;
            case 11:
                WallpaperAssetSwitcher.Companion aVar8 = WallpaperAssetSwitcher.INSTANCE;
                ((ColorDrawable) obj2).setColor(((Integer) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(animator, "it");
                ((ux0.j) obj2).a(animator.getAnimatedFraction());
                break;
            case 13:
                uz.c cVar = (uz.c) obj2;
                float fFloatValue2 = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                Float f = cVar.f284489s;
                cVar.f284486p = fFloatValue2;
                if (cVar.f284488r && f != null && fFloatValue2 >= ((double) f.floatValue()) - 3.0d) {
                    animator.pause();
                    cVar.f284488r = false;
                }
                cVar.f284477a.invalidate();
                break;
            case 14:
                uz.h hVar = (uz.h) obj2;
                hVar.D = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                hVar.f284520w.invalidate();
                break;
            case 15:
                uz.p pVar = (uz.p) obj2;
                float fFloatValue3 = ((Float) z9h.n.g(animator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                uz.o oVar = pVar.f284544g;
                float f4 = oVar.f284538a;
                uz.o oVar2 = pVar.f284545h;
                pVar.f284543c = j6.a.a(oVar2.f284538a, f4, fFloatValue3, f4);
                float f5 = oVar.f284539b;
                pVar.d = j6.a.a(oVar2.f284539b, f5, fFloatValue3, f5);
                float f6 = oVar.f284540c;
                pVar.e = j6.a.a(oVar2.f284540c, f6, fFloatValue3, f6);
                float f32 = oVar.d;
                pVar.f = j6.a.a(oVar2.d, f32, fFloatValue3, f32);
                pVar.f284541a.invoke();
                break;
            case 16:
                uz.r rVar = (uz.r) obj2;
                Intrinsics.checkNotNullParameter(animator, "animation");
                int i2 = rVar.f284550c;
                int i3 = rVar.f284549b;
                Object animatedValue2 = animator.getAnimatedValue();
                Intrinsics.i(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue4 = ((Float) animatedValue2).floatValue();
                int iBlendARGB = (Color.alpha(i2) <= 0 || Color.alpha(i3) <= 0 || ColorUtils.setAlphaComponent(i2, 255) == ColorUtils.setAlphaComponent(i3, 255)) ? ColorUtils.blendARGB(i2, i3, fFloatValue4) : fFloatValue4 <= 0.5f ? ColorUtils.blendARGB(i2, ColorUtils.setAlphaComponent(i2, 0), fFloatValue4 / 0.5f) : ColorUtils.blendARGB(ColorUtils.setAlphaComponent(i3, 0), i3, (fFloatValue4 - 0.5f) / 0.5f);
                rVar.e = iBlendARGB;
                rVar.f284548a.invoke(Integer.valueOf(iBlendARGB));
                break;
            case 17:
                ((vs0.e) obj2).b(((Float) z9h.n.g(animator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 18:
                vu0.j jVar = (vu0.j) obj2;
                j.a aVar9 = vu0.j.Companion;
                float fFloatValue5 = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                jVar.f292167t = fFloatValue5;
                jVar.setAlpha(jVar.f292166s * fFloatValue5);
                break;
            case 19:
                ((yt0.i) obj2).invoke((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float"));
                break;
            case 20:
                yt0.b0 b0Var = (yt0.b0) obj2;
                float fFloatValue6 = ((Float) z9h.n.g(animator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                b0Var.f316522h = fFloatValue6;
                b0Var.f316520c.invoke(Float.valueOf(ix0.i1.b(b0Var.a(), 1.0f, fFloatValue6)));
                break;
            case 21:
                f.a aVar10 = yw0.f.Companion;
                ((lq0.p) obj2).b(((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                break;
            case 22:
                int i5 = CameraMaskView.f50684j;
                ((CameraMaskView) obj2).invalidate();
                break;
            case 23:
                zu0.e eVar2 = (zu0.e) obj2;
                int iIntValue3 = ((Integer) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                View mainView = eVar2.f325195a.getMainView();
                SwipeToActionLayout swipeToActionLayout = eVar2.f325195a;
                mainView.offsetLeftAndRight(iIntValue3 - swipeToActionLayout.getMainView().getLeft());
                eVar2.a();
                eVar2.d = swipeToActionLayout.getMainView().getLeft();
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animation");
                GradientDrawable gradientDrawable = ((zu0.v) obj2).d;
                Object animatedValue3 = animator.getAnimatedValue();
                Intrinsics.i(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                gradientDrawable.setAlpha(((Integer) animatedValue3).intValue());
                break;
        }
    }
}
