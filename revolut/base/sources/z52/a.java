package z52;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f319419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f319420c;
    public final a31.a d;
    public final phm.a e;
    public final a31.a f;

    public a(ecm.q qVar, a31.a aVar, a31.a aVar2, yxj.c cVar, a31.a aVar3) {
        this.f319419b = qVar;
        this.f319420c = aVar;
        this.d = aVar2;
        this.e = cVar;
        this.f = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f319419b.f124861b).invoke();
        uw1.b bVar = (uw1.b) ((phm.a) this.f319420c.f955b).get();
        p12.l lVar = (p12.l) ((phm.a) this.d.f955b).get();
        h hVar = (h) this.e.get();
        ila.b bVar2 = (ila.b) ((phm.a) this.f.f955b).get();
        context.getClass();
        bVar.getClass();
        lVar.getClass();
        hVar.getClass();
        bVar2.getClass();
        return new g(bVar, lVar, hVar, bVar2, context);
    }
}
