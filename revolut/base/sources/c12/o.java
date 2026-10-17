package c12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20344a;

    public o(Object obj2) {
        this.f20344a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f20344a, ((o) obj2).f20344a);
    }

    public final int hashCode() {
        Object obj2 = this.f20344a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
