package uu0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends ViewPager2.OnPageChangeCallback {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f283125c = R$id.swipeableCardFullSizeContent_image;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su0.c f283126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f283127b;

    public b(su0.c containerAccessor) {
        Intrinsics.checkNotNullParameter(containerAccessor, "containerAccessor");
        this.f283126a = containerAccessor;
        this.f283127b = -1;
    }

    public static Animatable a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        TransitionDrawable transitionDrawable = drawable instanceof TransitionDrawable ? (TransitionDrawable) drawable : null;
        if (transitionDrawable != null && transitionDrawable.getNumberOfLayers() >= 2) {
            Object drawable2 = transitionDrawable.getDrawable(1);
            if (drawable2 instanceof Animatable) {
                return (Animatable) drawable2;
            }
        }
        return null;
    }

    public final ImageView b(int i) {
        SwipeableCardContainerView swipeableCardContainerView = (SwipeableCardContainerView) this.f283126a.invoke(Integer.valueOf(i));
        if (swipeableCardContainerView != null) {
            return (ImageView) swipeableCardContainerView.findViewById(f283125c);
        }
        return null;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        Animatable animatableA;
        ImageView imageViewB;
        Animatable animatableA2;
        Animatable animatableA3;
        if (i2 == 0) {
            ImageView imageViewB2 = b(i);
            if (imageViewB2 != null && (animatableA3 = a(imageViewB2)) != null && !animatableA3.isRunning()) {
                animatableA3.start();
            }
        } else {
            ImageView imageViewB3 = b(i);
            if (imageViewB3 != null && (animatableA = a(imageViewB3)) != null && animatableA.isRunning()) {
                animatableA.stop();
            }
        }
        int i3 = this.f283127b;
        if (i3 == -1 || i3 == i || (imageViewB = b(i3)) == null || (animatableA2 = a(imageViewB)) == null || !animatableA2.isRunning()) {
            return;
        }
        animatableA2.stop();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        Animatable animatableA;
        ImageView imageViewB = b(i);
        if (imageViewB != null && (animatableA = a(imageViewB)) != null && !animatableA.isRunning()) {
            animatableA.start();
        }
        this.f283127b = i;
    }
}
