package wx;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MsBarcode f300706a;

    public f(MsBarcode barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.f300706a = barcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f300706a, ((f) obj2).f300706a);
    }

    public final int hashCode() {
        return this.f300706a.hashCode();
    }
}
