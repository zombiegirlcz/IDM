package hi9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152534c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f152535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f152536h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f152537j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f152538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f152539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f152540n;

    public a(String planId, int i, long j2, String state, String currency, Long l2, List transactionIds, long j3, long j5, long j16, long j22, long j42, long j46, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f152532a = planId;
        this.f152533b = i;
        this.f152534c = j2;
        this.d = state;
        this.e = currency;
        this.f = l2;
        this.f152535g = transactionIds;
        this.f152536h = j3;
        this.i = j5;
        this.f152537j = j16;
        this.k = j22;
        this.f152538l = j42;
        this.f152539m = j46;
        this.f152540n = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f152532a, aVar.f152532a) && this.f152533b == aVar.f152533b && this.f152534c == aVar.f152534c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f152535g, aVar.f152535g) && this.f152536h == aVar.f152536h && this.i == aVar.i && this.f152537j == aVar.f152537j && this.k == aVar.k && this.f152538l == aVar.f152538l && this.f152539m == aVar.f152539m && this.f152540n == aVar.f152540n;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a0.d.c(j6.a.b(this.f152533b, this.f152532a.hashCode() * 31, 31), 31, this.f152534c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        return Boolean.hashCode(this.f152540n) + a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(p.a.d((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f152535g), 31, this.f152536h), 31, this.i), 31, this.f152537j), 31, this.k), 31, this.f152538l), 31, this.f152539m);
    }
}
