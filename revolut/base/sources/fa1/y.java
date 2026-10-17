package fa1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f133224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f133225c;
    public final String d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f133226g;

    public y(String paymentId, d result, b bVar, String str, boolean z, List list, boolean z3) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f133223a = paymentId;
        this.f133224b = result;
        this.f133225c = bVar;
        this.d = str;
        this.e = z;
        this.f = list;
        this.f133226g = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f133223a, yVar.f133223a) && this.f133224b == yVar.f133224b && this.f133225c == yVar.f133225c && Intrinsics.f(this.d, yVar.d) && this.e == yVar.e && Intrinsics.f(this.f, yVar.f) && this.f133226g == yVar.f133226g;
    }

    public final int hashCode() {
        int iHashCode = (this.f133224b.hashCode() + (this.f133223a.hashCode() * 31)) * 31;
        b bVar = this.f133225c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        List list = this.f;
        return Boolean.hashCode(this.f133226g) + ((iC + (list != null ? list.hashCode() : 0)) * 31);
    }
}
