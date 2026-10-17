package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class na extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f272954a;

    public na(i7 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f272954a = filter;
    }

    public final i7 a() {
        return this.f272954a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof na) && Intrinsics.f(this.f272954a, ((na) obj2).f272954a);
    }

    public final int hashCode() {
        return this.f272954a.hashCode();
    }
}
