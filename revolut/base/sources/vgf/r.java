package vgf;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f289122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f289123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f289124c;
    public final String d;
    public final Map e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f289125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f289126h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f289127j;
    public final a3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f289128l;

    public r(Data transactions, Data upcomingPayments, Long l2, String searchQuery, Map hiddenTransactionsInSearch, Long l3, boolean z, boolean z3, boolean z4, boolean z6, a3 a3Var, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(hiddenTransactionsInSearch, "hiddenTransactionsInSearch");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f289122a = transactions;
        this.f289123b = upcomingPayments;
        this.f289124c = l2;
        this.d = searchQuery;
        this.e = hiddenTransactionsInSearch;
        this.f = l3;
        this.f289125g = z;
        this.f289126h = z3;
        this.i = z4;
        this.f289127j = z6;
        this.k = a3Var;
        this.f289128l = legalEntityContext;
    }

    public static r a(r rVar, Data data, Data data2, Long l2, String str, Map map, Long l3, boolean z, boolean z3, boolean z4, boolean z6, a3 a3Var, Data data3, int i) {
        if ((i & 1) != 0) {
            data = rVar.f289122a;
        }
        Data transactions = data;
        if ((i & 2) != 0) {
            data2 = rVar.f289123b;
        }
        Data upcomingPayments = data2;
        Long l4 = (i & 4) != 0 ? rVar.f289124c : l2;
        String searchQuery = (i & 8) != 0 ? rVar.d : str;
        Map hiddenTransactionsInSearch = (i & 16) != 0 ? rVar.e : map;
        Long l5 = (i & 32) != 0 ? rVar.f : l3;
        boolean z11 = (i & 64) != 0 ? rVar.f289125g : z;
        boolean z12 = (i & 128) != 0 ? rVar.f289126h : z3;
        boolean z29 = (i & 256) != 0 ? rVar.i : z4;
        boolean z31 = (i & 512) != 0 ? rVar.f289127j : z6;
        a3 a3Var2 = (i & 1024) != 0 ? rVar.k : a3Var;
        Data legalEntityContext = (i & 2048) != 0 ? rVar.f289128l : data3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(hiddenTransactionsInSearch, "hiddenTransactionsInSearch");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new r(transactions, upcomingPayments, l4, searchQuery, hiddenTransactionsInSearch, l5, z11, z12, z29, z31, a3Var2, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f289122a, rVar.f289122a) && Intrinsics.f(this.f289123b, rVar.f289123b) && Intrinsics.f(this.f289124c, rVar.f289124c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && this.f289125g == rVar.f289125g && this.f289126h == rVar.f289126h && this.i == rVar.i && this.f289127j == rVar.f289127j && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f289128l, rVar.f289128l);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f289123b, this.f289122a.hashCode() * 31, 31);
        Long l2 = this.f289124c;
        int iE = p.a.e(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e);
        Long l3 = this.f;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iE + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f289125g), 31, this.f289126h), 31, this.i), 31, this.f289127j);
        a3 a3Var = this.k;
        return this.f289128l.hashCode() + ((iC2 + (a3Var != null ? a3Var.hashCode() : 0)) * 31);
    }
}
