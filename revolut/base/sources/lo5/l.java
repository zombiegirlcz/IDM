package lo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendInput.BeneficiaryDetails f197404a;

    public l(CryptoSendInput.BeneficiaryDetails input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f197404a = input;
    }

    public final CryptoSendInput b() {
        return this.f197404a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f197404a.equals(((l) obj2).f197404a);
    }

    public final int hashCode() {
        return this.f197404a.hashCode();
    }
}
