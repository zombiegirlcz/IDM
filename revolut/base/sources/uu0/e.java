package uu0;

import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.RichVideoPlayerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends ViewPager2.OnPageChangeCallback {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f283130c = R$id.swipeableCardVideoDelegate_playerView;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su0.c f283131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f283132b;

    public e(su0.c containerAccessor) {
        Intrinsics.checkNotNullParameter(containerAccessor, "containerAccessor");
        this.f283131a = containerAccessor;
        this.f283132b = -1;
    }

    public static void a(RichVideoPlayerView richVideoPlayerView) {
        long duration = richVideoPlayerView.getDuration() - richVideoPlayerView.getPosition();
        if (duration < 0) {
            duration = 0;
        }
        if (duration == 0) {
            richVideoPlayerView.setPosition(0L);
        }
        ((UiKitPlayerView) richVideoPlayerView.f58849a.getContentPlayerView()).i();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        SwipeableCardContainerView swipeableCardContainerView;
        RichVideoPlayerView richVideoPlayerView;
        Integer numValueOf = Integer.valueOf(i);
        su0.c cVar = this.f283131a;
        SwipeableCardContainerView swipeableCardContainerView2 = (SwipeableCardContainerView) cVar.invoke(numValueOf);
        int i3 = f283130c;
        RichVideoPlayerView richVideoPlayerView2 = swipeableCardContainerView2 != null ? (RichVideoPlayerView) swipeableCardContainerView2.findViewById(i3) : null;
        if (i2 == 0) {
            if (richVideoPlayerView2 != null) {
                a(richVideoPlayerView2);
            }
        } else if (richVideoPlayerView2 != null) {
            ((UiKitPlayerView) richVideoPlayerView2.f58849a.getContentPlayerView()).h();
        }
        int i5 = this.f283132b;
        if (i5 == -1 || i5 == i || (swipeableCardContainerView = (SwipeableCardContainerView) cVar.invoke(Integer.valueOf(i5))) == null || (richVideoPlayerView = (RichVideoPlayerView) swipeableCardContainerView.findViewById(i3)) == null) {
            return;
        }
        ((UiKitPlayerView) richVideoPlayerView.f58849a.getContentPlayerView()).h();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        SwipeableCardContainerView swipeableCardContainerView = (SwipeableCardContainerView) this.f283131a.invoke(Integer.valueOf(i));
        RichVideoPlayerView richVideoPlayerView = swipeableCardContainerView != null ? (RichVideoPlayerView) swipeableCardContainerView.findViewById(f283130c) : null;
        if (richVideoPlayerView != null) {
            a(richVideoPlayerView);
        }
        this.f283132b = i;
    }
}
