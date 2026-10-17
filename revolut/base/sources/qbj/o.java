package qbj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoDepositInput f244324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f244325b;

    public o(q qVar, CryptoDepositInput cryptoDepositInput) {
        this.f244324a = cryptoDepositInput;
        this.f244325b = e4m.b.b(new ppd.u(qVar, this, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
