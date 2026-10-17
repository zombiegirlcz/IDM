package fh5;

import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoBalanceBreakdownInputData f135147a;

    public a(CryptoBalanceBreakdownInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f135147a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f135147a, ((a) obj2).f135147a);
    }

    public final int hashCode() {
        return this.f135147a.hashCode();
    }
}
