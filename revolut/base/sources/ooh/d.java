package ooh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import zel.f;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227114a = v.k(z.EQUITY, z.ADR, z.WARRANT, z.SPAC);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f227115b = v.k(z.ETF, z.ETC, z.ETN);

    public final f a(List types) {
        Intrinsics.checkNotNullParameter(types, "types");
        List list = types;
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (this.f227114a.contains((z) it8.next())) {
                    return f.STOCKS;
                }
            }
        }
        if (!z || !list.isEmpty()) {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (this.f227115b.contains((z) it9.next())) {
                    return f.ETP;
                }
            }
        }
        return types.contains(z.BOND) ? f.BOND : types.contains(z.CFD) ? f.CFD : f.STOCKS;
    }

    public final List b(f group) {
        Intrinsics.checkNotNullParameter(group, "group");
        int i = c.f227113a[group.ordinal()];
        if (i == 1) {
            return this.f227114a;
        }
        if (i == 2) {
            return this.f227115b;
        }
        if (i == 3) {
            return u.c(z.BOND);
        }
        if (i == 4) {
            return u.c(z.CFD);
        }
        throw new NoWhenBranchMatchedException();
    }
}
