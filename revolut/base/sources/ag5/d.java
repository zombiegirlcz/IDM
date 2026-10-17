package ag5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f4787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFeesDialogMode f4788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4789c;

    public d(Data cryptoExchangeFeesData, CryptoExchangeFeesDialogMode mode, String str) {
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesData, "cryptoExchangeFeesData");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f4787a = cryptoExchangeFeesData;
        this.f4788b = mode;
        this.f4789c = str;
    }

    public static d a(d dVar, Data cryptoExchangeFeesData, String str, int i) {
        if ((i & 1) != 0) {
            cryptoExchangeFeesData = dVar.f4787a;
        }
        CryptoExchangeFeesDialogMode mode = dVar.f4788b;
        if ((i & 4) != 0) {
            str = dVar.f4789c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesData, "cryptoExchangeFeesData");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new d(cryptoExchangeFeesData, mode, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f4787a, dVar.f4787a) && this.f4788b == dVar.f4788b && Intrinsics.f(this.f4789c, dVar.f4789c);
    }

    public final int hashCode() {
        int iHashCode = (this.f4788b.hashCode() + (this.f4787a.hashCode() * 31)) * 31;
        String str = this.f4789c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
