package qdk;

import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MonthlyDrawHub$BottomSheet f244960a;

    public d0(MonthlyDrawHub$BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f244960a = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f244960a, ((d0) obj2).f244960a);
    }

    public final int hashCode() {
        return this.f244960a.hashCode();
    }
}
