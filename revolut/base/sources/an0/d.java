package an0;

import android.content.Context;
import dmc.r;
import ecm.q;
import kotlin.jvm.functions.Function0;
import zu8.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6537b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f6538c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6540h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6541j;

    public d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, phm.a aVar8) {
        this.f6538c = aVar;
        this.d = aVar2;
        this.f6539g = aVar8;
        this.e = aVar3;
        this.f = aVar4;
        this.f6540h = aVar5;
        this.i = aVar6;
        this.f6541j = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f6537b) {
            case 0:
                Context context = (Context) ((Function0) ((q) this.f6539g).f124861b).invoke();
                api.a aVar = (api.a) ((Function0) ((q) this.f6540h).f124861b).invoke();
                ih0.b bVar = (ih0.b) ((Function0) ((q) this.i).f124861b).invoke();
                Function0 function0 = (Function0) ((Function0) ((q) this.f6541j).f124861b).invoke();
                l70.e eVar = (l70.e) ((phm.a) this.f6538c.f955b).get();
                ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
                nf0.a aVar3 = (nf0.a) ((phm.a) this.e.f955b).get();
                jm0.a aVar4 = (jm0.a) ((phm.a) this.f.f955b).get();
                context.getClass();
                aVar.getClass();
                bVar.getClass();
                function0.getClass();
                eVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                aVar4.getClass();
                return new c(new tm0.a(), new ym0.a(), new ym0.b(), aVar4, eVar, aVar2, aVar3, context, aVar, bVar, function0);
            case 1:
                ite.a aVar5 = (ite.a) ((phm.a) this.f6538c.f955b).get();
                dmc.a aVar6 = (dmc.a) ((phm.a) this.f6539g).get();
                h9h.a aVar7 = (h9h.a) ((phm.a) this.d.f955b).get();
                zdl.f fVar = (zdl.f) ((phm.a) this.e.f955b).get();
                l70.e eVar2 = (l70.e) ((phm.a) this.f.f955b).get();
                r rVar = (r) ((phm.a) this.f6540h).get();
                dmc.c cVar = (dmc.c) ((phm.a) this.i).get();
                usg.a aVar8 = (usg.a) ((phm.a) ((a31.a) this.f6541j).f955b).get();
                aVar5.getClass();
                aVar6.getClass();
                aVar7.getClass();
                fVar.getClass();
                eVar2.getClass();
                rVar.getClass();
                cVar.getClass();
                aVar8.getClass();
                return new apc.b(aVar5, aVar6, rVar, cVar, aVar7, fVar, eVar2, aVar8);
            default:
                l70.e eVar3 = (l70.e) ((phm.a) this.f6538c.f955b).get();
                ite.a aVar9 = (ite.a) ((phm.a) this.d.f955b).get();
                zd8.a aVar10 = (zd8.a) ((phm.a) this.f6539g).get();
                mj8.b bVar2 = (mj8.b) ((phm.a) this.e.f955b).get();
                kxa.c cVar2 = (kxa.c) ((phm.a) this.f.f955b).get();
                xmg.a aVar11 = (xmg.a) ((phm.a) ((a31.a) this.f6540h).f955b).get();
                c0 c0Var = (c0) ((phm.a) ((a31.a) this.i).f955b).get();
                l78.a aVar12 = (l78.a) ((phm.a) ((a31.a) this.f6541j).f955b).get();
                eVar3.getClass();
                aVar9.getClass();
                aVar10.getClass();
                bVar2.getClass();
                cVar2.getClass();
                aVar11.getClass();
                c0Var.getClass();
                aVar12.getClass();
                return new zd8.f(eVar3, aVar9, aVar10, bVar2, cVar2, aVar11, c0Var, aVar12);
        }
    }

    public d(a31.a aVar, phm.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, phm.a aVar6, phm.a aVar7, a31.a aVar8) {
        this.f6538c = aVar;
        this.f6539g = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f6540h = aVar6;
        this.i = aVar7;
        this.f6541j = aVar8;
    }

    public d(q qVar, q qVar2, q qVar3, q qVar4, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f6539g = qVar;
        this.f6540h = qVar2;
        this.i = qVar3;
        this.f6541j = qVar4;
        this.f6538c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }
}
