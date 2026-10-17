package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240211c;
    public final String d;
    public final DateTime e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f240213h;

    public r(String userId, String assetTypesId, eel.c timeSpan, String currency, DateTime timestamp, jo3.b amount, jo3.b bVar, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f240209a = userId;
        this.f240210b = assetTypesId;
        this.f240211c = timeSpan;
        this.d = currency;
        this.e = timestamp;
        this.f = amount;
        this.f240212g = bVar;
        this.f240213h = chartDetailsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f240209a, rVar.f240209a) && Intrinsics.f(this.f240210b, rVar.f240210b) && this.f240211c == rVar.f240211c && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f240212g, rVar.f240212g) && Intrinsics.f(this.f240213h, rVar.f240213h);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f, m72.b.f(this.e, p.a.c(prk.o.c(this.f240211c, p.a.c(this.f240209a.hashCode() * 31, 31, this.f240210b), 31), 31, this.d), 31), 31);
        jo3.b bVar = this.f240212g;
        return this.f240213h.hashCode() + ((iE + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
