package mif;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.q7;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f205839a;

    public x(q7 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f205839a = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f205839a.equals(((x) obj2).f205839a);
    }

    @Override // mif.y
    public final i7 getFilter() {
        return this.f205839a;
    }

    public final int hashCode() {
        return this.f205839a.f273011a.hashCode();
    }
}
