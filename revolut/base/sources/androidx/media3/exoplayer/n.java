package androidx.media3.exoplayer;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class n implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7564b;

    public /* synthetic */ n(boolean z, int i) {
        this.f7563a = i;
        this.f7564b = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f7563a) {
            case 0:
                ((Player.Listener) obj2).onShuffleModeEnabledChanged(this.f7564b);
                break;
            default:
                ((Player.Listener) obj2).onSkipSilenceEnabledChanged(this.f7564b);
                break;
        }
    }
}
