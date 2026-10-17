package q8k;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f243155a;

    public m(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f243155a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f243155a, ((m) obj2).f243155a);
    }

    public final int hashCode() {
        return this.f243155a.hashCode();
    }
}
