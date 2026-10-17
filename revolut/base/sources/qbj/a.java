package qbj;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f244285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f244286c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f244287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f244288h;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, ecm.q qVar) {
        this.f244285b = qVar;
        this.f244286c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f244287g = aVar5;
        this.f244288h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f244285b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f244286c.f955b).get();
        nf0.a aVar2 = (nf0.a) ((phm.a) this.d.f955b).get();
        rd5.c cVar = (rd5.c) ((phm.a) this.e.f955b).get();
        ak5.a aVar3 = (ak5.a) ((phm.a) this.f.f955b).get();
        c21.e eVar = (c21.e) ((phm.a) this.f244287g.f955b).get();
        an0.c cVar2 = (an0.c) ((phm.a) this.f244288h.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        eVar.getClass();
        cVar2.getClass();
        return new m(aVar, aVar2, cVar, aVar3, eVar, cVar2, context);
    }
}
