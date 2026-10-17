package f49;

import android.content.Context;
import ecm.q;
import fma.h;
import g49.f;
import jge.j;
import jge.k;
import kotlin.jvm.functions.Function0;
import l70.e;
import z73.i;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f132037b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f132038c;
    public final a31.a d;
    public final phm.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f132039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f132040h;
    public final Object i;

    public c(a31.a aVar, a31.a aVar2, ibh.a aVar3, a31.a aVar4, a31.a aVar5, ibh.a aVar6, ibh.a aVar7) {
        this.f132038c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f132039g = aVar5;
        this.f132040h = aVar6;
        this.i = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f132037b) {
            case 0:
                Context context = (Context) ((Function0) ((q) this.f132040h).f124861b).invoke();
                ee0.a aVar = (ee0.a) ((phm.a) this.f132038c.f955b).get();
                an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
                e eVar = (e) ((phm.a) this.f.f955b).get();
                nj0.a aVar2 = (nj0.a) ((phm.a) this.f132039g.f955b).get();
                th0.a aVar3 = (th0.a) ((Function0) ((q) this.i).f124861b).invoke();
                b bVar = (b) this.e.get();
                context.getClass();
                aVar.getClass();
                cVar.getClass();
                eVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                bVar.getClass();
                return new a(new f(), aVar, cVar, eVar, aVar2, aVar3, bVar, context);
            default:
                i iVar = (i) ((phm.a) this.f132038c.f955b).get();
                ite.a aVar4 = (ite.a) ((phm.a) this.d.f955b).get();
                ige.a aVar5 = (ige.a) this.e.get();
                h hVar = (h) ((phm.a) this.f.f955b).get();
                h30.a aVar6 = (h30.a) ((phm.a) this.f132039g.f955b).get();
                k kVar = (k) ((phm.a) this.f132040h).get();
                nge.a aVar7 = (nge.a) ((phm.a) this.i).get();
                iVar.getClass();
                aVar4.getClass();
                aVar5.getClass();
                hVar.getClass();
                aVar6.getClass();
                kVar.getClass();
                aVar7.getClass();
                return new j(aVar5, iVar, aVar4, hVar, aVar6, kVar, aVar7);
        }
    }

    public c(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar2, c63.b bVar) {
        this.f132040h = qVar;
        this.f132038c = aVar;
        this.d = aVar2;
        this.f = aVar3;
        this.f132039g = aVar4;
        this.i = qVar2;
        this.e = bVar;
    }
}
