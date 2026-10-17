package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240188c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240190h;
    public final jo3.b i;

    public n(String userId, String assetTypesId, eel.c timeSpan, String currency, DateTime pointStart, DateTime pointEnd, jo3.b netSell, jo3.b bVar, jo3.b cumulative) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(assetTypesId, "assetTypesId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pointStart, "pointStart");
        Intrinsics.checkNotNullParameter(pointEnd, "pointEnd");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(cumulative, "cumulative");
        this.f240186a = userId;
        this.f240187b = assetTypesId;
        this.f240188c = timeSpan;
        this.d = currency;
        this.e = pointStart;
        this.f = pointEnd;
        this.f240189g = netSell;
        this.f240190h = bVar;
        this.i = cumulative;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f240186a, nVar.f240186a) && Intrinsics.f(this.f240187b, nVar.f240187b) && this.f240188c == nVar.f240188c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f240189g, nVar.f240189g) && Intrinsics.f(this.f240190h, nVar.f240190h) && Intrinsics.f(this.i, nVar.i);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f240189g, m72.b.f(this.f, m72.b.f(this.e, p.a.c(prk.o.c(this.f240188c, p.a.c(this.f240186a.hashCode() * 31, 31, this.f240187b), 31), 31, this.d), 31), 31), 31);
        jo3.b bVar = this.f240190h;
        return this.i.hashCode() + ((iE + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
