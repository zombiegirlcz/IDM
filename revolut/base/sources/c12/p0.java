package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferContract$InputData f20346a;

    public p0(ApmTransferContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f20346a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f20346a, ((p0) obj2).f20346a);
    }

    public final int hashCode() {
        return this.f20346a.hashCode();
    }
}
