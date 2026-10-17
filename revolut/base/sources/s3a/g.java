package s3a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsIntroScreenContract$InputData f259510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f259511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f259512c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f259513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f259514h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f259515j;

    public g(k kVar, j jVar, ViewController viewController, PaymentsIntroScreenContract$InputData paymentsIntroScreenContract$InputData) {
        this.f259511b = kVar;
        this.f259510a = paymentsIntroScreenContract$InputData;
        int i = 6;
        this.f259512c = e4m.b.b(new ryc.d(kVar, this, 2, i));
        this.d = e4m.b.b(new ryc.d(kVar, this, 1, i));
        this.e = e4m.b.b(new ryc.d(kVar, this, 0, i));
        this.f = e4m.b.b(new ryc.d(kVar, this, 3, i));
        this.f259513g = e4m.b.b(new ryc.d(kVar, this, 4, i));
        int i2 = 6;
        this.f259514h = e4m.b.b(new ryc.d(kVar, this, i2, i));
        this.i = e4m.b.b(e4m.c.a(viewController));
        this.f259515j = e4m.b.b(new ryc.d(kVar, this, 5, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f259513g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
