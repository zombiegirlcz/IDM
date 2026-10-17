package wtk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300016a;

    public i(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f300016a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f300016a, ((i) obj2).f300016a);
    }

    public final int hashCode() {
        return this.f300016a.hashCode();
    }
}
