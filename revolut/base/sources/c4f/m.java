package c4f;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f21236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f21237c;
    public final a31.a d;

    public m(a31.a aVar, a31.a aVar2, ecm.q qVar) {
        this.f21236b = qVar;
        this.f21237c = aVar;
        this.d = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f21236b.f124861b).invoke();
        ee0.c cVar = (ee0.c) ((phm.a) this.f21237c.f955b).get();
        an0.c cVar2 = (an0.c) ((phm.a) this.d.f955b).get();
        context.getClass();
        cVar.getClass();
        cVar2.getClass();
        return new b(cVar, cVar2, context);
    }
}
