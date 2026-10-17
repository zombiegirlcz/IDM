package lya;

import com.revolut.feature.referrals.common.data.api.domain.model.common.MultilevelDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultilevelDetails f200772a;

    public f(MultilevelDetails multiLevelDetails) {
        Intrinsics.checkNotNullParameter(multiLevelDetails, "multiLevelDetails");
        this.f200772a = multiLevelDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f200772a, ((f) obj2).f200772a);
    }

    public final int hashCode() {
        return this.f200772a.hashCode();
    }
}
