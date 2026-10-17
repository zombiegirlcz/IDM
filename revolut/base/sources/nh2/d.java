package nh2;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f215293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f215294c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f215295g;

    public d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        this.f215293b = qVar;
        this.f215294c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f215295g = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f215293b.f124861b).invoke();
        uw1.b bVar = (uw1.b) ((phm.a) this.f215294c.f955b).get();
        nf0.a aVar = (nf0.a) ((phm.a) this.d.f955b).get();
        co0.a aVar2 = (co0.a) ((phm.a) this.e.f955b).get();
        djf.c cVar = (djf.c) ((phm.a) this.f.f955b).get();
        xmg.a aVar3 = (xmg.a) ((phm.a) this.f215295g.f955b).get();
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        return new m(bVar, aVar, aVar2, cVar, aVar3);
    }
}
