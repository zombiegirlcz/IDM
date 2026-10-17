package nm2;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f217153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f217154c;
    public final a31.a d;
    public final a31.a e;

    public c(a31.a aVar, a31.a aVar2, a31.a aVar3, q qVar) {
        this.f217153b = qVar;
        this.f217154c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f217153b.f124861b).invoke();
        om2.e eVar = (om2.e) ((phm.a) this.f217154c.f955b).get();
        nj0.a aVar = (nj0.a) ((phm.a) this.d.f955b).get();
        rk0.c cVar = (rk0.c) ((phm.a) this.e.f955b).get();
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        cVar.getClass();
        return new e(eVar, aVar, cVar, context);
    }
}
