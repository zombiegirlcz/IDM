package wvg;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements ne0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f300347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f300348c;
    public final xi0.b d;
    public final iwg.c e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f300349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f300350h;
    public final String i;

    public d(String userId, eel.c timeSpan, List analyticsProductTypes, xi0.b currency, iwg.c method, boolean z, Instant to6) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f300346a = userId;
        this.f300347b = timeSpan;
        this.f300348c = analyticsProductTypes;
        this.d = currency;
        this.e = method;
        this.f = z;
        this.f300349g = to6;
        List list = analyticsProductTypes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(kotlin.jvm.internal.s.Q((iwg.a) it8.next()));
        }
        List listU = zhm.d0.U(arrayList);
        this.f300350h = listU;
        String strK0 = zhm.d0.k0(zhm.d0.O0(listU), "_", null, null, 0, null, 62);
        String strT = nz8.d.t(this.f300347b, null);
        String strR = kotlin.jvm.internal.s.R(this.e);
        boolean z3 = this.f;
        String str = this.d.f306286a;
        StringBuilder sbM = v0.a.m("complex_analytics_combined_contributors_", strK0, "_", strT, "_");
        sbM.append(strR);
        sbM.append("_");
        sbM.append(z3);
        sbM.append("_");
        sbM.append(str);
        this.i = sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f300346a, dVar.f300346a) && this.f300347b == dVar.f300347b && Intrinsics.f(this.f300348c, dVar.f300348c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && Intrinsics.f(this.f300349g, dVar.f300349g);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.i;
    }

    public final int hashCode() {
        return this.f300349g.hashCode() + j6.a.c(prk.o.d(this.e, h30.l.j(this.d, p.a.d(prk.o.c(this.f300347b, this.f300346a.hashCode() * 31, 31), 31, this.f300348c), 31), 31), 31, this.f);
    }
}
