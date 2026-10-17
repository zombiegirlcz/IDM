package wvg;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f300413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f300414c;
    public final xi0.b d;
    public final iwg.c e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300415g;

    public l(eel.c timeSpan, iwg.c method, String userId, String str, List analyticsProductTypes, xi0.b currency) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        this.f300412a = userId;
        this.f300413b = timeSpan;
        this.f300414c = analyticsProductTypes;
        this.d = currency;
        this.e = method;
        this.f = str;
        String strT = nz8.d.t(timeSpan, null);
        String strK0 = zhm.d0.k0(analyticsProductTypes, "_", null, null, 0, null, 62);
        String str2 = currency.f306286a;
        String strR = kotlin.jvm.internal.s.R(method);
        str = str == null ? "" : str;
        StringBuilder sbM = v0.a.m("complex_analytics_combined_performance_", userId, "_", strT, "_");
        j6.a.D(sbM, strK0, "_", str2, "_");
        this.f300415g = a0.d.u(sbM, strR, "_", str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f300412a, lVar.f300412a) && this.f300413b == lVar.f300413b && Intrinsics.f(this.f300414c, lVar.f300414c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && Intrinsics.f(this.f, lVar.f);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300415g;
    }

    public final int hashCode() {
        int iD = prk.o.d(this.e, h30.l.j(this.d, p.a.d(prk.o.c(this.f300413b, this.f300412a.hashCode() * 31, 31), 31, this.f300414c), 31), 31);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
