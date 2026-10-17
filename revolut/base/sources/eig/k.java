package eig;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f126630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f126631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f126632c;
    public final Data d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f126633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f126634h;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data data, Data data2, Data data3, Data data4, boolean z, boolean z3, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = kVar.f126630a;
        }
        Data accounts = data;
        if ((i & 2) != 0) {
            data2 = kVar.f126631b;
        }
        Data airlines = data2;
        if ((i & 4) != 0) {
            data3 = kVar.f126632c;
        }
        Data transactions = data3;
        if ((i & 8) != 0) {
            data4 = kVar.d;
        }
        Data revPointsAccountStatus = data4;
        if ((i & 16) != 0) {
            z = kVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = kVar.f;
        }
        boolean z6 = z3;
        Data lifestyleBorderlessFooter = (i & 64) != 0 ? kVar.f126633g : data5;
        Data legalEntityContext = (i & 128) != 0 ? kVar.f126634h : data6;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new k(accounts, airlines, transactions, revPointsAccountStatus, z4, z6, lifestyleBorderlessFooter, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f126630a, kVar.f126630a) && Intrinsics.f(this.f126631b, kVar.f126631b) && Intrinsics.f(this.f126632c, kVar.f126632c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && this.f == kVar.f && Intrinsics.f(this.f126633g, kVar.f126633g) && Intrinsics.f(this.f126634h, kVar.f126634h);
    }

    public final int hashCode() {
        return this.f126634h.hashCode() + kii.e.c(this.f126633g, j6.a.c(j6.a.c(kii.e.c(this.d, kii.e.c(this.f126632c, kii.e.c(this.f126631b, this.f126630a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31);
    }

    public k(Data accounts, Data airlines, Data transactions, Data revPointsAccountStatus, boolean z, boolean z3, Data lifestyleBorderlessFooter, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f126630a = accounts;
        this.f126631b = airlines;
        this.f126632c = transactions;
        this.d = revPointsAccountStatus;
        this.e = z;
        this.f = z3;
        this.f126633g = lifestyleBorderlessFooter;
        this.f126634h = legalEntityContext;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true, false, new Data(null, null, false, 7, null), new Data(null, null, true, 3, null));
    }
}
