package h4e;

import dw3.p3;
import e4m.e;
import mp.p;
import r10.f;
import vc.s;
import vtc.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f49.a f149341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f149342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f149343c;
    public final e d = e4m.b.b(new p3(21));

    public a(ite.a aVar, f49.a aVar2, k0 k0Var) {
        this.f149341a = aVar2;
        this.f149342b = k0Var;
        this.f149343c = aVar;
    }

    public final f a() {
        j4e.a aVar = (j4e.a) this.d.get();
        gte.a aVarB = this.f149343c.b();
        s.j(aVarB);
        return new f(aVar, aVarB);
    }

    public final p b() {
        w39.b bVarA = this.f149341a.a();
        s.j(bVarA);
        return new p(bVarA, this.f149342b.d(), (j4e.a) this.d.get());
    }
}
