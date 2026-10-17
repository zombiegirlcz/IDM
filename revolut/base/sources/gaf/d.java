package gaf;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f142157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation.TaaTransferUserAccountInformation f142158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f142159c;
    public final TradingAccount.TaxAdvantage d;
    public final u8f.b e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142160g;

    public d(TransferBroker transferBroker, TransferUserAccountInformation.TaaTransferUserAccountInformation transferInAccountInformation, Data data, TradingAccount.TaxAdvantage tradingAccount, u8f.b transferType, Map transferYears, boolean z) {
        Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
        Intrinsics.checkNotNullParameter(transferInAccountInformation, "transferInAccountInformation");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(transferYears, "transferYears");
        this.f142157a = transferBroker;
        this.f142158b = transferInAccountInformation;
        this.f142159c = data;
        this.d = tradingAccount;
        this.e = transferType;
        this.f = transferYears;
        this.f142160g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f142157a, dVar.f142157a) && Intrinsics.f(this.f142158b, dVar.f142158b) && Intrinsics.f(this.f142159c, dVar.f142159c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && this.f142160g == dVar.f142160g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f142157a.hashCode() * 31, 31, this.f142158b.f91536a);
        Data data = this.f142159c;
        return Boolean.hashCode(this.f142160g) + p.a.e((this.e.hashCode() + ((this.d.hashCode() + ((iC + (data == null ? 0 : data.hashCode())) * 31)) * 31)) * 31, 31, this.f);
    }
}
