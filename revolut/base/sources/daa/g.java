package daa;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixQrCodeDecodeData f112499b;

    public g(String resultId, PixQrCodeDecodeData resultData) {
        Intrinsics.checkNotNullParameter(resultId, "resultId");
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        this.f112498a = resultId;
        this.f112499b = resultData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f112498a, gVar.f112498a) && Intrinsics.f(this.f112499b, gVar.f112499b);
    }

    public final int hashCode() {
        return this.f112499b.hashCode() + (this.f112498a.hashCode() * 31);
    }
}
