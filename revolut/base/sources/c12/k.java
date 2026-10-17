package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmPendingNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPendingNavigation$InputData f20336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f20337b;

    public k(ApmPendingNavigation$InputData inputData, r extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f20336a = inputData;
        this.f20337b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f20336a, kVar.f20336a) && Intrinsics.f(this.f20337b, kVar.f20337b);
    }

    public final int hashCode() {
        return this.f20337b.hashCode() + (this.f20336a.hashCode() * 31);
    }
}
