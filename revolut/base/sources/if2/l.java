package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f160882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f160883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160884c;
    public final e4m.e d;

    public l(f fVar, ViewController viewController) {
        this.f160882a = fVar;
        this.f160883b = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.f160884c = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.d = e4m.b.b(new i9e.l(fVar, this, 0, i));
    }

    public final jg2.f b() {
        yy0.f fVar = (yy0.f) this.f160884c.get();
        f fVar2 = this.f160882a;
        zk0.b bVarL = fVar2.f160851a.l();
        vc.s.j(bVarL);
        return new jg2.f(fVar, bVarL, fVar2.f160855h);
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
