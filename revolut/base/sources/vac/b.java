package vac;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import l70.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f287259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f287260c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f287261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f287262h;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, q qVar) {
        this.f287259b = qVar;
        this.f287260c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f287261g = aVar5;
        this.f287262h = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f287259b.f124861b).invoke();
        e eVar = (e) ((phm.a) this.f287260c.f955b).get();
        ee0.a aVar = (ee0.a) ((phm.a) this.d.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.e.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
        ite.a aVar3 = (ite.a) ((phm.a) this.f287261g.f955b).get();
        voa.a aVar4 = (voa.a) ((phm.a) this.f287262h.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        return new a(eVar, aVar, aVar2, cVar, aVar3, aVar4);
    }
}
