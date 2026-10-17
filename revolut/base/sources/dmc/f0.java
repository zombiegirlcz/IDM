package dmc;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f115942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f115943c;
    public final phm.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f115944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f115945h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f115946j;

    public f0(ecm.q qVar, phm.a aVar, phm.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8) {
        this.f115942b = qVar;
        this.f115943c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f115944g = aVar5;
        this.f115945h = aVar6;
        this.i = aVar7;
        this.f115946j = aVar8;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f115942b.f124861b).invoke();
        a aVar = (a) this.f115943c.get();
        c cVar = (c) this.d.get();
        h9h.a aVar2 = (h9h.a) ((phm.a) this.e.f955b).get();
        ite.a aVar3 = (ite.a) ((phm.a) this.f.f955b).get();
        nkh.a aVar4 = (nkh.a) ((phm.a) this.f115944g.f955b).get();
        ika.f fVar = (ika.f) ((phm.a) this.f115945h.f955b).get();
        wvh.a aVar5 = (wvh.a) ((phm.a) this.i.f955b).get();
        zdl.f fVar2 = (zdl.f) ((phm.a) this.f115946j.f955b).get();
        context.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        fVar.getClass();
        aVar5.getClass();
        fVar2.getClass();
        return new b(aVar, cVar, aVar2, aVar3, fVar2, aVar4, fVar, aVar5, context);
    }
}
