package pt5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f239624a;

    public p(qua.p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f239624a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f239624a, ((p) obj2).f239624a);
    }

    public final int hashCode() {
        return this.f239624a.hashCode();
    }
}
