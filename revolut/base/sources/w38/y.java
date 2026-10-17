package w38;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n38.a f294241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f294242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nce.a f294243c;

    public y(n38.a jointAccount, i7 transactionsFilter, nce.a aVar) {
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        this.f294241a = jointAccount;
        this.f294242b = transactionsFilter;
        this.f294243c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f294241a, yVar.f294241a) && Intrinsics.f(this.f294242b, yVar.f294242b) && Intrinsics.f(this.f294243c, yVar.f294243c);
    }

    public final int hashCode() {
        int iHashCode = (this.f294242b.hashCode() + (this.f294241a.hashCode() * 31)) * 31;
        nce.a aVar = this.f294243c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
