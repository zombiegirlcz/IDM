package blh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final clh.o f16643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o97.m0 f16644b;

    public d(clh.o searchHeaderVariant, o97.m0 sourceIdentifier) {
        Intrinsics.checkNotNullParameter(searchHeaderVariant, "searchHeaderVariant");
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        this.f16643a = searchHeaderVariant;
        this.f16644b = sourceIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f16643a, dVar.f16643a) && Intrinsics.f(this.f16644b, dVar.f16644b);
    }

    public final int hashCode() {
        return this.f16644b.hashCode() + (this.f16643a.hashCode() * 31);
    }
}
