package androidx.media3.exoplayer.dash.manifest;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseUrl {
    public final int priority;
    public final String serviceLocation;

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    public final String f7508url;
    public final int weight;

    public BaseUrl(String str, String str2, int i, int i2) {
        this.f7508url = str;
        this.serviceLocation = str2;
        this.priority = i;
        this.weight = i2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BaseUrl)) {
            return false;
        }
        BaseUrl baseUrl = (BaseUrl) obj2;
        return this.priority == baseUrl.priority && this.weight == baseUrl.weight && Objects.equals(this.f7508url, baseUrl.f7508url) && Objects.equals(this.serviceLocation, baseUrl.serviceLocation);
    }

    public int hashCode() {
        return Objects.hash(this.f7508url, this.serviceLocation, Integer.valueOf(this.priority), Integer.valueOf(this.weight));
    }
}
