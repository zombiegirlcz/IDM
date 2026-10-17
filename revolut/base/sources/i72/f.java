package i72;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f159087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f159088c;
    public final a31.a d;
    public final a31.a e;

    public f(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        this.f159087b = qVar;
        this.f159088c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f159087b.f124861b).invoke();
        l70.e eVar = (l70.e) ((phm.a) this.f159088c.f955b).get();
        rg0.e eVar2 = (rg0.e) ((phm.a) this.d.f955b).get();
        nj0.a aVar = (nj0.a) ((phm.a) this.e.f955b).get();
        context.getClass();
        eVar.getClass();
        eVar2.getClass();
        aVar.getClass();
        return new l(eVar, eVar2, aVar, context);
    }
}
