package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestAndFeesScreenContract$InputData f6638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6640c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f6641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f6642h;

    public g(n nVar, ViewController viewController, InterestAndFeesScreenContract$InputData interestAndFeesScreenContract$InputData) {
        this.f6638a = interestAndFeesScreenContract$InputData;
        this.f6639b = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f6640c = e4m.b.b(new ak5.f(nVar, this, 2, i));
        this.d = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.e = e4m.b.b(new ak5.f(nVar, this, 0, i));
        this.f = e4m.b.b(new ak5.f(nVar, this, 4, i));
        this.f6641g = e4m.b.b(new ak5.f(nVar, this, 5, i));
        this.f6642h = e4m.b.b(new ak5.f(nVar, this, 3, i));
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
