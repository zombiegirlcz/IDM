package ql7;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f247324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f247325c;
    public final phm.a d;
    public final a31.a e;

    public h2(ecm.q qVar, a31.a aVar, of3.e eVar, a31.a aVar2) {
        this.f247324b = qVar;
        this.f247325c = aVar;
        this.d = eVar;
        this.e = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f247324b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f247325c.f955b).get();
        a aVar2 = (a) this.d.get();
        qw7.c cVar = (qw7.c) ((phm.a) this.e.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        return new c(aVar, aVar2, cVar, context);
    }
}
