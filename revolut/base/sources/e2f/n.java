package e2f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f122075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f122076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f122077c;
    public final Data d;
    public final Data e;

    public n() {
        this(0);
    }

    public static n a(n nVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = nVar.f122075a;
        }
        Data agentDetails = data;
        if ((i & 2) != 0) {
            data2 = nVar.f122076b;
        }
        Data userVouchers = data2;
        if ((i & 4) != 0) {
            data3 = nVar.f122077c;
        }
        Data revPointsMenuItem = data3;
        if ((i & 8) != 0) {
            data4 = nVar.d;
        }
        Data account = data4;
        if ((i & 16) != 0) {
            data5 = nVar.e;
        }
        Data transactions = data5;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(agentDetails, "agentDetails");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        Intrinsics.checkNotNullParameter(revPointsMenuItem, "revPointsMenuItem");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new n(agentDetails, userVouchers, revPointsMenuItem, account, transactions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f122075a, nVar.f122075a) && Intrinsics.f(this.f122076b, nVar.f122076b) && Intrinsics.f(this.f122077c, nVar.f122077c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f122077c, kii.e.c(this.f122076b, this.f122075a.hashCode() * 31, 31), 31), 31);
    }

    public n(Data agentDetails, Data userVouchers, Data revPointsMenuItem, Data account, Data transactions) {
        Intrinsics.checkNotNullParameter(agentDetails, "agentDetails");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        Intrinsics.checkNotNullParameter(revPointsMenuItem, "revPointsMenuItem");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f122075a = agentDetails;
        this.f122076b = userVouchers;
        this.f122077c = revPointsMenuItem;
        this.d = account;
        this.e = transactions;
    }

    public /* synthetic */ n(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
