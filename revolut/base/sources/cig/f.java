package cig;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2f.d f24548a;

    public f(u2f.d airline) {
        Intrinsics.checkNotNullParameter(airline, "airline");
        this.f24548a = airline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f24548a, ((f) obj2).f24548a);
    }

    public final int hashCode() {
        return this.f24548a.hashCode();
    }
}
