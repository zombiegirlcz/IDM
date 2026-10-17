package k1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180260a;

    public b(j links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f180260a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f180260a, ((b) obj2).f180260a);
    }

    public final int hashCode() {
        return this.f180260a.hashCode();
    }
}
