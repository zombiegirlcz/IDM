package w3e;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f294298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f294299c;
    public final a31.a d;

    public c(a31.a aVar, a31.a aVar2, q qVar) {
        this.f294298b = qVar;
        this.f294299c = aVar;
        this.d = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f294298b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f294299c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        context.getClass();
        aVar.getClass();
        cVar.getClass();
        return new a(aVar, cVar);
    }
}
