package wvg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ne0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f300339c;
    public final boolean d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f300340g;

    public c(String userId, List analyticsProductTypes, xi0.b currency, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300337a = userId;
        this.f300338b = analyticsProductTypes;
        this.f300339c = currency;
        this.d = z;
        List list = analyticsProductTypes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(kotlin.jvm.internal.s.Q((iwg.a) it8.next()));
        }
        List listU = zhm.d0.U(arrayList);
        this.e = listU;
        String strK0 = zhm.d0.k0(zhm.d0.O0(listU), "_", null, null, 0, null, 62);
        this.f = strK0;
        this.f300340g = "complex_analytics_combined_allocations_" + strK0 + "_" + this.d + "_" + this.f300339c.f306286a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f300337a, cVar.f300337a) && Intrinsics.f(this.f300338b, cVar.f300338b) && Intrinsics.f(this.f300339c, cVar.f300339c) && this.d == cVar.d;
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f300340g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + h30.l.j(this.f300339c, p.a.d(this.f300337a.hashCode() * 31, 31, this.f300338b), 31);
    }
}
