package fd2;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f133856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f133857c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f133858g;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        this.f133856b = qVar;
        this.f133857c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
        this.f133858g = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f133856b.f124861b).invoke();
        uw1.b bVar = (uw1.b) ((phm.a) this.f133857c.f955b).get();
        l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
        nj0.a aVar = (nj0.a) ((phm.a) this.e.f955b).get();
        u06.a aVar2 = (u06.a) ((phm.a) this.f.f955b).get();
        so9.b bVar2 = (so9.b) ((phm.a) this.f133858g.f955b).get();
        context.getClass();
        bVar.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        return new f(new d(), bVar, eVar, aVar, aVar2, bVar2, context);
    }
}
