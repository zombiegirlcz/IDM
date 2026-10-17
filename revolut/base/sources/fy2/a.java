package fy2;

import android.content.Context;
import da3.j;
import ecm.q;
import jm4.a3;
import jm4.q4;
import jm4.r;
import kotlin.jvm.functions.Function0;
import nm4.f;
import zxb.e;
import zxb.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138876b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f138877c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f138878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f138879h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f138880j;
    public final Object k;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, q qVar, q qVar2) {
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f138878g = aVar4;
        this.f138879h = aVar5;
        this.i = aVar6;
        this.f138880j = aVar7;
        this.f138877c = qVar;
        this.k = qVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f138876b) {
            case 0:
                usg.a aVar = (usg.a) ((phm.a) this.d.f955b).get();
                j jVar = (j) ((phm.a) this.e.f955b).get();
                ite.a aVar2 = (ite.a) ((phm.a) this.f.f955b).get();
                r rVar = (r) ((phm.a) this.f138878g.f955b).get();
                e48.a aVar3 = (e48.a) ((phm.a) this.f138879h.f955b).get();
                h98.j jVar2 = (h98.j) ((phm.a) ((a31.a) this.i).f955b).get();
                xmg.a aVar4 = (xmg.a) ((phm.a) ((a31.a) this.f138880j).f955b).get();
                th0.a aVar5 = (th0.a) ((Function0) this.f138877c.f124861b).invoke();
                Context context = (Context) ((Function0) ((q) this.k).f124861b).invoke();
                aVar.getClass();
                jVar.getClass();
                aVar2.getClass();
                rVar.getClass();
                aVar3.getClass();
                jVar2.getClass();
                aVar4.getClass();
                aVar5.getClass();
                context.getClass();
                return new d(aVar, jVar, aVar2, rVar, aVar3, jVar2, aVar4, aVar5, context);
            default:
                Context context2 = (Context) ((Function0) this.f138877c.f124861b).invoke();
                cri.a aVar6 = (cri.a) ((phm.a) this.d.f955b).get();
                r rVar2 = (r) ((phm.a) this.i).get();
                f fVar = (f) ((phm.a) this.f138880j).get();
                a3 a3Var = (a3) ((phm.a) this.k).get();
                hsh.b bVar = (hsh.b) ((phm.a) this.e.f955b).get();
                e eVar = (e) ((phm.a) this.f.f955b).get();
                k0 k0Var = (k0) ((phm.a) this.f138878g.f955b).get();
                cri.b bVar2 = (cri.b) ((phm.a) this.f138879h.f955b).get();
                context2.getClass();
                aVar6.getClass();
                rVar2.getClass();
                fVar.getClass();
                a3Var.getClass();
                bVar.getClass();
                eVar.getClass();
                k0Var.getClass();
                bVar2.getClass();
                return new q4(aVar6, rVar2, fVar, a3Var, bVar, eVar, k0Var, bVar2, context2);
        }
    }

    public a(q qVar, a31.a aVar, ibh.a aVar2, ibh.a aVar3, ibh.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8) {
        this.f138877c = qVar;
        this.d = aVar;
        this.i = aVar2;
        this.f138880j = aVar3;
        this.k = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f138878g = aVar7;
        this.f138879h = aVar8;
    }
}
