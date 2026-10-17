package dca;

import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixKey f112828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f112829c;
    public final String d;

    public g(Data pixQrCodeData, PixKey pixKey, dj0.d dVar, String str) {
        Intrinsics.checkNotNullParameter(pixQrCodeData, "pixQrCodeData");
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        this.f112827a = pixQrCodeData;
        this.f112828b = pixKey;
        this.f112829c = dVar;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f112827a, gVar.f112827a) && Intrinsics.f(this.f112828b, gVar.f112828b) && Intrinsics.f(this.f112829c, gVar.f112829c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f112828b.hashCode() + (this.f112827a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f112829c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
