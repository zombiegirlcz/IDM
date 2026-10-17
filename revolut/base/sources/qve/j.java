package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McyExchangeRateScreenContract$InputData f249598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249600c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249601g;

    public j(k kVar, m mVar, ViewController viewController, McyExchangeRateScreenContract$InputData mcyExchangeRateScreenContract$InputData) {
        this.f249599b = kVar;
        this.f249598a = mcyExchangeRateScreenContract$InputData;
        this.f249600c = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.d = e4m.b.b(new ppd.j(kVar, mVar, this, 2, i));
        this.e = e4m.b.b(new ppd.j(kVar, mVar, this, 1, i));
        this.f = e4m.b.b(new ppd.j(kVar, mVar, this, 0, i));
        this.f249601g = e4m.b.b(new ppd.j(kVar, mVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
