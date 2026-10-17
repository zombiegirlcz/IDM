package vsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291842a;

    public e(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f291842a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f291842a, ((e) obj2).f291842a);
    }

    public final int hashCode() {
        return this.f291842a.hashCode();
    }
}
