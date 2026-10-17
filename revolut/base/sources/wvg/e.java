package wvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300360c;
    public final DateTime d;
    public final xi0.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300361g;

    public e(String userId, List analyticsProductTypes, eel.c timeSpan, DateTime to6, xi0.b currency, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f300358a = userId;
        this.f300359b = analyticsProductTypes;
        this.f300360c = timeSpan;
        this.d = to6;
        this.e = currency;
        this.f = chartDetailsType;
        String strA = w.a(analyticsProductTypes);
        String strT = nz8.d.t(timeSpan, null);
        String str = currency.f306286a;
        StringBuilder sbM = v0.a.m("complex_analytics_combined_total_value_", userId, "_", strA, "_");
        j6.a.D(sbM, strT, "_", str, "_");
        sbM.append(chartDetailsType);
        this.f300361g = sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f300358a, eVar.f300358a) && Intrinsics.f(this.f300359b, eVar.f300359b) && this.f300360c == eVar.f300360c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    @Override // wvg.a1
    public final String getKey() {
        return this.f300361g;
    }

    public final int hashCode() {
        return this.f.hashCode() + h30.l.j(this.e, m72.b.f(this.d, prk.o.c(this.f300360c, p.a.d(this.f300358a.hashCode() * 31, 31, this.f300359b), 31), 31), 31);
    }
}
