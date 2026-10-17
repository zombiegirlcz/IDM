package m4;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f202612b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f202611a = i;
        this.f202612b = obj2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f202611a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$0((Context) this.f202612b);
            case 1:
                return ExoPlayer.Builder.lambda$new$1((Context) this.f202612b);
            case 2:
                return ExoPlayer.Builder.lambda$new$14((Context) this.f202612b);
            case 3:
                return DefaultBandwidthMeter.getSingletonInstance((Context) this.f202612b);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18((TrackSelector) this.f202612b);
        }
    }
}
