package k95;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.c;
import java.util.Set;
import jqa.h;
import xki.e;
import yji.d;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverdraftDetailsScreenContract$InputData f182283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f182284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f182285c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f182286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f182287h;
    public final e4m.e i;

    public b(a aVar, ViewController viewController, OverdraftDetailsScreenContract$InputData overdraftDetailsScreenContract$InputData) {
        this.f182283a = overdraftDetailsScreenContract$InputData;
        this.f182284b = e4m.b.b(c.a(viewController));
        int i = 20;
        this.f182285c = e4m.b.b(new h(aVar, this, 2, i));
        this.d = e4m.b.b(new h(aVar, this, 1, i));
        this.e = e4m.b.b(new h(aVar, this, 0, i));
        this.f = e4m.b.b(new h(aVar, this, 4, i));
        this.f182286g = e4m.b.b(new h(aVar, this, 3, i));
        this.f182287h = e4m.b.b(new h(aVar, this, 6, i));
        this.i = e4m.b.b(new h(aVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f182286g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((d) this.e.get());
    }
}
