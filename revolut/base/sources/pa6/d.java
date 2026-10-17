package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharityDetailsScreenContract$InputData f234354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234356c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234358h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f234359j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f234360l;

    public d(m mVar, n nVar, ViewController viewController, CharityDetailsScreenContract$InputData charityDetailsScreenContract$InputData) {
        this.f234355b = mVar;
        this.f234354a = charityDetailsScreenContract$InputData;
        this.f234356c = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.d = e4m.b.b(new p8a.m(mVar, this, 2, i));
        this.e = e4m.b.b(new p8a.m(mVar, this, 1, i));
        this.f = e4m.b.b(new p8a.m(mVar, this, 0, i));
        this.f234357g = e4m.b.b(new p8a.m(mVar, this, 4, i));
        this.f234358h = e4m.b.b(new p8a.m(mVar, this, 3, i));
        this.i = e4m.b.b(new p8a.m(mVar, this, 7, i));
        this.f234359j = e4m.b.b(new p8a.m(mVar, this, 8, i));
        this.k = e4m.b.b(new p8a.m(mVar, this, 6, i));
        this.f234360l = e4m.b.b(new p8a.m(mVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f234358h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
