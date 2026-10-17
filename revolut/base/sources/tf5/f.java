package tf5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf5.b f270239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFeesMode f270240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f270241c;
    public final e4m.e d;

    public f(e eVar, lf5.b bVar, CryptoExchangeFeesMode cryptoExchangeFeesMode) {
        this.f270239a = bVar;
        this.f270240b = cryptoExchangeFeesMode;
        int i = 27;
        this.f270241c = e4m.b.b(new t0b.l(eVar, this, 1, i));
        this.d = e4m.b.b(new t0b.l(eVar, this, 0, i));
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
