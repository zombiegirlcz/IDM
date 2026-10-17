package hc2;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f150773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f150774c;
    public final a31.a d;
    public final a31.a e;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, ecm.q qVar) {
        this.f150773b = qVar;
        this.f150774c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f150773b.f124861b).invoke();
        l70.e eVar = (l70.e) ((phm.a) this.f150774c.f955b).get();
        uw1.b bVar = (uw1.b) ((phm.a) this.d.f955b).get();
        ila.b bVar2 = (ila.b) ((phm.a) this.e.f955b).get();
        context.getClass();
        eVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        return new i(eVar, bVar, bVar2, context);
    }
}
