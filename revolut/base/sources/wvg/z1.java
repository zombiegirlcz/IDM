package wvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300512c;
    public final DateTime d;
    public final iwg.c e;
    public final a3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f300514h;

    public z1(String userId, iwg.a analyticsProductType, eel.c timeSpan, DateTime to6, iwg.c method, a3 sector, String str, xi0.b currency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300510a = userId;
        this.f300511b = analyticsProductType;
        this.f300512c = timeSpan;
        this.d = to6;
        this.e = method;
        this.f = sector;
        this.f300513g = str;
        this.f300514h = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f300510a, z1Var.f300510a) && this.f300511b == z1Var.f300511b && this.f300512c == z1Var.f300512c && Intrinsics.f(this.d, z1Var.d) && this.e == z1Var.e && this.f == z1Var.f && Intrinsics.f(this.f300513g, z1Var.f300513g) && Intrinsics.f(this.f300514h, z1Var.f300514h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + prk.o.d(this.e, m72.b.f(this.d, prk.o.c(this.f300512c, (this.f300511b.hashCode() + (this.f300510a.hashCode() * 31)) * 31, 31), 31), 31)) * 31;
        String str = this.f300513g;
        return this.f300514h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
