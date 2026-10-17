package q0c;

import java.time.YearMonth;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends com.revolut.feature.rev_points.impl.ui.transactions.list.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f241233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f241234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241235c;
    public final String d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final YearMonth f241236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final YearMonth f241237h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f241238j;

    public l(k transactionsPagedData, k71.q transactionsExtraData, String searchQuery, String str, boolean z, List months, YearMonth yearMonth, YearMonth yearMonth2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(transactionsPagedData, "transactionsPagedData");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(months, "months");
        this.f241233a = transactionsPagedData;
        this.f241234b = transactionsExtraData;
        this.f241235c = searchQuery;
        this.d = str;
        this.e = z;
        this.f = months;
        this.f241236g = yearMonth;
        this.f241237h = yearMonth2;
        this.i = z3;
        this.f241238j = z4;
    }

    public static l a(l lVar, k kVar, k71.q qVar, String str, String str2, boolean z, List list, YearMonth yearMonth, YearMonth yearMonth2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            kVar = lVar.f241233a;
        }
        k transactionsPagedData = kVar;
        if ((i & 2) != 0) {
            qVar = lVar.f241234b;
        }
        k71.q transactionsExtraData = qVar;
        if ((i & 4) != 0) {
            str = lVar.f241235c;
        }
        String searchQuery = str;
        if ((i & 8) != 0) {
            str2 = lVar.d;
        }
        String str3 = str2;
        boolean z6 = (i & 16) != 0 ? lVar.e : z;
        List months = (i & 32) != 0 ? lVar.f : list;
        YearMonth yearMonth3 = (i & 64) != 0 ? lVar.f241236g : yearMonth;
        YearMonth yearMonth4 = (i & 128) != 0 ? lVar.f241237h : yearMonth2;
        boolean z11 = (i & 256) != 0 ? lVar.i : z3;
        boolean z12 = (i & 512) != 0 ? lVar.f241238j : z4;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(transactionsPagedData, "transactionsPagedData");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(months, "months");
        return new l(transactionsPagedData, transactionsExtraData, searchQuery, str3, z6, months, yearMonth3, yearMonth4, z11, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f241233a, lVar.f241233a) && Intrinsics.f(this.f241234b, lVar.f241234b) && Intrinsics.f(this.f241235c, lVar.f241235c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f241236g, lVar.f241236g) && Intrinsics.f(this.f241237h, lVar.f241237h) && this.i == lVar.i && this.f241238j == lVar.f241238j;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f241234b.hashCode() + (this.f241233a.hashCode() * 31)) * 31, 31, this.f241235c);
        String str = this.d;
        int iD = p.a.d(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        YearMonth yearMonth = this.f241236g;
        int iHashCode = (iD + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        YearMonth yearMonth2 = this.f241237h;
        return Boolean.hashCode(this.f241238j) + j6.a.c((iHashCode + (yearMonth2 != null ? yearMonth2.hashCode() : 0)) * 31, 31, this.i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(k kVar, k71.q qVar, List list) {
        this(kVar, qVar, "", null, false, list, null, null, false, false);
        m70.a.c(t0.f186434a);
    }
}
