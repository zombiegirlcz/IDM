package taf;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount f269313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f269314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f269315c;

    public f(TradingAccount tradingAccount, Data isTransferInAllowed, Data isTransferOutAllowed) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(isTransferInAllowed, "isTransferInAllowed");
        Intrinsics.checkNotNullParameter(isTransferOutAllowed, "isTransferOutAllowed");
        this.f269313a = tradingAccount;
        this.f269314b = isTransferInAllowed;
        this.f269315c = isTransferOutAllowed;
    }

    public static f a(f fVar, Data isTransferOutAllowed) {
        TradingAccount tradingAccount = fVar.f269313a;
        Data isTransferInAllowed = fVar.f269314b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(isTransferInAllowed, "isTransferInAllowed");
        Intrinsics.checkNotNullParameter(isTransferOutAllowed, "isTransferOutAllowed");
        return new f(tradingAccount, isTransferInAllowed, isTransferOutAllowed);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f269313a, fVar.f269313a) && Intrinsics.f(this.f269314b, fVar.f269314b) && Intrinsics.f(this.f269315c, fVar.f269315c);
    }

    public final int hashCode() {
        return this.f269315c.hashCode() + kii.e.c(this.f269314b, this.f269313a.hashCode() * 31, 31);
    }
}
