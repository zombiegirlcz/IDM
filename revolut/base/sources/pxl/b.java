package pxl;

import android.animation.ValueAnimator;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout;
import kotlin.jvm.internal.Intrinsics;
import yt0.h;
import z9h.n;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f240633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f240634c;

    public /* synthetic */ b(Object obj2, boolean z, int i) {
        this.f240632a = i;
        this.f240634c = obj2;
        this.f240633b = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it8) {
        int i = this.f240632a;
        boolean z = this.f240633b;
        Object obj2 = this.f240634c;
        switch (i) {
            case 0:
                CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = (CarouselWithBottomSheetContainerLayout) obj2;
                CarouselWithBottomSheetContainerLayout.a aVar = CarouselWithBottomSheetContainerLayout.Companion;
                float fFloatValue = ((Float) n.g(it8, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                if (!z) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                carouselWithBottomSheetContainerLayout.h0(fFloatValue, true, true, z);
                break;
            default:
                h hVar = (h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                float animatedFraction = it8.getAnimatedFraction();
                if (z) {
                    animatedFraction = 1.0f - animatedFraction;
                }
                hVar.s(animatedFraction, hVar.f316548r);
                break;
        }
    }
}
