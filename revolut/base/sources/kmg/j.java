package kmg;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185883b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f185884c;
    public final phm.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f185885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f185886h;
    public final a31.a i;

    public j(a31.a aVar, a31.a aVar2, a31.a aVar3, nk7.e eVar, a31.a aVar4, a31.a aVar5, q qVar) {
        this.e = aVar;
        this.f = aVar2;
        this.f185885g = aVar3;
        this.d = eVar;
        this.f185886h = aVar4;
        this.i = aVar5;
        this.f185884c = qVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f185883b) {
            case 0:
                cri.b bVar = (cri.b) ((phm.a) this.e.f955b).get();
                rkd.g gVar = (rkd.g) ((phm.a) this.f.f955b).get();
                da3.j jVar = (da3.j) ((phm.a) this.f185885g.f955b).get();
                a aVar = (a) this.d.get();
                lsb.a aVar2 = (lsb.a) ((phm.a) this.f185886h.f955b).get();
                wqb.a aVar3 = (wqb.a) ((phm.a) this.i.f955b).get();
                Context context = (Context) ((Function0) this.f185884c.f124861b).invoke();
                bVar.getClass();
                gVar.getClass();
                jVar.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                context.getClass();
                return new d(bVar, gVar, jVar, aVar, aVar2, aVar3, context);
            default:
                Context context2 = (Context) ((Function0) this.f185884c.f124861b).invoke();
                nm2.e eVar = (nm2.e) this.d.get();
                cm2.b bVar2 = (cm2.b) ((phm.a) this.e.f955b).get();
                l70.e eVar2 = (l70.e) ((phm.a) this.f.f955b).get();
                ite.a aVar4 = (ite.a) ((phm.a) this.f185885g.f955b).get();
                ckg.a aVar5 = (ckg.a) ((phm.a) this.f185886h.f955b).get();
                og3.a aVar6 = (og3.a) ((phm.a) this.i.f955b).get();
                context2.getClass();
                eVar.getClass();
                bVar2.getClass();
                eVar2.getClass();
                aVar4.getClass();
                aVar5.getClass();
                aVar6.getClass();
                return new pm2.c(eVar, bVar2, eVar2, aVar4, aVar5, aVar6);
        }
    }

    public j(q qVar, phm.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        this.f185884c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f185885g = aVar4;
        this.f185886h = aVar5;
        this.i = aVar6;
    }
}
