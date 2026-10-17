package lo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddBeneficiaryInput f197392a;

    public a(CryptoAddBeneficiaryInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f197392a = input;
    }

    public final CryptoAddBeneficiaryInput b() {
        return this.f197392a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f197392a, ((a) obj2).f197392a);
    }

    public final int hashCode() {
        return this.f197392a.hashCode();
    }
}
