package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f295206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f295207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f295208c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public n(m mVar, ViewController viewController) {
        this.f295206a = viewController;
        int i = 10;
        this.f295207b = e4m.b.b(new vzc.j(mVar, this, 1, i));
        this.f295208c = e4m.b.b(new vzc.j(mVar, this, 3, i));
        this.d = e4m.b.b(new vzc.j(mVar, this, 2, i));
        this.e = e4m.b.b(new vzc.j(mVar, this, 0, i));
        this.f = e4m.b.b(new vzc.j(mVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
