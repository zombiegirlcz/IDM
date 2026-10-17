package jq5;

import cli.j;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wp5.b f177468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoWithdrawLimits f177469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiatCryptoWithdrawLimits f177470c;
    public final xi0.b d;

    public b(wp5.b status, FiatCryptoWithdrawLimits withdrawLimits, FiatCryptoWithdrawLimits fiatCryptoWithdrawLimits, xi0.b displayCurrency) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(withdrawLimits, "withdrawLimits");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        this.f177468a = status;
        this.f177469b = withdrawLimits;
        this.f177470c = fiatCryptoWithdrawLimits;
        this.d = displayCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f177468a == bVar.f177468a && Intrinsics.f(this.f177469b, bVar.f177469b) && Intrinsics.f(this.f177470c, bVar.f177470c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f177469b.hashCode() + (this.f177468a.hashCode() * 31)) * 31;
        FiatCryptoWithdrawLimits fiatCryptoWithdrawLimits = this.f177470c;
        return this.d.hashCode() + ((iHashCode + (fiatCryptoWithdrawLimits == null ? 0 : fiatCryptoWithdrawLimits.hashCode())) * 31);
    }
}
