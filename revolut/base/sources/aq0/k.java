package aq0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.airbnb.lottie.LottieAnimationView;
import com.hcaptcha.sdk.HCaptchaDialogFragment;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.core.ui_kit.drawables.AirTipHintAnimationDrawable;
import com.revolut.core.ui_kit.drawables.AnimatedDrawable;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.core.ui_kit.internal.gallery_picker.GalleryGridLayoutManager;
import com.revolut.core.ui_kit.internal.views.fanchart.FanChartView;
import com.revolut.core.ui_kit.internal.views.pincode.FingerPrintView;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.ui_kit.carousel_with_sheet.transition.CarouselWithBottomSheetContainerLayout;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import lki.z;
import po0.b0;
import po0.x;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8228b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f8227a = i;
        this.f8228b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        int i = this.f8227a;
        Object obj2 = this.f8228b;
        switch (i) {
            case 8:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CardPersonalisationView cardPersonalisationView = (CardPersonalisationView) obj2;
                cardPersonalisationView.getDrawingView().setEditingEnabled(true);
                cardPersonalisationView.getCustomisationAnimationView().setVisibility(8);
                cardPersonalisationView.f58385h = null;
                break;
            case 9:
            case 10:
            default:
                super.onAnimationCancel(animation);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CarouselWithBottomSheetContainerLayout.Companion aVar = CarouselWithBottomSheetContainerLayout.INSTANCE;
                ((CarouselWithBottomSheetContainerLayout) obj2).g0(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        int i = this.f8227a;
        Object obj2 = this.f8228b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                GalleryPickerView galleryPickerView = (GalleryPickerView) obj2;
                galleryPickerView.f55814p = false;
                GalleryGridLayoutManager galleryGridLayoutManager = galleryPickerView.f55807c;
                if (galleryGridLayoutManager == null) {
                    Intrinsics.r("galleryLayoutManager");
                    throw null;
                }
                galleryGridLayoutManager.m();
                galleryPickerView.d();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((azl.e) obj2).setVisibility(4);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ConstraintLayout promptLoadingView = ((WebPortalLoadingView) obj2).getPromptLoadingView();
                Intrinsics.checkNotNullExpressionValue(promptLoadingView, "access$getPromptLoadingView(...)");
                promptLoadingView.setVisibility(8);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                fs0.e eVar = (fs0.e) obj2;
                eVar.e = null;
                eVar.b();
                return;
            case 4:
                ((HCaptchaDialogFragment) obj2).c0.setVisibility(8);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((FingerPrintView) obj2).f57447a = null;
                return;
            case 6:
                Intrinsics.checkNotNullParameter(animation, "animation");
                lki.b bVar = (lki.b) obj2;
                bVar.f196454a = null;
                bVar.d = null;
                z zVar = bVar.f196455b;
                if (zVar != null) {
                    zVar.r();
                }
                z zVar2 = bVar.f196455b;
                if (zVar2 != null) {
                    zVar2.q();
                }
                bVar.f196455b = null;
                return;
            case 7:
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.setStartDelay(((FanChartView) obj2).f56968j.f199744g);
                animation.start();
                return;
            case 8:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CardPersonalisationView cardPersonalisationView = (CardPersonalisationView) obj2;
                cardPersonalisationView.getDrawingView().setEditingEnabled(true);
                cardPersonalisationView.getCustomisationAnimationView().setVisibility(8);
                cardPersonalisationView.f58385h = null;
                return;
            case 9:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CmsStoriesScreen cmsStoriesScreen = (CmsStoriesScreen) obj2;
                CmsStoriesScreen.a aVar = CmsStoriesScreen.Companion;
                ControllerContainerFrameLayout controllerContainerFrameLayout = cmsStoriesScreen.g3().f184285a;
                Intrinsics.checkNotNullExpressionValue(controllerContainerFrameLayout, "getRoot(...)");
                Iterator it8 = ViewGroupKt.getChildren(controllerContainerFrameLayout).iterator();
                Intrinsics.i(it8, "null cannot be cast to non-null type kotlin.collections.MutableIterator<android.view.View>");
                u0.b(it8);
                while (it8.hasNext()) {
                    if (!Intrinsics.f((View) it8.next(), cmsStoriesScreen.R)) {
                        it8.remove();
                    }
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(animation, "animation");
                StatefulAnimatedBackground statefulAnimatedBackground = (StatefulAnimatedBackground) obj2;
                ArrayDeque arrayDeque = statefulAnimatedBackground.f51499b;
                x xVar = (x) arrayDeque.peek();
                if (xVar != null && xVar.f237870b == b0.ONCE) {
                    arrayDeque.poll();
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                    statefulAnimatedBackground.c();
                    return;
                }
                return;
            case 11:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CarouselWithBottomSheetContainerLayout.Companion aVar2 = CarouselWithBottomSheetContainerLayout.INSTANCE;
                ((CarouselWithBottomSheetContainerLayout) obj2).g0(false);
                return;
            case 12:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((LottieAnimationView) obj2).setVisibility(8);
                return;
            case 13:
                Intrinsics.checkNotNullParameter(animation, "animation");
                AirTipHintAnimationDrawable airTipHintAnimationDrawable = (AirTipHintAnimationDrawable) obj2;
                AirTipHintAnimationDrawable.Companion aVar3 = AirTipHintAnimationDrawable.INSTANCE;
                airTipHintAnimationDrawable.f55744s = -1.0f;
                airTipHintAnimationDrawable.f55743r = null;
                airTipHintAnimationDrawable.invalidateSelf();
                return;
            case 14:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((AnimatedDrawable) obj2).f55746b.getClass();
                int i2 = AnimatedDrawable.e;
                Unit unit = Unit.f186387a;
                return;
            case 15:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((SlidingFromTopViewContainer) obj2).setVisibility(4);
                return;
            default:
                super.onAnimationEnd(animation);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        switch (this.f8227a) {
            case 17:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationRepeat(animation);
                ((uz.c) this.f8228b).f284490t = true;
                break;
            default:
                super.onAnimationRepeat(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        int i = this.f8227a;
        Object obj2 = this.f8228b;
        switch (i) {
            case 11:
                Intrinsics.checkNotNullParameter(animation, "animation");
                CarouselWithBottomSheetContainerLayout carouselWithBottomSheetContainerLayout = (CarouselWithBottomSheetContainerLayout) obj2;
                CarouselWithBottomSheetContainerLayout.Companion aVar = CarouselWithBottomSheetContainerLayout.INSTANCE;
                z zVar = carouselWithBottomSheetContainerLayout.f107104h;
                if (zVar != null) {
                    zVar.o();
                }
                z zVar2 = carouselWithBottomSheetContainerLayout.f107104h;
                if (zVar2 != null) {
                    zVar2.p();
                }
                break;
            case 12:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((LottieAnimationView) obj2).setVisibility(0);
                break;
            case 13:
            case 14:
            case 15:
            default:
                super.onAnimationStart(animation);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((ViewGroup) obj2).setVisibility(0);
                break;
        }
    }
}
