package ov1;

import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebTransferNavigation$InputData f229948a;

    public d(BrebTransferNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f229948a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f229948a, ((d) obj2).f229948a);
    }

    public final int hashCode() {
        return this.f229948a.hashCode();
    }
}
