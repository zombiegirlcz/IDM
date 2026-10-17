package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.StreamVolumeManager;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class t implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7590b;

    public /* synthetic */ t(int i, int i2) {
        this.f7589a = i2;
        this.f7590b = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        switch (this.f7589a) {
            case 0:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$2(this.f7590b, (Integer) obj2);
            case 1:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$3(this.f7590b, (Integer) obj2);
            default:
                return StreamVolumeManager.lambda$setStreamType$1(this.f7590b, (StreamVolumeManager.StreamVolumeState) obj2);
        }
    }
}
