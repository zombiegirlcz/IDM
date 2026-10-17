package tf5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f270242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFees f270243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoExchangeFeesMode f270244c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(e eVar, CryptoExchangeFees cryptoExchangeFees, CryptoExchangeFeesMode cryptoExchangeFeesMode, mkd.g gVar) {
        this.f270242a = gVar;
        this.f270243b = cryptoExchangeFees;
        this.f270244c = cryptoExchangeFeesMode;
        int i = 28;
        this.d = e4m.b.b(new t0b.l(eVar, this, 0, i));
        this.e = e4m.b.b(new t0b.l(eVar, this, 2, i));
        this.f = e4m.b.b(new t0b.l(eVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
