package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters {
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    private static final String FIELD_SPEED = Util.intToStringMaxRadix(0);
    private static final String FIELD_PITCH = Util.intToStringMaxRadix(1);

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && PlaybackParameters.class == obj2.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj2;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j2) {
        return j2 * ((long) this.scaledUsPerMs);
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.pitch) + ((Float.floatToRawIntBits(this.speed) + 527) * 31);
    }

    public String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    public PlaybackParameters withSpeed(float f) {
        return new PlaybackParameters(f, this.pitch);
    }

    public PlaybackParameters(float f, float f4) {
        Preconditions.checkArgument(f > BitmapDescriptorFactory.HUE_RED);
        Preconditions.checkArgument(f4 > BitmapDescriptorFactory.HUE_RED);
        this.speed = f;
        this.pitch = f4;
        this.scaledUsPerMs = Math.round(f * 1000.0f);
    }
}
