package kba;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeDecodeData f182542b;

    public c(String decodedOperationId, PixQrCodeDecodeData qrDecodeResult) {
        Intrinsics.checkNotNullParameter(decodedOperationId, "decodedOperationId");
        Intrinsics.checkNotNullParameter(qrDecodeResult, "qrDecodeResult");
        this.f182541a = decodedOperationId;
        this.f182542b = qrDecodeResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f182541a, cVar.f182541a) && Intrinsics.f(this.f182542b, cVar.f182542b);
    }

    public final int hashCode() {
        return this.f182542b.hashCode() + (this.f182541a.hashCode() * 31);
    }
}
