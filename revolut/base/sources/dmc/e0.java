package dmc;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f115936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f115937c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f115938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f115939h;

    public e0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, ecm.q qVar) {
        this.f115936b = qVar;
        this.f115937c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f115938g = aVar5;
        this.f115939h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f115936b.f124861b).invoke();
        l70.e eVar = (l70.e) ((phm.a) this.f115937c.f955b).get();
        nj0.a aVar = (nj0.a) ((phm.a) this.d.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.e.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
        pqi.a aVar3 = (pqi.a) ((phm.a) this.f115938g.f955b).get();
        ite.a aVar4 = (ite.a) ((phm.a) this.f115939h.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        return new a(new qlc.a(), eVar, aVar, aVar2, cVar, aVar3, aVar4);
    }
}
