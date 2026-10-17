package x32;

import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrScanningScreenContract$ProcessingState f302622a;

    public c(QrScanningScreenContract$ProcessingState processingState) {
        Intrinsics.checkNotNullParameter(processingState, "processingState");
        this.f302622a = processingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f302622a, ((c) obj2).f302622a);
    }

    public final int hashCode() {
        return this.f302622a.hashCode();
    }
}
