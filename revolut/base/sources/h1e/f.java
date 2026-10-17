package h1e;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import kyk.y;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements b60.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148548a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f148549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f148550c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f148551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f148552h;
    public final Object i;

    public f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, q qVar) {
        this.i = qVar;
        this.f148549b = aVar;
        this.f148550c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f148551g = aVar6;
        this.f148552h = aVar7;
    }

    @Override // b60.d
    public final Object a() {
        switch (this.f148548a) {
            case 0:
                Context context = (Context) ((Function0) ((q) this.i).f124861b).invoke();
                cri.b bVar = (cri.b) ((phm.a) this.f148549b.f955b).get();
                zl2.a aVar = (zl2.a) ((phm.a) this.f148550c.f955b).get();
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                osb.a aVar2 = (osb.a) ((phm.a) this.e.f955b).get();
                y90.e eVar2 = (y90.e) ((phm.a) this.f.f955b).get();
                lsb.a aVar3 = (lsb.a) ((phm.a) this.f148551g.f955b).get();
                h9h.a aVar4 = (h9h.a) ((phm.a) this.f148552h.f955b).get();
                context.getClass();
                bVar.getClass();
                aVar.getClass();
                eVar.getClass();
                aVar2.getClass();
                eVar2.getClass();
                aVar3.getClass();
                aVar4.getClass();
                return new c(new hri.b(), new x90.c(), new h(), eVar, bVar, aVar, aVar2, eVar2, aVar3, aVar4, context);
            default:
                l70.e eVar3 = (l70.e) ((phm.a) this.f148549b.f955b).get();
                y yVar = (y) ((phm.a) this.i).get();
                co0.a aVar5 = (co0.a) ((phm.a) this.f148550c.f955b).get();
                nf0.a aVar6 = (nf0.a) ((phm.a) this.d.f955b).get();
                dmc.a aVar7 = (dmc.a) ((phm.a) this.e.f955b).get();
                ite.a aVar8 = (ite.a) ((phm.a) this.f.f955b).get();
                zdl.c cVar = (zdl.c) ((phm.a) this.f148551g.f955b).get();
                zdl.f fVar = (zdl.f) ((phm.a) this.f148552h.f955b).get();
                eVar3.getClass();
                yVar.getClass();
                aVar5.getClass();
                aVar6.getClass();
                aVar7.getClass();
                aVar8.getClass();
                cVar.getClass();
                fVar.getClass();
                return new tyk.b(new hri.b(), eVar3, yVar, aVar5, aVar6, aVar7, fVar, cVar, aVar8);
        }
    }

    public f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, phm.a aVar8) {
        this.f148549b = aVar;
        this.i = aVar8;
        this.f148550c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f148551g = aVar6;
        this.f148552h = aVar7;
    }
}
