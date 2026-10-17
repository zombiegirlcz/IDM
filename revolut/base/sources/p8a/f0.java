package p8a;

import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f233960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f233961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f233962c;

    public f0(d0 d0Var, g0 g0Var, int i) {
        this.f233960a = d0Var;
        this.f233961b = g0Var;
        this.f233962c = i;
    }

    @Override // phm.a
    public final Object get() {
        d0 d0Var = this.f233960a;
        c cVar = d0Var.e;
        g0 g0Var = this.f233961b;
        int i = this.f233962c;
        if (i == 0) {
            return kxa.j.k((j60.a) g0Var.d.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) g0Var.f233970b.get(), (rp0.m) g0Var.f233971c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        i8a.a aVar = (i8a.a) cVar.G.get();
        vc.s.j(aVar);
        PixTransferNavigation$InputData.NewContact newContact = g0Var.f233969a;
        j8a.b bVar = (j8a.b) cVar.L.get();
        vc.s.j(bVar);
        yca.o oVar = new yca.o();
        j60.a aVar2 = (j60.a) g0Var.d.get();
        hp.g gVarA = d0Var.v.a();
        f8a.b bVar2 = (f8a.b) cVar.M.get();
        vc.s.j(bVar2);
        return new qca.q(aVar, newContact, bVar, oVar, aVar2, gVarA, bVar2, new qca.r());
    }
}
