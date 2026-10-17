package mj8;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f205968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f205969c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f205970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f205971h;
    public final a31.a i;

    public i(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, q qVar) {
        this.f205968b = qVar;
        this.f205969c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f205970g = aVar5;
        this.f205971h = aVar6;
        this.i = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f205968b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f205969c.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.e.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f.f955b).get();
        rg0.e eVar = (rg0.e) ((phm.a) this.f205970g.f955b).get();
        xmg.a aVar3 = (xmg.a) ((phm.a) this.f205971h.f955b).get();
        usg.a aVar4 = (usg.a) ((phm.a) this.i.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        bVar.getClass();
        eVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        return new b(new j(), aVar2, aVar, cVar, bVar, eVar, aVar3, aVar4);
    }
}
