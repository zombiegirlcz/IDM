package xs7;

import com.revolut.feature.insurance_credit.impl.data.model.BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheet f308431a;

    public d(BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f308431a = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f308431a, ((d) obj2).f308431a);
    }

    public final int hashCode() {
        return this.f308431a.hashCode();
    }
}
