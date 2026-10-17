package androidx.media3.exoplayer.dash.manifest;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class Descriptor {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f7509id;
    public final String schemeIdUri;
    public final String value;

    public Descriptor(String str, String str2, String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.f7509id = str3;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && Descriptor.class == obj2.getClass()) {
            Descriptor descriptor = (Descriptor) obj2;
            if (Objects.equals(this.schemeIdUri, descriptor.schemeIdUri) && Objects.equals(this.value, descriptor.value) && Objects.equals(this.f7509id, descriptor.f7509id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.schemeIdUri.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7509id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
