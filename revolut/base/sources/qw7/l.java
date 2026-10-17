package qw7;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f249832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f249833c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f249834g;

    public l(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        this.f249832b = qVar;
        this.f249833c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f249834g = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f249832b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f249833c.f955b).get();
        nj0.a aVar2 = (nj0.a) ((phm.a) this.d.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.e.f955b).get();
        efk.a aVar3 = (efk.a) ((phm.a) this.f.f955b).get();
        jk3.c cVar2 = (jk3.c) ((phm.a) this.f249834g.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        cVar2.getClass();
        return new c(aVar, aVar2, cVar, aVar3, cVar2);
    }
}
