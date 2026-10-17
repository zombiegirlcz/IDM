package ctk;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralContactDelegate f108684a;

    public f(ReferralContactDelegate referralContactDelegate) {
        Intrinsics.checkNotNullParameter(referralContactDelegate, "referralContactDelegate");
        this.f108684a = referralContactDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f108684a, ((f) obj2).f108684a);
    }

    public final int hashCode() {
        return this.f108684a.hashCode();
    }
}
