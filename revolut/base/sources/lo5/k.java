package lo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoFeeBreakdownDialogInput f197403a;

    public k(CryptoFeeBreakdownDialogInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f197403a = input;
    }

    public final CryptoFeeBreakdownDialogInput b() {
        return this.f197403a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f197403a, ((k) obj2).f197403a);
    }

    public final int hashCode() {
        return this.f197403a.hashCode();
    }
}
