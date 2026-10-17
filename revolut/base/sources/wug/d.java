package wug;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f300132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f300133c;

    public d(Data accountClosureProgressData, Data wealthDisclaimersData, Data tradingAccountData) {
        Intrinsics.checkNotNullParameter(accountClosureProgressData, "accountClosureProgressData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(tradingAccountData, "tradingAccountData");
        this.f300131a = accountClosureProgressData;
        this.f300132b = wealthDisclaimersData;
        this.f300133c = tradingAccountData;
    }

    public static d a(d dVar, Data accountClosureProgressData, Data wealthDisclaimersData, Data tradingAccountData, int i) {
        if ((i & 1) != 0) {
            accountClosureProgressData = dVar.f300131a;
        }
        if ((i & 2) != 0) {
            wealthDisclaimersData = dVar.f300132b;
        }
        if ((i & 4) != 0) {
            tradingAccountData = dVar.f300133c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(accountClosureProgressData, "accountClosureProgressData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        Intrinsics.checkNotNullParameter(tradingAccountData, "tradingAccountData");
        return new d(accountClosureProgressData, wealthDisclaimersData, tradingAccountData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f300131a, dVar.f300131a) && Intrinsics.f(this.f300132b, dVar.f300132b) && Intrinsics.f(this.f300133c, dVar.f300133c);
    }

    public final int hashCode() {
        return this.f300133c.hashCode() + kii.e.c(this.f300132b, this.f300131a.hashCode() * 31, 31);
    }
}
