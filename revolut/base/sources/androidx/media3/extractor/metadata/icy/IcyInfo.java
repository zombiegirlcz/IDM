package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import j6.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public final class IcyInfo implements Metadata.Entry {
    public final byte[] rawMetadata;
    public final String title;

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    public final String f7623url;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.f7623url = str2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || IcyInfo.class != obj2.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((IcyInfo) obj2).rawMetadata);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawMetadata);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.title;
        if (str != null) {
            builder.setTitle(str);
        }
    }

    public String toString() {
        String str = this.title;
        String str2 = this.f7623url;
        return a.v(v0.a.m("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), "\"", this.rawMetadata.length);
    }
}
