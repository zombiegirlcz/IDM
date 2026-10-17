package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OneTimeDonationScreenContract$InputData f234408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234410c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234412h;
    public final e4m.e i;

    public o(m mVar, ViewController viewController, OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData) {
        this.f234409b = mVar;
        this.f234408a = oneTimeDonationScreenContract$InputData;
        int i = 4;
        this.f234410c = e4m.b.b(new f(mVar, this, 0, i));
        this.d = e4m.b.b(new f(mVar, this, 2, i));
        this.e = e4m.b.b(new f(mVar, this, 1, i));
        int i2 = 4;
        this.f = e4m.b.b(new f(mVar, this, i2, i));
        this.f234411g = e4m.b.b(e4m.c.a(viewController));
        this.f234412h = e4m.b.b(new f(mVar, this, 5, i2));
        this.i = e4m.b.b(new f(mVar, this, 3, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f234410c.get());
    }
}
