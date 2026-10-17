package yx;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MsBarcode f317508a;

    public k(MsBarcode barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.f317508a = barcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f317508a, ((k) obj2).f317508a);
    }

    public final int hashCode() {
        return this.f317508a.hashCode();
    }
}
