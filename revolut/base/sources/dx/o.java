package dx;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements xv.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MsBarcode f120508a;

    public o(MsBarcode barcode) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.f120508a = barcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f120508a, ((o) obj2).f120508a);
    }

    public final int hashCode() {
        return this.f120508a.hashCode();
    }
}
