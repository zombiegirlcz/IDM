package ij4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3.b f161703a;

    public h(iy3.b valuator) {
        Intrinsics.checkNotNullParameter(valuator, "valuator");
        this.f161703a = valuator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f161703a, ((h) obj2).f161703a);
    }

    public final int hashCode() {
        return this.f161703a.hashCode();
    }
}
