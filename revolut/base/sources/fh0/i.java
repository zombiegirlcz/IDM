package fh0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f135124a;

    public i(g barcodeModuleStatus) {
        Intrinsics.checkNotNullParameter(barcodeModuleStatus, "barcodeModuleStatus");
        this.f135124a = barcodeModuleStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f135124a, ((i) obj2).f135124a);
    }

    public final int hashCode() {
        return this.f135124a.hashCode();
    }
}
