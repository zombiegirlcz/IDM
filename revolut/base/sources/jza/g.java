package jza;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f179700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f179701c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f179702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f179703h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f179704j;

    public g(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, q qVar, q qVar2) {
        this.f179700b = qVar;
        this.f179701c = qVar2;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f179702g = aVar4;
        this.f179703h = aVar5;
        this.i = aVar6;
        this.f179704j = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f179700b.f124861b).invoke();
        hza.a aVar = (hza.a) ((Function0) this.f179701c.f124861b).invoke();
        lqi.a aVar2 = (lqi.a) ((phm.a) this.d.f955b).get();
        l70.e eVar = (l70.e) ((phm.a) this.e.f955b).get();
        ee0.a aVar3 = (ee0.a) ((phm.a) this.f.f955b).get();
        nj0.a aVar4 = (nj0.a) ((phm.a) this.f179702g.f955b).get();
        f51.a aVar5 = (f51.a) ((phm.a) this.f179703h.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.i.f955b).get();
        w3e.b bVar = (w3e.b) ((phm.a) this.f179704j.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        cVar.getClass();
        bVar.getClass();
        return new b(aVar2, eVar, aVar3, aVar4, aVar5, cVar, bVar, context, aVar);
    }
}
