package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oyi.c f109740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f109742c;
    public final e4m.e d;
    public final e4m.e e;

    public l0(h0 h0Var, b0 b0Var, ViewController viewController, oyi.c cVar) {
        this.f109741b = h0Var;
        this.f109740a = cVar;
        this.f109742c = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.d = e4m.b.b(new d0(h0Var, this, 0, i));
        this.e = e4m.b.b(new d0(h0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
