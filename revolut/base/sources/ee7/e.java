package ee7;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import ljl.q1;
import p12.l;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f125128c;
    public final a31.a d;
    public final a31.a e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f125129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f125130h;

    public /* synthetic */ e(q qVar, q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3, Object obj2, int i) {
        this.f125127b = i;
        this.f125128c = qVar;
        this.f = qVar2;
        this.d = aVar;
        this.e = aVar2;
        this.f125129g = aVar3;
        this.f125130h = obj2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f125127b) {
            case 0:
                Context context = (Context) ((Function0) this.f125128c.f124861b).invoke();
                String str = (String) ((Function0) this.f.f124861b).invoke();
                of3.f fVar = (of3.f) ((phm.a) this.d.f955b).get();
                l70.e eVar = (l70.e) ((phm.a) this.e.f955b).get();
                rg0.e eVar2 = (rg0.e) ((phm.a) this.f125129g.f955b).get();
                th0.a aVar = (th0.a) ((Function0) ((q) this.f125130h).f124861b).invoke();
                context.getClass();
                str.getClass();
                fVar.getClass();
                eVar.getClass();
                eVar2.getClass();
                aVar.getClass();
                return new a(fVar, eVar, eVar2, aVar, context, str);
            case 1:
                Context context2 = (Context) ((Function0) this.f125128c.f124861b).invoke();
                l70.e eVar3 = (l70.e) ((phm.a) this.d.f955b).get();
                l lVar = (l) ((phm.a) this.f125130h).get();
                ite.a aVar2 = (ite.a) ((phm.a) this.e.f955b).get();
                th0.a aVar3 = (th0.a) ((Function0) this.f.f124861b).invoke();
                pqi.a aVar4 = (pqi.a) ((phm.a) this.f125129g.f955b).get();
                context2.getClass();
                eVar3.getClass();
                lVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                aVar4.getClass();
                return new p12.d(eVar3, lVar, aVar2, aVar3, aVar4);
            default:
                Context context3 = (Context) ((Function0) this.f125128c.f124861b).invoke();
                tmi.b bVar = (tmi.b) ((Function0) this.f.f124861b).invoke();
                nj0.a aVar5 = (nj0.a) ((phm.a) this.d.f955b).get();
                d3l.a aVar6 = (d3l.a) ((phm.a) this.e.f955b).get();
                q1 q1Var = (q1) ((phm.a) this.f125129g.f955b).get();
                qqk.b bVar2 = (qqk.b) ((phm.a) ((a31.a) this.f125130h).f955b).get();
                context3.getClass();
                bVar.getClass();
                aVar5.getClass();
                aVar6.getClass();
                q1Var.getClass();
                bVar2.getClass();
                return new xmi.e(aVar5, aVar6, q1Var, bVar2, bVar);
        }
    }

    public e(q qVar, a31.a aVar, mil.a aVar2, a31.a aVar3, q qVar2, a31.a aVar4) {
        this.f125127b = 1;
        this.f125128c = qVar;
        this.d = aVar;
        this.f125130h = aVar2;
        this.e = aVar3;
        this.f = qVar2;
        this.f125129g = aVar4;
    }
}
