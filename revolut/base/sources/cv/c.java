package cv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f109212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f109213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f109214c;
    public final int d;

    public c(a cameraLens) {
        b videoResolution = b.HIGHEST;
        Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
        Intrinsics.checkNotNullParameter(videoResolution, "photoResolution");
        Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
        this.f109212a = cameraLens;
        this.f109213b = videoResolution;
        this.f109214c = videoResolution;
        this.d = 100;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f109212a == cVar.f109212a && this.f109213b == cVar.f109213b && this.f109214c == cVar.f109214c && this.d == cVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.f109214c.hashCode() + ((this.f109213b.hashCode() + (this.f109212a.hashCode() * 31)) * 31)) * 31);
    }
}
