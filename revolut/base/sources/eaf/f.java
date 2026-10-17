package eaf;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f124231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccount f124232c;
    public final u8f.d d;

    public f(String searchQuery, Data data, TradingAccount tradingAccount, u8f.d direction) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f124230a = searchQuery;
        this.f124231b = data;
        this.f124232c = tradingAccount;
        this.d = direction;
    }

    public static f a(f fVar, String searchQuery, Data data, int i) {
        if ((i & 1) != 0) {
            searchQuery = fVar.f124230a;
        }
        if ((i & 2) != 0) {
            data = fVar.f124231b;
        }
        TradingAccount tradingAccount = fVar.f124232c;
        u8f.d direction = fVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new f(searchQuery, data, tradingAccount, direction);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f124230a, fVar.f124230a) && Intrinsics.f(this.f124231b, fVar.f124231b) && Intrinsics.f(this.f124232c, fVar.f124232c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f124230a.hashCode() * 31;
        Data data = this.f124231b;
        return this.d.hashCode() + prk.o.b(this.f124232c, (iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31);
    }
}
