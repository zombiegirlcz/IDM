package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryManagementListContract$InputData f238546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f238547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238548c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238550h;
    public final e4m.e i;

    public t(n nVar, ViewController viewController, CategoryManagementListContract$InputData categoryManagementListContract$InputData) {
        this.f238546a = categoryManagementListContract$InputData;
        this.f238547b = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.f238548c = e4m.b.b(new pa6.f(nVar, this, 2, i));
        this.d = e4m.b.b(new pa6.f(nVar, this, 1, i));
        this.e = e4m.b.b(new pa6.f(nVar, this, 0, i));
        this.f = e4m.b.b(new pa6.f(nVar, this, 4, i));
        this.f238549g = e4m.b.b(new pa6.f(nVar, this, 3, i));
        this.f238550h = e4m.b.b(new pa6.f(nVar, this, 6, i));
        this.i = e4m.b.b(new pa6.f(nVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f238549g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
