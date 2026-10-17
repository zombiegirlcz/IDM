package fnb;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f136613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f136614c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final phm.a f136615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final phm.a f136616h;
    public final a31.a i;

    public j(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, phm.a aVar5, phm.a aVar6, a31.a aVar7) {
        this.f136613b = qVar;
        this.f136614c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f136615g = aVar5;
        this.f136616h = aVar6;
        this.i = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f136613b.f124861b).invoke();
        l70.e eVar = (l70.e) ((phm.a) this.f136614c.f955b).get();
        nj0.a aVar = (nj0.a) ((phm.a) this.d.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.e.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
        tib.b bVar = (tib.b) this.f136615g.get();
        pib.b bVar2 = (pib.b) this.f136616h.get();
        ore.b bVar3 = (ore.b) ((phm.a) this.i.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        return new b(eVar, aVar, aVar2, cVar, bVar, bVar2, bVar3);
    }
}
