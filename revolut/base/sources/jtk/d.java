package jtk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178527a;

    public d(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f178527a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f178527a, ((d) obj2).f178527a);
    }

    public final int hashCode() {
        return this.f178527a.hashCode();
    }
}
