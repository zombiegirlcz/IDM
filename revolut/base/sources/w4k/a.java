package w4k;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f294603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq2.b f294604b;

    public a(a3 transaction, kq2.b descriptor) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f294603a = transaction;
        this.f294604b = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f294603a, aVar.f294603a) && Intrinsics.f(this.f294604b, aVar.f294604b);
    }

    public final int hashCode() {
        return this.f294604b.hashCode() + (this.f294603a.hashCode() * 31);
    }
}
