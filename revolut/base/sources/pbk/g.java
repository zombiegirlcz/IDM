package pbk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r10.t;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ack.e f234740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f234741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f234742c = this;
    public final e4m.e d;
    public final e4m.e e;

    public g(b bVar, ViewController viewController, ack.e eVar) {
        this.f234741b = bVar;
        this.f234740a = eVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new p2k.c(bVar, this, 22));
    }

    public final t b() {
        b bVar = this.f234741b;
        cl3.a aVarD = bVar.f234716b.d();
        s.j(aVarD);
        l80.e eVarH = bVar.f234715a.h();
        s.j(eVarH);
        return new t(aVarD, eVarH);
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
