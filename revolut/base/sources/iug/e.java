package iug;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingAccount f168592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168593c;

    public e(Data tradingLegalEntityInformationData, TradingAccount account, boolean z) {
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformationData, "tradingLegalEntityInformationData");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f168591a = tradingLegalEntityInformationData;
        this.f168592b = account;
        this.f168593c = z;
    }

    public static e a(e eVar, Data tradingLegalEntityInformationData, boolean z, int i) {
        if ((i & 1) != 0) {
            tradingLegalEntityInformationData = eVar.f168591a;
        }
        TradingAccount account = eVar.f168592b;
        if ((i & 4) != 0) {
            z = eVar.f168593c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformationData, "tradingLegalEntityInformationData");
        Intrinsics.checkNotNullParameter(account, "account");
        return new e(tradingLegalEntityInformationData, account, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f168591a, eVar.f168591a) && Intrinsics.f(this.f168592b, eVar.f168592b) && this.f168593c == eVar.f168593c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168593c) + o.b(this.f168592b, this.f168591a.hashCode() * 31, 31);
    }
}
