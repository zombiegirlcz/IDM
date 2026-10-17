package androidx.media3.exoplayer;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    public static final class Builder {
        private long playbackPositionUs = -9223372036854775807L;
        private float playbackSpeed = -3.4028235E38f;
        private long lastRebufferRealtimeMs = -9223372036854775807L;

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        public Builder setLastRebufferRealtimeMs(long j2) {
            Preconditions.checkArgument(j2 >= 0 || j2 == -9223372036854775807L);
            this.lastRebufferRealtimeMs = j2;
            return this;
        }

        public Builder setPlaybackPositionUs(long j2) {
            this.playbackPositionUs = j2;
            return this;
        }

        public Builder setPlaybackSpeed(float f) {
            Preconditions.checkArgument(f > BitmapDescriptorFactory.HUE_RED || f == -3.4028235E38f);
            this.playbackSpeed = f;
            return this;
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj2;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }
}
