package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240206c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240208h;
    public final String i;

    public q(String userId, String assetTypesId, eel.c timeSpan, String currency, DateTime start, DateTime end2, jo3.b bVar, jo3.b bVar2, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f240204a = userId;
        this.f240205b = assetTypesId;
        this.f240206c = timeSpan;
        this.d = currency;
        this.e = start;
        this.f = end2;
        this.f240207g = bVar;
        this.f240208h = bVar2;
        this.i = chartDetailsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f240204a, qVar.f240204a) && Intrinsics.f(this.f240205b, qVar.f240205b) && this.f240206c == qVar.f240206c && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f240207g, qVar.f240207g) && Intrinsics.f(this.f240208h, qVar.f240208h) && Intrinsics.f(this.i, qVar.i);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f, m72.b.f(this.e, p.a.c(prk.o.c(this.f240206c, p.a.c(this.f240204a.hashCode() * 31, 31, this.f240205b), 31), 31, this.d), 31), 31);
        jo3.b bVar = this.f240207g;
        int iHashCode = (iF + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f240208h;
        return this.i.hashCode() + ((iHashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
