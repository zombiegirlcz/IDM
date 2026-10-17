package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferWrapperNavigation$InputData f20354a;

    public v0(ApmTransferWrapperNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f20354a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && Intrinsics.f(this.f20354a, ((v0) obj2).f20354a);
    }

    public final int hashCode() {
        return this.f20354a.hashCode();
    }
}
