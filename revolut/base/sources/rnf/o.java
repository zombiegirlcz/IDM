package rnf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql4.i f255684a;

    public o(ql4.i instalment) {
        Intrinsics.checkNotNullParameter(instalment, "instalment");
        this.f255684a = instalment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f255684a, ((o) obj2).f255684a);
    }

    public final int hashCode() {
        return this.f255684a.hashCode();
    }
}
