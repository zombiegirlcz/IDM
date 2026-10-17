package ex7;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f130374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f130375c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f130376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f130377h;
    public final a31.a i;

    public b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, q qVar) {
        this.f130374b = qVar;
        this.f130375c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f130376g = aVar5;
        this.f130377h = aVar6;
        this.i = aVar7;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f130374b.f124861b).invoke();
        c21.e eVar = (c21.e) ((phm.a) this.f130375c.f955b).get();
        ee0.a aVar = (ee0.a) ((phm.a) this.d.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.e.f955b).get();
        l70.e eVar2 = (l70.e) ((phm.a) this.f.f955b).get();
        ite.a aVar3 = (ite.a) ((phm.a) this.f130376g.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f130377h.f955b).get();
        qw7.c cVar2 = (qw7.c) ((phm.a) this.i.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        eVar2.getClass();
        aVar3.getClass();
        cVar.getClass();
        cVar2.getClass();
        return new a(new e(), eVar, aVar, aVar2, eVar2, aVar3, cVar, cVar2, context);
    }
}
