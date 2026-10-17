package g12;

import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrScannerInputData f139524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f139525b;

    public k(QrScannerInputData inputData, l qrHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        this.f139524a = inputData;
        this.f139525b = qrHandler;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f139524a, kVar.f139524a) && Intrinsics.f(this.f139525b, kVar.f139525b);
    }

    public final int hashCode() {
        return this.f139525b.hashCode() + (this.f139524a.hashCode() * 31);
    }
}
