package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240200c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240202h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jo3.b f240203j;
    public final jo3.b k;

    public p(String userId, String assetTypesId, eel.c timeSpan, String currency, DateTime start, DateTime end2, jo3.b bVar, jo3.b bVar2, DateTime timestamp, jo3.b amount, jo3.b bVar3) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f240198a = userId;
        this.f240199b = assetTypesId;
        this.f240200c = timeSpan;
        this.d = currency;
        this.e = start;
        this.f = end2;
        this.f240201g = bVar;
        this.f240202h = bVar2;
        this.i = timestamp;
        this.f240203j = amount;
        this.k = bVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f240198a, pVar.f240198a) && Intrinsics.f(this.f240199b, pVar.f240199b) && this.f240200c == pVar.f240200c && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f240201g, pVar.f240201g) && Intrinsics.f(this.f240202h, pVar.f240202h) && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f240203j, pVar.f240203j) && Intrinsics.f(this.k, pVar.k);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f, m72.b.f(this.e, p.a.c(prk.o.c(this.f240200c, p.a.c(this.f240198a.hashCode() * 31, 31, this.f240199b), 31), 31, this.d), 31), 31);
        jo3.b bVar = this.f240201g;
        int iHashCode = (iF + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f240202h;
        int iE = wp5.y.e(this.f240203j, m72.b.f(this.i, (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31), 31);
        jo3.b bVar3 = this.k;
        return iE + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
