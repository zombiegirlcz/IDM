package eic;

import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfoBottomSheet f126479a;

    public p(AdditionalInfoBottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f126479a = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f126479a, ((p) obj2).f126479a);
    }

    public final int hashCode() {
        return this.f126479a.hashCode();
    }
}
