package pt5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f239626a;

    public v(qua.p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f239626a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f239626a, ((v) obj2).f239626a);
    }

    public final int hashCode() {
        return this.f239626a.hashCode();
    }
}
