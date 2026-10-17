package qx2;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250011a;

    public d(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.f250011a = videoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f250011a, ((d) obj2).f250011a);
    }

    public final int hashCode() {
        return this.f250011a.hashCode();
    }
}
