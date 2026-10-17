package wvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300484c;
    public final DateTime d;
    public final iwg.c e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f300486h;

    public v0(String userId, iwg.a analyticsProductType, eel.c timeSpan, DateTime to6, iwg.c method, boolean z, String str, xi0.b currency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300482a = userId;
        this.f300483b = analyticsProductType;
        this.f300484c = timeSpan;
        this.d = to6;
        this.e = method;
        this.f = z;
        this.f300485g = str;
        this.f300486h = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f300482a, v0Var.f300482a) && this.f300483b == v0Var.f300483b && this.f300484c == v0Var.f300484c && Intrinsics.f(this.d, v0Var.d) && this.e == v0Var.e && this.f == v0Var.f && Intrinsics.f(this.f300485g, v0Var.f300485g) && Intrinsics.f(this.f300486h, v0Var.f300486h);
    }

    public final int hashCode() {
        int iC = j6.a.c(prk.o.d(this.e, m72.b.f(this.d, prk.o.c(this.f300484c, (this.f300483b.hashCode() + (this.f300482a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f);
        String str = this.f300485g;
        return this.f300486h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
