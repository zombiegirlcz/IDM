package fj5;

import cli.j;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerControllerContract$ProcessingState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoQrScannerControllerContract$ProcessingState f135535a;

    public b(CryptoQrScannerControllerContract$ProcessingState processingState) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        this.f135535a = processingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f135535a, ((b) obj2).f135535a);
    }

    public final int hashCode() {
        return this.f135535a.hashCode();
    }
}
