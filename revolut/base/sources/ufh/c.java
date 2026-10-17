package ufh;

import cgh.n;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ufg.k0;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f279830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f279831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f279832c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f279833g;

    public c(i iVar, ViewController viewController, n nVar) {
        this.f279832c = iVar;
        this.f279830a = viewController;
        this.f279831b = nVar;
        int i = 3;
        this.d = e4m.b.b(new k0(iVar, this, 0, i));
        this.e = e4m.b.b(new k0(iVar, this, 1, i));
        this.f = e4m.b.b(new k0(iVar, this, 3, i));
        this.f279833g = e4m.b.b(new k0(iVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.e.get()));
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.f279832c.i).a();
        s.j(fVarA);
        return ImmutableSet.of(dw3.l.l(fVarA, (d1h.j) this.d.get(), (d1h.e) this.e.get()));
    }
}
