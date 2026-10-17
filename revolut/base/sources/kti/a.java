package kti;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f189527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f189528c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f189529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f189530h;
    public final a31.a i;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, q qVar) {
        this.f189527b = qVar;
        this.f189528c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f189529g = aVar5;
        this.f189530h = aVar6;
        this.i = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f189527b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f189528c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        nf0.a aVar2 = (nf0.a) ((phm.a) this.e.f955b).get();
        nj0.a aVar3 = (nj0.a) ((phm.a) this.f.f955b).get();
        l70.e eVar = (l70.e) ((phm.a) this.f189529g.f955b).get();
        ore.b bVar = (ore.b) ((phm.a) this.f189530h.f955b).get();
        ila.b bVar2 = (ila.b) ((phm.a) this.i.f955b).get();
        context.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        eVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        return new g(new b(), aVar, cVar, aVar2, aVar3, eVar, bVar, bVar2);
    }
}
