package wvg;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements ne0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f300460c;
    public final Instant d;
    public final xi0.b e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f300462h;

    public r(String userId, List analyticsProductTypes, eel.c timeSpan, Instant to6, xi0.b currency) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300458a = userId;
        this.f300459b = analyticsProductTypes;
        this.f300460c = timeSpan;
        this.d = to6;
        this.e = currency;
        List list = analyticsProductTypes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(kotlin.jvm.internal.s.Q((iwg.a) it8.next()));
        }
        List listU = zhm.d0.U(arrayList);
        this.f = listU;
        String strK0 = zhm.d0.k0(zhm.d0.O0(listU), "_", null, null, 0, null, 62);
        this.f300461g = strK0;
        String strT = nz8.d.t(this.f300460c, null);
        String str = this.e.f306286a;
        StringBuilder sbM = v0.a.m("complex_analytics_combined_realised_items_", strK0, "_", strT, "_");
        sbM.append(str);
        this.f300462h = sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f300458a, rVar.f300458a) && Intrinsics.f(this.f300459b, rVar.f300459b) && this.f300460c == rVar.f300460c && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f300462h;
    }

    public final int hashCode() {
        return this.e.hashCode() + r6.b.c(prk.o.c(this.f300460c, p.a.d(this.f300458a.hashCode() * 31, 31, this.f300459b), 31), 31, this.d);
    }
}
