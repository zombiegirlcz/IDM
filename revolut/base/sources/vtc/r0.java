package vtc;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f292050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f292051c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f292052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f292053h;
    public final a31.a i;

    public r0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, ecm.q qVar) {
        this.f292050b = qVar;
        this.f292051c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f292052g = aVar5;
        this.f292053h = aVar6;
        this.i = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f292050b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f292051c.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.e.f955b).get();
        f49.a aVar3 = (f49.a) ((phm.a) this.f.f955b).get();
        l70.e eVar = (l70.e) ((phm.a) this.f292052g.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f292053h.f955b).get();
        ite.a aVar4 = (ite.a) ((phm.a) this.i.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        eVar.getClass();
        bVar.getClass();
        aVar4.getClass();
        return new k0(aVar, aVar2, cVar, aVar3, eVar, bVar, aVar4, context);
    }
}
