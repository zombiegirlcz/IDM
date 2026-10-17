package androidx.media3.exoplayer;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7520b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f7519a = i;
        this.f7520b = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj2) {
        switch (this.f7519a) {
            case 0:
                ((Player.Listener) obj2).onMediaMetadataChanged((MediaMetadata) this.f7520b);
                break;
            default:
                ((Player.Listener) obj2).onVideoSizeChanged((VideoSize) this.f7520b);
                break;
        }
    }
}
