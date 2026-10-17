package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.SuitableOutputChecker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ExoPlayerImplInternal.PlaybackInfoUpdateListener, BackgroundThreadStateHandler.StateChangeListener, SuitableOutputChecker.Callback, ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayerImpl f7554a;

    public /* synthetic */ l(ExoPlayerImpl exoPlayerImpl) {
        this.f7554a = exoPlayerImpl;
    }

    public void a(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f7554a.lambda$new$2(playbackInfoUpdate);
    }

    public void b(boolean z) {
        this.f7554a.onSelectedOutputSuitabilityChanged(z);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        this.f7554a.lambda$updateAvailableCommands$31((Player.Listener) obj2);
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj2, Object obj3) {
        this.f7554a.onAudioSessionIdChanged(((Integer) obj2).intValue(), ((Integer) obj3).intValue());
    }
}
