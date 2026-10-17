package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements j13.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SetPinScreenContract$InputData f275819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f275820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f275821c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public q(e eVar, k kVar, ViewController viewController, SetPinScreenContract$InputData setPinScreenContract$InputData) {
        this.f275819a = setPinScreenContract$InputData;
        this.f275820b = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.f275821c = e4m.b.b(new tg5.h(eVar, this, 1, i));
        this.d = e4m.b.b(new tg5.h(eVar, this, 0, i));
        this.e = e4m.b.b(new tg5.h(eVar, this, 3, i));
        this.f = e4m.b.b(new tg5.h(eVar, this, 2, i));
    }

    @Override // j13.b
    public final i13.h d() {
        return (i13.h) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
