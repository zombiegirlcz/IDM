package wvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300380c;
    public final DateTime d;
    public final xi0.b e;
    public final String f;

    public g1(String userId, iwg.a analyticsProductType, eel.c timeSpan, DateTime to6, xi0.b currency, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300378a = userId;
        this.f300379b = analyticsProductType;
        this.f300380c = timeSpan;
        this.d = to6;
        this.e = currency;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f300378a, g1Var.f300378a) && this.f300379b == g1Var.f300379b && this.f300380c == g1Var.f300380c && Intrinsics.f(this.d, g1Var.d) && Intrinsics.f(this.e, g1Var.e) && Intrinsics.f(this.f, g1Var.f);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.e, m72.b.f(this.d, prk.o.c(this.f300380c, (this.f300379b.hashCode() + (this.f300378a.hashCode() * 31)) * 31, 31), 31), 31);
        String str = this.f;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
