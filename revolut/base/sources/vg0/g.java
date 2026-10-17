package vg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288691a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return Intrinsics.f(this.f288691a, ((g) obj2).f288691a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f288691a.hashCode();
    }

    public final String toString() {
        return p.a.p("ExcludeCredential(value=", this.f288691a, ")");
    }
}
