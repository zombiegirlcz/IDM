package bue;

import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletLimit.CounterLimit f18769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WalletLimit.CounterLimit f18770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WalletLimit.CounterLimit f18771c;
    public final WalletLimit.TransactionLimit d;

    public a(WalletLimit.CounterLimit counterLimit, WalletLimit.CounterLimit counterLimit2, WalletLimit.CounterLimit counterLimit3, WalletLimit.TransactionLimit transactionLimit) {
        this.f18769a = counterLimit;
        this.f18770b = counterLimit2;
        this.f18771c = counterLimit3;
        this.d = transactionLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18769a, aVar.f18769a) && Intrinsics.f(this.f18770b, aVar.f18770b) && Intrinsics.f(this.f18771c, aVar.f18771c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        WalletLimit.CounterLimit counterLimit = this.f18769a;
        int iHashCode = (counterLimit == null ? 0 : counterLimit.hashCode()) * 31;
        WalletLimit.CounterLimit counterLimit2 = this.f18770b;
        int iHashCode2 = (iHashCode + (counterLimit2 == null ? 0 : counterLimit2.hashCode())) * 31;
        WalletLimit.CounterLimit counterLimit3 = this.f18771c;
        int iHashCode3 = (iHashCode2 + (counterLimit3 == null ? 0 : counterLimit3.hashCode())) * 31;
        WalletLimit.TransactionLimit transactionLimit = this.d;
        return iHashCode3 + (transactionLimit != null ? transactionLimit.hashCode() : 0);
    }
}
