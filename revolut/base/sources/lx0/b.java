package lx0;

import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import skm.l;
import yhm.m;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f200504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f200505b;

    public b(ExoPlayer exoPlayer, l lVar) {
        this.f200504a = exoPlayer;
        this.f200505b = lVar;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        ExoPlayer exoPlayer = this.f200504a;
        if (i == 1 || exoPlayer.getPlaybackState() == 4) {
            exoPlayer.removeListener(this);
            m.Companion companion = m.INSTANCE;
            this.f200505b.resumeWith(Unit.f186387a);
        }
    }
}
