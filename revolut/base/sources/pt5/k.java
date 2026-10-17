package pt5;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f239621a;

    public k(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f239621a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f239621a, ((k) obj2).f239621a);
    }

    public final int hashCode() {
        return this.f239621a.hashCode();
    }
}
