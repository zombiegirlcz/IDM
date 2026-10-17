package aig;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f5263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f5264c;
    public final boolean d;
    public final boolean e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f5265g;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data data, Data data2, Data data3, boolean z, boolean z3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = iVar.f5262a;
        }
        Data accounts = data;
        if ((i & 2) != 0) {
            data2 = iVar.f5263b;
        }
        Data airlines = data2;
        if ((i & 4) != 0) {
            data3 = iVar.f5264c;
        }
        Data transactions = data3;
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z3 = iVar.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            data4 = iVar.f;
        }
        Data lifestyleBorderlessFooter = data4;
        if ((i & 64) != 0) {
            data5 = iVar.f5265g;
        }
        Data legalEntityContext = data5;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new i(accounts, airlines, transactions, lifestyleBorderlessFooter, legalEntityContext, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f5262a, iVar.f5262a) && Intrinsics.f(this.f5263b, iVar.f5263b) && Intrinsics.f(this.f5264c, iVar.f5264c) && this.d == iVar.d && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f5265g, iVar.f5265g);
    }

    public final int hashCode() {
        return this.f5265g.hashCode() + kii.e.c(this.f, j6.a.c(j6.a.c(kii.e.c(this.f5264c, kii.e.c(this.f5263b, this.f5262a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31);
    }

    public i(Data accounts, Data airlines, Data transactions, Data lifestyleBorderlessFooter, Data legalEntityContext, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f5262a = accounts;
        this.f5263b = airlines;
        this.f5264c = transactions;
        this.d = z;
        this.e = z3;
        this.f = lifestyleBorderlessFooter;
        this.f5265g = legalEntityContext;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), true, false);
    }
}
