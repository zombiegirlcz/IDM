package tca;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeDecodeData f269767b;

    public a(String decodeResultId, PixQrCodeDecodeData qrCodeDecodeData) {
        Intrinsics.checkNotNullParameter(decodeResultId, "decodeResultId");
        Intrinsics.checkNotNullParameter(qrCodeDecodeData, "qrCodeDecodeData");
        this.f269766a = decodeResultId;
        this.f269767b = qrCodeDecodeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f269766a, aVar.f269766a) && Intrinsics.f(this.f269767b, aVar.f269767b);
    }

    public final int hashCode() {
        return this.f269767b.hashCode() + (this.f269766a.hashCode() * 31);
    }
}
