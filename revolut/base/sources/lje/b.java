package lje;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import kx4.f0;
import msb.c;
import mu5.f;
import rd0.e;
import xv5.g;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f195662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f195663b;

    public b(g cryptoCommodityStorageInteractor, f cryptoInvestmentsInteractor) {
        Intrinsics.checkNotNullParameter(cryptoCommodityStorageInteractor, "cryptoCommodityStorageInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        this.f195662a = cryptoCommodityStorageInteractor;
        this.f195663b = cryptoInvestmentsInteractor;
    }

    public final f0 a() {
        return new f0(e.b(pd.b.s(this.f195663b.d.W(AccountId.Personal.f51414a), new c(18))), 21);
    }
}
