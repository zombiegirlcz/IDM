package n9b;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f213619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f213620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213621c;
    public final e4m.e d;
    public final e4m.e e;

    public b(c cVar, ViewController viewController) {
        this.f213619a = cVar;
        this.f213620b = e4m.b.b(new s(cVar, this, 1, 10));
        this.f213621c = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.d = e4m.b.b(new s(cVar, this, 2, i));
        this.e = e4m.b.b(new s(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
