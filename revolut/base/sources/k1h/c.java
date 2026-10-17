package k1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180261a;

    public c(j links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f180261a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f180261a, ((c) obj2).f180261a);
    }

    public final int hashCode() {
        return this.f180261a.hashCode();
    }
}
