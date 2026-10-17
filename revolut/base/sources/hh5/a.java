package hh5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import hc2.r;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoBalanceBreakdownInputData f152252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f152253b;

    public a(b bVar, CryptoBalanceBreakdownInputData cryptoBalanceBreakdownInputData) {
        this.f152252a = cryptoBalanceBreakdownInputData;
        this.f152253b = e4m.b.b(new r(bVar, this, 2));
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
