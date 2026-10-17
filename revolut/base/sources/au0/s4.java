package au0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.AnimatedSlidingDrawable;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s4 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9361c;

    public /* synthetic */ s4(Object obj2, int i) {
        this.f9359a = i;
        this.f9361c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        switch (this.f9359a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f9360b = true;
                break;
            case 2:
                LargeActionButton largeActionButton = (LargeActionButton) this.f9361c;
                Intrinsics.checkNotNullParameter(animation, "animator");
                if (!this.f9360b) {
                    largeActionButton.setVisibility(8);
                } else {
                    largeActionButton.setAlpha(1.0f);
                    largeActionButton.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
                break;
            case 3:
            default:
                super.onAnimationCancel(animation);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f9360b = true;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f9360b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f9359a) {
            case 0:
                SearchView searchView = (SearchView) this.f9361c;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f9360b) {
                    searchView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    searchView.setVisibility(4);
                } else {
                    searchView.setAlpha(1.0f);
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f9360b) {
                    ((es0.q) this.f9361c).c();
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animator");
                if (!this.f9360b) {
                    ((LargeActionButton) this.f9361c).setVisibility(8);
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f9360b) {
                    ((ScreenContentRecyclerView) this.f9361c).setVisibility(8);
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f9360b) {
                    ((Function0) this.f9361c).invoke();
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimatedSlidingDrawable animatedSlidingDrawable = (AnimatedSlidingDrawable) this.f9361c;
                animatedSlidingDrawable.i = null;
                if (!this.f9360b && animatedSlidingDrawable.f < 2) {
                    animatedSlidingDrawable.c();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f9359a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((SearchView) this.f9361c).setVisibility(0);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f9360b = false;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animator");
                if (this.f9360b) {
                    ((LargeActionButton) this.f9361c).setVisibility(0);
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f9360b) {
                    ((ScreenContentRecyclerView) this.f9361c).setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }

    public /* synthetic */ s4(boolean z, ViewGroup viewGroup, int i) {
        this.f9359a = i;
        this.f9360b = z;
        this.f9361c = viewGroup;
    }

    public s4(SearchView searchView, boolean z) {
        this.f9359a = 0;
        this.f9361c = searchView;
        this.f9360b = z;
    }
}
