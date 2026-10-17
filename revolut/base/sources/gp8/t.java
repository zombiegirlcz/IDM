package gp8;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145333b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f145334c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f145335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f145336h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f145337j;
    public final Object k;

    public t(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, phm.a aVar8, a31.a aVar9) {
        this.f145334c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f145335g = aVar5;
        this.f145336h = aVar6;
        this.i = aVar7;
        this.k = aVar8;
        this.f145337j = aVar9;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f145333b) {
            case 0:
                l70.e eVar = (l70.e) ((phm.a) this.f145334c.f955b).get();
                mj8.b bVar = (mj8.b) ((phm.a) this.d.f955b).get();
                zd8.a aVar = (zd8.a) ((phm.a) this.e.f955b).get();
                xmg.a aVar2 = (xmg.a) ((phm.a) this.f.f955b).get();
                usg.a aVar3 = (usg.a) ((phm.a) ((a31.a) this.f145335g).f955b).get();
                co0.a aVar4 = (co0.a) ((phm.a) ((a31.a) this.f145336h).f955b).get();
                nf0.a aVar5 = (nf0.a) ((phm.a) ((a31.a) this.i).f955b).get();
                b bVar2 = (b) ((phm.a) this.k).get();
                ite.a aVar6 = (ite.a) ((phm.a) ((a31.a) this.f145337j).f955b).get();
                eVar.getClass();
                bVar.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                aVar4.getClass();
                aVar5.getClass();
                bVar2.getClass();
                aVar6.getClass();
                return new n(eVar, bVar, aVar, aVar2, aVar3, aVar4, aVar5, bVar2, aVar6);
            default:
                Context context = (Context) ((Function0) ((ecm.q) this.f145335g).f124861b).invoke();
                dm0.c cVar = (dm0.c) ((Function0) ((ecm.q) this.f145336h).f124861b).invoke();
                kn0.a aVar7 = (kn0.a) ((Function0) ((ecm.q) this.i).f124861b).invoke();
                fni.a aVar8 = (fni.a) ((Function0) ((ecm.q) this.f145337j).f124861b).invoke();
                rg0.e eVar2 = (rg0.e) ((phm.a) this.f145334c.f955b).get();
                l70.e eVar3 = (l70.e) ((phm.a) this.d.f955b).get();
                ee0.a aVar9 = (ee0.a) ((phm.a) this.e.f955b).get();
                th0.a aVar10 = (th0.a) ((Function0) ((ecm.q) this.k).f124861b).invoke();
                nn0.c cVar2 = (nn0.c) ((phm.a) this.f.f955b).get();
                context.getClass();
                cVar.getClass();
                aVar7.getClass();
                aVar8.getClass();
                eVar2.getClass();
                eVar3.getClass();
                aVar9.getClass();
                aVar10.getClass();
                cVar2.getClass();
                return new jm0.a(new fm0.a(), eVar3, aVar9, aVar10, cVar2, eVar2, context, cVar, aVar7, aVar8);
        }
    }

    public t(ecm.q qVar, ecm.q qVar2, ecm.q qVar3, ecm.q qVar4, a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar5, a31.a aVar4) {
        this.f145335g = qVar;
        this.f145336h = qVar2;
        this.i = qVar3;
        this.f145337j = qVar4;
        this.f145334c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.k = qVar5;
        this.f = aVar4;
    }
}
