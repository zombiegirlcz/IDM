package pr;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f238819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.q f238820c;
    public final ecm.q d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f238821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f238822h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f238823j;
    public final a31.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a31.a f238824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a31.a f238825m;

    public /* synthetic */ a(ecm.q qVar, ecm.q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, int i) {
        this.f238819b = i;
        this.f238820c = qVar;
        this.d = qVar2;
        this.e = aVar;
        this.f = aVar2;
        this.f238821g = aVar3;
        this.f238822h = aVar4;
        this.i = aVar5;
        this.f238823j = aVar6;
        this.k = aVar7;
        this.f238824l = aVar8;
        this.f238825m = aVar9;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f238819b) {
            case 0:
                Context context = (Context) ((Function0) this.f238820c.f124861b).invoke();
                mq.a aVar = (mq.a) ((Function0) this.d.f124861b).invoke();
                h5j.a aVar2 = (h5j.a) ((phm.a) this.e.f955b).get();
                tq.a aVar3 = (tq.a) ((phm.a) this.f.f955b).get();
                l70.e eVar = (l70.e) ((phm.a) this.f238821g.f955b).get();
                nj0.a aVar4 = (nj0.a) ((phm.a) this.f238822h.f955b).get();
                jm0.a aVar5 = (jm0.a) ((phm.a) this.i.f955b).get();
                px.g gVar = (px.g) ((phm.a) this.f238823j.f955b).get();
                k81.a aVar6 = (k81.a) ((phm.a) this.k.f955b).get();
                t31.b bVar = (t31.b) ((phm.a) this.f238824l.f955b).get();
                nmi.a aVar7 = (nmi.a) ((phm.a) this.f238825m.f955b).get();
                context.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                eVar.getClass();
                aVar4.getClass();
                aVar5.getClass();
                gVar.getClass();
                aVar6.getClass();
                bVar.getClass();
                aVar7.getClass();
                return new q(aVar2, aVar3, gVar, eVar, aVar4, aVar5, aVar6, bVar, aVar7, context, aVar);
            default:
                String str = (String) ((Function0) this.f238820c.f124861b).invoke();
                Context context2 = (Context) ((Function0) this.d.f124861b).invoke();
                c21.e eVar2 = (c21.e) ((phm.a) this.e.f955b).get();
                nj0.a aVar8 = (nj0.a) ((phm.a) this.f.f955b).get();
                ee0.a aVar9 = (ee0.a) ((phm.a) this.f238821g.f955b).get();
                bpj.a aVar10 = (bpj.a) ((phm.a) this.f238822h.f955b).get();
                ite.a aVar11 = (ite.a) ((phm.a) this.i.f955b).get();
                an0.c cVar = (an0.c) ((phm.a) this.f238823j.f955b).get();
                uq3.b bVar2 = (uq3.b) ((phm.a) this.k.f955b).get();
                qie.a aVar12 = (qie.a) ((phm.a) this.f238824l.f955b).get();
                usg.b bVar3 = (usg.b) ((phm.a) this.f238825m.f955b).get();
                str.getClass();
                context2.getClass();
                eVar2.getClass();
                aVar8.getClass();
                aVar9.getClass();
                aVar10.getClass();
                aVar11.getClass();
                cVar.getClass();
                bVar2.getClass();
                aVar12.getClass();
                bVar3.getClass();
                return new v45.a(new w45.a(), new w45.b(), aVar8, eVar2, aVar9, aVar10, aVar11, cVar, bVar2, aVar12, bVar3, str, context2);
        }
    }
}
