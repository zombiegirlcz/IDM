package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements j13.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SetPinScreenContract$InputData f302127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302129c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302131h;

    public c0(p pVar, q qVar, ViewController viewController, SetPinScreenContract$InputData setPinScreenContract$InputData) {
        this.f302128b = pVar;
        this.f302129c = qVar;
        this.f302127a = setPinScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.e = e4m.b.b(new whc.t(pVar, this, 1, i));
        this.f = e4m.b.b(new whc.t(pVar, this, 0, i));
        this.f302130g = e4m.b.b(new whc.t(pVar, this, 3, i));
        this.f302131h = e4m.b.b(new whc.t(pVar, this, 2, i));
    }

    @Override // j13.b
    public final i13.h d() {
        return (i13.h) this.f302131h.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302128b.V.get(), (yji.n) this.f302129c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
