package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsDetailsScreenContract$InputData f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f6683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6684c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f6685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f6686h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f6687j;

    public p(n nVar, ViewController viewController, SavingsDetailsScreenContract$InputData savingsDetailsScreenContract$InputData) {
        this.f6683b = nVar;
        this.f6682a = savingsDetailsScreenContract$InputData;
        this.f6684c = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.d = e4m.b.b(new ak5.f(nVar, this, 2, i));
        this.e = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.f = e4m.b.b(new ak5.f(nVar, this, 0, i));
        this.f6685g = e4m.b.b(new ak5.f(nVar, this, 4, i));
        this.f6686h = e4m.b.b(new ak5.f(nVar, this, 3, i));
        this.i = e4m.b.b(new ak5.f(nVar, this, 6, i));
        this.f6687j = e4m.b.b(new ak5.f(nVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f6686h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
