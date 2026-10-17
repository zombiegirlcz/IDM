package v4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286060a;

    public q(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f286060a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f286060a, ((q) obj2).f286060a);
    }

    public final int hashCode() {
        return this.f286060a.hashCode();
    }
}
