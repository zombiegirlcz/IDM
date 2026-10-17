package baf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f14054c;
    public final boolean d;
    public final TransferBroker e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TradingAccount f14055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u8f.d f14056h;

    public i(String str, String str2, wi0.b bVar, boolean z, TransferBroker broker, boolean z3, TradingAccount tradingAccount, u8f.d direction) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f14052a = str;
        this.f14053b = str2;
        this.f14054c = bVar;
        this.d = z;
        this.e = broker;
        this.f = z3;
        this.f14055g = tradingAccount;
        this.f14056h = direction;
    }

    public static i a(i iVar, String str, String str2, wi0.b bVar, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = iVar.f14052a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = iVar.f14053b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bVar = iVar.f14054c;
        }
        wi0.b bVar2 = bVar;
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        boolean z4 = z;
        TransferBroker broker = iVar.e;
        if ((i & 32) != 0) {
            z3 = iVar.f;
        }
        TradingAccount tradingAccount = iVar.f14055g;
        u8f.d direction = iVar.f14056h;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new i(str3, str4, bVar2, z4, broker, z3, tradingAccount, direction);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f14052a, iVar.f14052a) && Intrinsics.f(this.f14053b, iVar.f14053b) && Intrinsics.f(this.f14054c, iVar.f14054c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f14055g, iVar.f14055g) && this.f14056h == iVar.f14056h;
    }

    public final int hashCode() {
        String str = this.f14052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f14053b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        wi0.b bVar = this.f14054c;
        return this.f14056h.hashCode() + prk.o.b(this.f14055g, j6.a.c((this.e.hashCode() + j6.a.c((iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f), 31);
    }
}
