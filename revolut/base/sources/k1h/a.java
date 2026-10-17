package k1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180259a;

    public a(j links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f180259a = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f180259a, ((a) obj2).f180259a);
    }

    public final int hashCode() {
        return this.f180259a.hashCode();
    }
}
