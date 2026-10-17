package yq5;

import cli.j;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoWithdrawLimits f315987a;

    public a(CryptoWithdrawLimits limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f315987a = limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f315987a, ((a) obj2).f315987a);
    }

    public final int hashCode() {
        return this.f315987a.hashCode();
    }
}
