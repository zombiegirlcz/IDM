package jxa;

import vc.s;
import vl3.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f179096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz9.a f179097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jhf.a f179098c;

    public a(n nVar, pz9.a aVar, jhf.a aVar2) {
        this.f179096a = nVar;
        this.f179097b = aVar;
        this.f179098c = aVar2;
    }

    public final e a() {
        n nVar = this.f179096a;
        dl3.f fVarC = nVar.c();
        s.j(fVarC);
        cl3.a aVarD = nVar.d();
        s.j(aVarD);
        kz9.a aVarA = this.f179097b.a();
        s.j(aVarA);
        return new e(fVarC, aVarD, aVarA);
    }
}
