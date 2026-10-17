package gof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f145156b;

    public a(String transactionGroupId, n9l.a aVar) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f145155a = transactionGroupId;
        this.f145156b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f145155a, aVar.f145155a) && Intrinsics.f(this.f145156b, aVar.f145156b);
    }

    public final int hashCode() {
        int iHashCode = this.f145155a.hashCode() * 31;
        n9l.a aVar = this.f145156b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
