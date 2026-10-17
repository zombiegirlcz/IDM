package mod;

import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupDetailsScreenContract$InputData f207633b;

    public r(GroupDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f207633b = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f207633b, ((r) obj2).f207633b);
    }

    public final int hashCode() {
        return this.f207633b.hashCode();
    }
}
