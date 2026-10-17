package androidx.media3.extractor.metadata.id3;

import java.util.Objects;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
public final class UrlLinkFrame extends Id3Frame {
    public final String description;

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    public final String f7625url;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.f7625url = str3;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && UrlLinkFrame.class == obj2.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj2;
            if (this.f7624id.equals(urlLinkFrame.f7624id) && Objects.equals(this.description, urlLinkFrame.description) && Objects.equals(this.f7625url, urlLinkFrame.f7625url)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iC = a.c(527, 31, this.f7624id);
        String str = this.description;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7625url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f7624id + ": url=" + this.f7625url;
    }
}
