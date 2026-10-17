package k1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180262a;

    public d(j links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f180262a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f180262a, ((d) obj2).f180262a);
    }

    public final int hashCode() {
        return this.f180262a.hashCode();
    }
}
