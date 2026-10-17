package bba;

import com.revolut.feature.pix.api.model.PixBeneficiary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixBeneficiary f14203a;

    public f(PixBeneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f14203a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f14203a, ((f) obj2).f14203a);
    }

    public final int hashCode() {
        return this.f14203a.hashCode();
    }
}
