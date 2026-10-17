package mz0;

import androidx.media3.exoplayer.ExoPlayer;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import jv0.i;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f210569a = v.n(new nz0.c(), new nz0.b(), new nz0.a());

    public final void a(Video video, c playerView, jz0.c cVar) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        if (video != null) {
            ArrayList arrayList = this.f210569a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b bVar = (b) arrayList.get(i);
                if (bVar.a(video)) {
                    bVar.b(video, playerView, cVar);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) playerView;
        uiKitPlayerView.m();
        i iVar = uiKitPlayerView.f57717t;
        iVar.a();
        if (uiKitPlayerView.getExternalMediaRegistry() != null) {
            ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
            if (exoPlayer != null) {
                exoPlayer.stop();
            }
        } else {
            uiKitPlayerView.k();
        }
        iVar.onPlayWhenReadyChanged(false, 1);
    }
}
