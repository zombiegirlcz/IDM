package jv0;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f178736a = new ArrayList();

    private d() {
    }

    public static ExoPlayer a(Context context, DefaultTrackSelector trackSelector) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackSelector, "trackSelector");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(trackSelector).build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
        f178736a.add(new WeakReference(exoPlayerBuild));
        return exoPlayerBuild;
    }

    public static void b(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(false);
        player.clearMediaItems();
        player.release();
        ArrayList arrayList = f178736a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (Intrinsics.f(weakReference.get(), player) || weakReference.get() == null) {
                arrayList.remove(size);
            }
        }
    }
}
