package lo5;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoBeneficiaryDetailsScreenContract$InputData f197399a;

    public f(CryptoBeneficiaryDetailsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f197399a = input;
    }

    public final CryptoBeneficiaryDetailsScreenContract$InputData b() {
        return this.f197399a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f197399a, ((f) obj2).f197399a);
    }

    public final int hashCode() {
        return this.f197399a.hashCode();
    }
}
