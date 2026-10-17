package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioSpareChangeScreenContract$Input f115996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115998c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f115999g;

    public l(r rVar, ViewController viewController, PortfolioSpareChangeScreenContract$Input portfolioSpareChangeScreenContract$Input) {
        this.f115997b = rVar;
        this.f115996a = portfolioSpareChangeScreenContract$Input;
        this.f115998c = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.d = e4m.b.b(new db1.f(rVar, this, 2, i));
        this.e = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.f = e4m.b.b(new db1.f(rVar, this, 0, i));
        this.f115999g = e4m.b.b(new db1.f(rVar, this, 3, i));
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
