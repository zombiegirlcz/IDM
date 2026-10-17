package ej7;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f126774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f126775c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    public c(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar) {
        this.f126774b = qVar;
        this.f126775c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f126774b.f124861b).invoke();
        c21.e eVar = (c21.e) ((phm.a) this.f126775c.f955b).get();
        l70.e eVar2 = (l70.e) ((phm.a) this.d.f955b).get();
        ee0.a aVar = (ee0.a) ((phm.a) this.e.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
        context.getClass();
        eVar.getClass();
        eVar2.getClass();
        aVar.getClass();
        cVar.getClass();
        return new a(new d(), eVar, eVar2, aVar, cVar, context);
    }
}
