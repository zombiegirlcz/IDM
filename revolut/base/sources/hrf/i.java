package hrf;

import com.revolut.feature.wallets.api.module.WalletLimit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletLimit.CounterLimit f154820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WalletLimit.CounterLimit f154821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WalletLimit.CounterLimit f154822c;
    public final WalletLimit.CounterLimit d;
    public final long e;

    public i(WalletLimit.CounterLimit counterLimit, WalletLimit.CounterLimit counterLimit2, WalletLimit.CounterLimit counterLimit3, WalletLimit.CounterLimit counterLimit4, long j2) {
        this.f154820a = counterLimit;
        this.f154821b = counterLimit2;
        this.f154822c = counterLimit3;
        this.d = counterLimit4;
        this.e = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154820a, iVar.f154820a) && Intrinsics.f(this.f154821b, iVar.f154821b) && Intrinsics.f(this.f154822c, iVar.f154822c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        WalletLimit.CounterLimit counterLimit = this.f154820a;
        int iHashCode = (counterLimit == null ? 0 : counterLimit.hashCode()) * 31;
        WalletLimit.CounterLimit counterLimit2 = this.f154821b;
        int iHashCode2 = (iHashCode + (counterLimit2 == null ? 0 : counterLimit2.hashCode())) * 31;
        WalletLimit.CounterLimit counterLimit3 = this.f154822c;
        int iHashCode3 = (iHashCode2 + (counterLimit3 == null ? 0 : counterLimit3.hashCode())) * 31;
        WalletLimit.CounterLimit counterLimit4 = this.d;
        return Long.hashCode(this.e) + ((iHashCode3 + (counterLimit4 != null ? counterLimit4.hashCode() : 0)) * 31);
    }
}
