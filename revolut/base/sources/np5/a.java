package np5;

import ap5.b;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;
import nnf.h;
import noi.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements jo5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f218148a;

    public a(b cryptoWithdrawInteractor) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        this.f218148a = cryptoWithdrawInteractor;
    }

    public final r a(CryptoAddress cryptoAddress, CryptoWithdrawLimits addressLimits) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        Intrinsics.checkNotNullParameter(addressLimits, "addressLimits");
        Intrinsics.checkNotNullParameter("", "delegatesKey");
        r rVarFilter = this.f218148a.i(cryptoAddress.f71060b, true).filter(new l(4, new h(22)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r map = m70.a.g(rVarFilter, null, null, 3).map(new l(5, new z(addressLimits, 24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
