package bi3;

import android.content.Context;
import ecm.q;
import fd2.n;
import kotlin.jvm.functions.Function0;
import zxb.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15427b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f15428c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f15429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final phm.a f15430h;

    public j(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar, phm.a aVar5) {
        this.f15428c = qVar;
        this.d = aVar;
        this.f15430h = aVar5;
        this.e = aVar2;
        this.f = aVar3;
        this.f15429g = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f15427b) {
            case 0:
                Context context = (Context) ((Function0) this.f15428c.f124861b).invoke();
                da3.j jVar = (da3.j) ((phm.a) this.d.f955b).get();
                d dVar = (d) this.f15430h.get();
                l70.e eVar = (l70.e) ((phm.a) this.e.f955b).get();
                ite.a aVar = (ite.a) ((phm.a) this.f.f955b).get();
                kmg.a aVar2 = (kmg.a) ((phm.a) this.f15429g.f955b).get();
                context.getClass();
                jVar.getClass();
                dVar.getClass();
                eVar.getClass();
                aVar.getClass();
                aVar2.getClass();
                return new g(jVar, dVar, eVar, aVar, aVar2, context);
            default:
                Context context2 = (Context) ((Function0) this.f15428c.f124861b).invoke();
                t29.a aVar3 = (t29.a) ((phm.a) this.d.f955b).get();
                t1f.h hVar = (t1f.h) ((phm.a) this.e.f955b).get();
                zxb.e eVar2 = (zxb.e) ((phm.a) this.f.f955b).get();
                k0 k0Var = (k0) ((phm.a) this.f15429g.f955b).get();
                i8g.c cVar = (i8g.c) this.f15430h.get();
                context2.getClass();
                aVar3.getClass();
                hVar.getClass();
                eVar2.getClass();
                k0Var.getClass();
                cVar.getClass();
                return new i8g.a(aVar3, hVar, eVar2, k0Var, cVar);
        }
    }

    public j(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, n nVar) {
        this.f15428c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f15429g = aVar4;
        this.f15430h = nVar;
    }
}
