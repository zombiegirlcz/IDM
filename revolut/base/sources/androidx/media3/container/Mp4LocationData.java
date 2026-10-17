package androidx.media3.container;

import androidx.media3.common.Metadata;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Floats;

/* JADX INFO: loaded from: classes15.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public final float latitude;
    public final float longitude;

    public Mp4LocationData(float f, float f4) {
        Preconditions.checkArgument(f >= -90.0f && f <= 90.0f && f4 >= -180.0f && f4 <= 180.0f, "Invalid latitude or longitude");
        this.latitude = f;
        this.longitude = f4;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && Mp4LocationData.class == obj2.getClass()) {
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj2;
            if (this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Floats.hashCode(this.longitude) + ((Floats.hashCode(this.latitude) + 527) * 31);
    }

    public String toString() {
        return "xyz: latitude=" + this.latitude + ", longitude=" + this.longitude;
    }
}
