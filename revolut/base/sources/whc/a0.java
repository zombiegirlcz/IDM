package whc;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f297484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f297485c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f297486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f297487h;

    public a0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, ecm.q qVar) {
        this.f297484b = qVar;
        this.f297485c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f297486g = aVar5;
        this.f297487h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f297484b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f297485c.f955b).get();
        nf0.a aVar2 = (nf0.a) ((phm.a) this.d.f955b).get();
        nj0.a aVar3 = (nj0.a) ((phm.a) this.e.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
        c21.e eVar = (c21.e) ((phm.a) this.f297486g.f955b).get();
        efk.a aVar4 = (efk.a) ((phm.a) this.f297487h.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        cVar.getClass();
        eVar.getClass();
        aVar4.getClass();
        return new b(new h0(), aVar, aVar2, aVar3, cVar, eVar, aVar4, context);
    }
}
