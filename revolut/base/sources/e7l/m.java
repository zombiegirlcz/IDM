package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123417a;

    public m(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.f123417a = videoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f123417a, ((m) obj2).f123417a);
    }

    public final int hashCode() {
        return this.f123417a.hashCode();
    }
}
