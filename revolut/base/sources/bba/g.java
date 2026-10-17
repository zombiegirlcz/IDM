package bba;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeDecodeData f14205b;

    public g(String qrCodeId, PixQrCodeDecodeData qrCodeData) {
        Intrinsics.checkNotNullParameter(qrCodeId, "qrCodeId");
        Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
        this.f14204a = qrCodeId;
        this.f14205b = qrCodeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f14204a, gVar.f14204a) && Intrinsics.f(this.f14205b, gVar.f14205b);
    }

    public final int hashCode() {
        return this.f14205b.hashCode() + (this.f14204a.hashCode() * 31);
    }
}
