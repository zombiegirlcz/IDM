package eic;

import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfoBottomSheet f126478a;

    public n(AdditionalInfoBottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f126478a = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f126478a, ((n) obj2).f126478a);
    }

    public final int hashCode() {
        return this.f126478a.hashCode();
    }
}
