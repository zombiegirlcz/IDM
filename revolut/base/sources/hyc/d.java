package hyc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f156779a;

    public d(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f156779a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f156779a, ((d) obj2).f156779a);
    }

    public final int hashCode() {
        return this.f156779a.hashCode();
    }
}
