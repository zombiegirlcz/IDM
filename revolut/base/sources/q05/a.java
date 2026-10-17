package q05;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f241136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f241137c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f241138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f241139h;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        this.f241136b = qVar;
        this.f241137c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f241138g = aVar5;
        this.f241139h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f241136b.f124861b).invoke();
        l70.e eVar = (l70.e) ((phm.a) this.f241137c.f955b).get();
        ee0.a aVar = (ee0.a) ((phm.a) this.d.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.e.f955b).get();
        uq3.b bVar = (uq3.b) ((phm.a) this.f.f955b).get();
        ila.b bVar2 = (ila.b) ((phm.a) this.f241138g.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f241139h.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        return new e(eVar, aVar, aVar2, bVar, bVar2, cVar);
    }
}
