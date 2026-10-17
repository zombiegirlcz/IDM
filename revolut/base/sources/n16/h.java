package n16;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f211279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f211280c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f211281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f211282h;

    public h(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        this.f211279b = qVar;
        this.f211280c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f211281g = aVar5;
        this.f211282h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f211279b.f124861b).invoke();
        rg0.e eVar = (rg0.e) ((phm.a) this.f211280c.f955b).get();
        nj0.a aVar = (nj0.a) ((phm.a) this.d.f955b).get();
        vv5.e eVar2 = (vv5.e) ((phm.a) this.e.f955b).get();
        c21.e eVar3 = (c21.e) ((phm.a) this.f.f955b).get();
        z46.b bVar = (z46.b) ((phm.a) this.f211281g.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f211282h.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        eVar2.getClass();
        eVar3.getClass();
        bVar.getClass();
        cVar.getClass();
        return new g(eVar, aVar, eVar2, eVar3, bVar, cVar, context);
    }
}
