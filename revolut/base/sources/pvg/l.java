package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240180c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240182h;
    public final jo3.b i;

    public l(String userId, String assetTypesId, eel.c timeSpan, String currency, DateTime start, DateTime end2, jo3.b netSell, jo3.b bVar, jo3.b cumulative) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(cumulative, "cumulative");
        this.f240178a = userId;
        this.f240179b = assetTypesId;
        this.f240180c = timeSpan;
        this.d = currency;
        this.e = start;
        this.f = end2;
        this.f240181g = netSell;
        this.f240182h = bVar;
        this.i = cumulative;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f240178a, lVar.f240178a) && Intrinsics.f(this.f240179b, lVar.f240179b) && this.f240180c == lVar.f240180c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f240181g, lVar.f240181g) && Intrinsics.f(this.f240182h, lVar.f240182h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f240181g, m72.b.f(this.f, m72.b.f(this.e, p.a.c(prk.o.c(this.f240180c, p.a.c(this.f240178a.hashCode() * 31, 31, this.f240179b), 31), 31, this.d), 31), 31), 31);
        jo3.b bVar = this.f240182h;
        return wp5.y.e(this.i, (iE + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
    }
}
