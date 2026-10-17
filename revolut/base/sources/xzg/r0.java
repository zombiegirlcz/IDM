package xzg;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f310026b;

    public r0(List accounts, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f310025a = accounts;
        this.f310026b = tradingLegalEntityInformation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f310025a, r0Var.f310025a) && Intrinsics.f(this.f310026b, r0Var.f310026b);
    }

    public final int hashCode() {
        return this.f310026b.hashCode() + (this.f310025a.hashCode() * 31);
    }
}
