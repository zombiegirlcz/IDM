package mfl;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f205024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f205025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f205026c;

    public g(Data reports, TradingLegalEntityInformation tradingLegalEntityInformation, Data tradingAccount) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f205024a = reports;
        this.f205025b = tradingLegalEntityInformation;
        this.f205026c = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205024a, gVar.f205024a) && Intrinsics.f(this.f205025b, gVar.f205025b) && Intrinsics.f(this.f205026c, gVar.f205026c);
    }

    public final int hashCode() {
        return this.f205026c.hashCode() + ((this.f205025b.hashCode() + (this.f205024a.hashCode() * 31)) * 31);
    }
}
