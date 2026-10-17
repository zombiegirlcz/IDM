package androidx.media3.container;

import androidx.media3.common.Metadata;

/* JADX INFO: loaded from: classes15.dex */
public final class Mp4AlternateGroupData implements Metadata.Entry {
    public final int alternateGroup;

    public Mp4AlternateGroupData(int i) {
        this.alternateGroup = i;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof Mp4AlternateGroupData) && this.alternateGroup == ((Mp4AlternateGroupData) obj2).alternateGroup;
    }

    public int hashCode() {
        return this.alternateGroup;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.alternateGroup;
    }
}
