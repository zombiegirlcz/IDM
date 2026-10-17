package k1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2g.k f180248a;

    public g(j2g.k discoverOutput) {
        Intrinsics.checkNotNullParameter(discoverOutput, "discoverOutput");
        this.f180248a = discoverOutput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f180248a, ((g) obj2).f180248a);
    }

    public final int hashCode() {
        return this.f180248a.hashCode();
    }
}
