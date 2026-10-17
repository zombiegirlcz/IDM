package bg5;

import cli.j;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.zero_fees.api.models.CryptoZeroFeesPromotion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeFees f15126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoExchangeFeesMode f15128c;
    public final CryptoZeroFeesPromotion d;
    public final pd5.d e;

    public d(CryptoExchangeFees cryptoExchangeFees, List list, CryptoExchangeFeesMode mode, CryptoZeroFeesPromotion zeroFeesPromotion, pd5.d dVar) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(zeroFeesPromotion, "zeroFeesPromotion");
        this.f15126a = cryptoExchangeFees;
        this.f15127b = list;
        this.f15128c = mode;
        this.d = zeroFeesPromotion;
        this.e = dVar;
    }

    public static d a(d dVar, List list, CryptoZeroFeesPromotion cryptoZeroFeesPromotion, pd5.d dVar2, int i) {
        CryptoExchangeFees cryptoExchangeFees = dVar.f15126a;
        if ((i & 2) != 0) {
            list = dVar.f15127b;
        }
        List list2 = list;
        CryptoExchangeFeesMode mode = dVar.f15128c;
        if ((i & 8) != 0) {
            cryptoZeroFeesPromotion = dVar.d;
        }
        CryptoZeroFeesPromotion zeroFeesPromotion = cryptoZeroFeesPromotion;
        if ((i & 16) != 0) {
            dVar2 = dVar.e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(zeroFeesPromotion, "zeroFeesPromotion");
        return new d(cryptoExchangeFees, list2, mode, zeroFeesPromotion, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f15126a, dVar.f15126a) && Intrinsics.f(this.f15127b, dVar.f15127b) && Intrinsics.f(this.f15128c, dVar.f15128c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        CryptoExchangeFees cryptoExchangeFees = this.f15126a;
        int iHashCode = (cryptoExchangeFees == null ? 0 : cryptoExchangeFees.hashCode()) * 31;
        List list = this.f15127b;
        int iHashCode2 = (this.d.hashCode() + ((this.f15128c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        pd5.d dVar = this.e;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
