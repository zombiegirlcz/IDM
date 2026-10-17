package fof;

import kotlin.jvm.internal.Intrinsics;
import wk5.i;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136948c;
    public final i d;

    public b(String transactionId, String str, String str2, i iVar) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f136946a = transactionId;
        this.f136947b = str;
        this.f136948c = str2;
        this.d = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f136946a, bVar.f136946a) && Intrinsics.f(this.f136947b, bVar.f136947b) && Intrinsics.f(this.f136948c, bVar.f136948c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f136946a.hashCode() * 31;
        String str = this.f136947b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f136948c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i iVar = this.d;
        return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }
}
