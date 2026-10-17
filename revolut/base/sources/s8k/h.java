package s8k;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f261066a;

    public h(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f261066a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f261066a, ((h) obj2).f261066a);
    }

    public final int hashCode() {
        return this.f261066a.hashCode();
    }
}
