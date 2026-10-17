package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioTrackAudioOutput.OnRoutingChangedListenerApi24 f7486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7487c;

    public /* synthetic */ b(AudioTrackAudioOutput.OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24, Object obj2, int i) {
        this.f7485a = i;
        this.f7486b = onRoutingChangedListenerApi24;
        this.f7487c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7485a) {
            case 0:
                this.f7486b.lambda$onRoutingChanged$1((AudioRouting) this.f7487c);
                break;
            default:
                this.f7486b.lambda$onRoutingChanged$0((AudioDeviceInfo) this.f7487c);
                break;
        }
    }
}
