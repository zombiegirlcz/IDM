package tf5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeFeesDialogMode f270245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f270246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f270247c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f270248g;

    public h(e eVar, ViewController viewController, CryptoExchangeFeesDialogMode cryptoExchangeFeesDialogMode) {
        this.f270245a = cryptoExchangeFeesDialogMode;
        this.f270246b = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.f270247c = e4m.b.b(new t0b.l(eVar, this, 2, i));
        this.d = e4m.b.b(new t0b.l(eVar, this, 1, i));
        this.e = e4m.b.b(new t0b.l(eVar, this, 0, i));
        this.f = e4m.b.b(new t0b.l(eVar, this, 4, i));
        this.f270248g = e4m.b.b(new t0b.l(eVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
