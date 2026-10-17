package t80;

import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import tx0.b5;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f268790a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f268791b = new WeakHashMap();

    private w() {
    }

    public static void a() {
        ExoPlayer exoPlayer;
        for (Map.Entry entry : f268791b.entrySet()) {
            View view = (View) entry.getKey();
            b5 b5Var = (b5) entry.getValue();
            UiKitPlayerView uiKitPlayerView = b5Var.f275091a.f59491a;
            if (uiKitPlayerView.getVisibility() == 0 && (exoPlayer = uiKitPlayerView.f57712n) != null && exoPlayer.getPlaybackState() == 3) {
                Intrinsics.h(view);
                if (view.getVisibility() == 0) {
                    WallpaperAssetSwitcher wallpaperAssetSwitcher = b5Var.f275091a;
                    WallpaperAssetSwitcher.Companion companion = WallpaperAssetSwitcher.INSTANCE;
                    wallpaperAssetSwitcher.j();
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.removeOnAttachStateChangeListener(this);
        f268791b.remove(v);
    }
}
