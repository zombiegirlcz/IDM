package axd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f10926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bxd.a f10927b;

    public a(dj0.d balance, bxd.a operation) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f10926a = balance;
        this.f10927b = operation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f10926a, aVar.f10926a) && this.f10927b == aVar.f10927b;
    }

    public final int hashCode() {
        return this.f10927b.hashCode() + (this.f10926a.hashCode() * 31);
    }
}
