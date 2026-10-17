package jzh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f179814a;

    public b(d0 d0Var) {
        this.f179814a = d0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f179814a, ((b) obj2).f179814a);
    }

    public final int hashCode() {
        d0 d0Var = this.f179814a;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.hashCode();
    }
}
