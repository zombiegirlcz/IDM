package vsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291841a;

    public d(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f291841a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f291841a, ((d) obj2).f291841a);
    }

    public final int hashCode() {
        return this.f291841a.hashCode();
    }
}
