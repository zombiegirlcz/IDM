package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleSelectorInputDetailsScreenContract$InputData f119597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f6 f119599c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119601h;

    public q6(c1 c1Var, ViewController viewController, SingleSelectorInputDetailsScreenContract$InputData singleSelectorInputDetailsScreenContract$InputData) {
        this.f119597a = singleSelectorInputDetailsScreenContract$InputData;
        this.f119598b = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        f6 f6Var = new f6(this, 1, i);
        this.f119599c = f6Var;
        this.d = e4m.b.b(f6Var);
        this.e = e4m.b.b(new f6(this, 0, i));
        this.f = e4m.b.b(this.f119599c);
        this.f119600g = e4m.b.b(new f6(this, 3, i));
        this.f119601h = e4m.b.b(new f6(this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
