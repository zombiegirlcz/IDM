package u8f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f278195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f278196b;

    public a(ArrayList tradingAccounts, ArrayList tradingAccountsAvailableToOnboard) {
        Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
        Intrinsics.checkNotNullParameter(tradingAccountsAvailableToOnboard, "tradingAccountsAvailableToOnboard");
        this.f278195a = tradingAccounts;
        this.f278196b = tradingAccountsAvailableToOnboard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f278195a.equals(aVar.f278195a) && this.f278196b.equals(aVar.f278196b);
    }

    public final int hashCode() {
        return this.f278196b.hashCode() + (this.f278195a.hashCode() * 31);
    }
}
