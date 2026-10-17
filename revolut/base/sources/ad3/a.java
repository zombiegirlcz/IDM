package ad3;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f3234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f3235c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f3236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f3237h;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        this.f3234b = qVar;
        this.f3235c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f3236g = aVar5;
        this.f3237h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f3234b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f3235c.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.e.f955b).get();
        npk.a aVar3 = (npk.a) ((phm.a) this.f.f955b).get();
        usg.b bVar = (usg.b) ((phm.a) this.f3236g.f955b).get();
        usg.a aVar4 = (usg.a) ((phm.a) this.f3237h.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        bVar.getClass();
        aVar4.getClass();
        return new f(new c(), aVar, aVar2, cVar, bVar, aVar4, aVar3, context);
    }
}
