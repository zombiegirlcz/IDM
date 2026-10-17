package d2i;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f110847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f110849c;
    public final c d;
    public final long e;
    public final wd6.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f110850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f110851h;

    public b(dj0.d moneyFrom, String str, dj0.d moneyTo, c exchangeOperation, long j2, wd6.e exchangeMode, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(moneyFrom, "moneyFrom");
        Intrinsics.checkNotNullParameter(moneyTo, "moneyTo");
        Intrinsics.checkNotNullParameter(exchangeOperation, "exchangeOperation");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f110847a = moneyFrom;
        this.f110848b = str;
        this.f110849c = moneyTo;
        this.d = exchangeOperation;
        this.e = j2;
        this.f = exchangeMode;
        this.f110850g = d;
        this.f110851h = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f110847a.equals(bVar.f110847a) && Intrinsics.f(this.f110848b, bVar.f110848b) && this.f110849c.equals(bVar.f110849c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f110850g, bVar.f110850g) && Intrinsics.f(this.f110851h, bVar.f110851h);
    }

    public final int hashCode() {
        int iHashCode = this.f110847a.hashCode() * 31;
        String str = this.f110848b;
        int iG = y.g(this.f, a0.d.c((this.d.hashCode() + v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f110849c)) * 31, 31, this.e), 961);
        Double d = this.f110850g;
        int iHashCode2 = (iG + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f110851h;
        return (iHashCode2 + (d5 != null ? d5.hashCode() : 0)) * 31;
    }
}
