package wvg;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300443c;
    public final xi0.b d;
    public final String e;

    public p(String userId, List analyticsProductTypes, eel.c timeSpan, xi0.b currency) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300441a = userId;
        this.f300442b = analyticsProductTypes;
        this.f300443c = timeSpan;
        this.d = currency;
        String strK0 = zhm.d0.k0(analyticsProductTypes, "_", null, null, 0, null, 62);
        this.e = a0.d.u(v0.a.m("complex_analytics_combined_pnl_", userId, "_", strK0, "_"), nz8.d.t(timeSpan, null), "_", currency.f306286a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f300441a, pVar.f300441a) && Intrinsics.f(this.f300442b, pVar.f300442b) && this.f300443c == pVar.f300443c && Intrinsics.f(this.d, pVar.d);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + prk.o.c(this.f300443c, p.a.d(this.f300441a.hashCode() * 31, 31, this.f300442b), 31);
    }
}
