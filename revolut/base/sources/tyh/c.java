package tyh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeFlowInputData f275603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f275604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f275605c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f275606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f275607h;

    public c(b bVar, ViewController viewController, CryptoExchangeFlowInputData cryptoExchangeFlowInputData) {
        this.f275604b = bVar;
        this.f275603a = cryptoExchangeFlowInputData;
        int i = 12;
        this.d = e4m.b.b(new tg5.h(bVar, this, 0, i));
        this.e = e4m.b.b(new tg5.h(bVar, this, 1, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 12;
        this.f275606g = e4m.b.b(new tg5.h(bVar, this, 3, i2));
        this.f275607h = e4m.b.b(new tg5.h(bVar, this, 2, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }
}
