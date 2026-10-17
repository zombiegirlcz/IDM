package tx0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a5 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WallpaperAssetSwitcher f275084a;

    public a5(WallpaperAssetSwitcher wallpaperAssetSwitcher) {
        this.f275084a = wallpaperAssetSwitcher;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        WallpaperAssetSwitcher wallpaperAssetSwitcher = this.f275084a;
        Lifecycle lifecycle = wallpaperAssetSwitcher.f59502r;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        wallpaperAssetSwitcher.f59502r = null;
        wallpaperAssetSwitcher.f59491a.k();
        yy0.f.e(or0.u.k(wallpaperAssetSwitcher.f59492b).Q(), null, wallpaperAssetSwitcher.f59492b, null, null, 12);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        ExoPlayer exoPlayer;
        Intrinsics.checkNotNullParameter(owner, "owner");
        WallpaperAssetSwitcher wallpaperAssetSwitcher = this.f275084a;
        UiKitPlayerView uiKitPlayerView = wallpaperAssetSwitcher.u.f275091a.f59491a;
        if (uiKitPlayerView.getVisibility() != 0 || (exoPlayer = uiKitPlayerView.f57712n) == null || exoPlayer.getPlaybackState() != 3 || (wallpaperAssetSwitcher.getBackground() instanceof x4)) {
            return;
        }
        wallpaperAssetSwitcher.j();
    }
}
