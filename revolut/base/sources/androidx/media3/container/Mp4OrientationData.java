package androidx.media3.container;

import androidx.media3.common.Metadata;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public final int orientation;

    public Mp4OrientationData(int i) {
        Preconditions.checkArgument(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.orientation = i;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof Mp4OrientationData) && this.orientation == ((Mp4OrientationData) obj2).orientation;
    }

    public int hashCode() {
        return Integer.hashCode(this.orientation) + 527;
    }

    public String toString() {
        return "Orientation= " + this.orientation;
    }
}
