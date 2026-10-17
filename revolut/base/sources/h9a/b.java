package h9a;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeDecodeData f150219b;

    public b(String authorisationId, PixQrCodeDecodeData pixQrCodeDecodeData) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        this.f150218a = authorisationId;
        this.f150219b = pixQrCodeDecodeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f150218a, bVar.f150218a) && Intrinsics.f(this.f150219b, bVar.f150219b);
    }

    public final int hashCode() {
        int iHashCode = this.f150218a.hashCode() * 31;
        PixQrCodeDecodeData pixQrCodeDecodeData = this.f150219b;
        return iHashCode + (pixQrCodeDecodeData == null ? 0 : pixQrCodeDecodeData.hashCode());
    }
}
