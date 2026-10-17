package rd4;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingReferralFlag f253337a;

    public f(ManualUnderwritingReferralFlag referralFlag) {
        Intrinsics.checkNotNullParameter(referralFlag, "referralFlag");
        this.f253337a = referralFlag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f253337a, ((f) obj2).f253337a);
    }

    public final int hashCode() {
        return this.f253337a.hashCode();
    }
}
