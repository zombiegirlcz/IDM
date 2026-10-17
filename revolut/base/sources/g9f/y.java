package g9f;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f141578l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f141580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f141581c;
    public final n0 d;
    public final v e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f141582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f141583h;
    public final jo3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f141584j;
    public final List k;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f141578l = new Lazy[]{null, yhm.j.c(kVar, new g53.e(20)), null, yhm.j.c(kVar, new g53.e(21)), yhm.j.c(kVar, new g53.e(22)), null, null, null, null, yhm.j.c(kVar, new g53.e(23)), yhm.j.c(kVar, new g53.e(24))};
    }

    public /* synthetic */ y(int i, String str, g0 g0Var, ZonedDateTime zonedDateTime, n0 n0Var, v vVar, String str2, String str3, String str4, jo3.a aVar, List list, List list2) {
        if (2037 != (i & 2037)) {
            j1.f(w.f141577a.getDescriptor(), i, 2037);
            throw null;
        }
        this.f141579a = str;
        if ((i & 2) == 0) {
            this.f141580b = g0.UNKNOWN;
        } else {
            this.f141580b = g0Var;
        }
        this.f141581c = zonedDateTime;
        if ((i & 8) == 0) {
            this.d = n0.UNKNOWN;
        } else {
            this.d = n0Var;
        }
        this.e = vVar;
        this.f = str2;
        this.f141582g = str3;
        this.f141583h = str4;
        this.i = aVar;
        this.f141584j = list;
        this.k = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f141579a, yVar.f141579a) && this.f141580b == yVar.f141580b && Intrinsics.f(this.f141581c, yVar.f141581c) && this.d == yVar.d && this.e == yVar.e && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f141582g, yVar.f141582g) && Intrinsics.f(this.f141583h, yVar.f141583h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f141584j, yVar.f141584j) && Intrinsics.f(this.k, yVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c((this.e.hashCode() + ((this.d.hashCode() + h30.l.h(this.f141581c, (this.f141580b.hashCode() + (this.f141579a.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31, this.f);
        String str = this.f141582g;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f141583h);
        jo3.a aVar = this.i;
        return this.k.hashCode() + p.a.d((iC2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f141584j);
    }

    public y(String id10, g0 state, ZonedDateTime receivedDate, n0 type, v direction, String brokerName, String str, String accountId, jo3.a aVar, ArrayList steps, ArrayList positions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(receivedDate, "receivedDate");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f141579a = id10;
        this.f141580b = state;
        this.f141581c = receivedDate;
        this.d = type;
        this.e = direction;
        this.f = brokerName;
        this.f141582g = str;
        this.f141583h = accountId;
        this.i = aVar;
        this.f141584j = steps;
        this.k = positions;
    }
}
