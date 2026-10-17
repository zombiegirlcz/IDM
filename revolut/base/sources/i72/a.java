package i72;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f159049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f159050c;
    public final a31.a d;
    public final phm.a e;

    public a(ecm.q qVar, a31.a aVar, a31.a aVar2, j jVar) {
        this.f159049b = qVar;
        this.f159050c = aVar;
        this.d = aVar2;
        this.e = jVar;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f159049b.f124861b).invoke();
        cri.d dVar = (cri.d) ((phm.a) this.f159050c.f955b).get();
        uw1.b bVar = (uw1.b) ((phm.a) this.d.f955b).get();
        l lVar = (l) this.e.get();
        context.getClass();
        dVar.getClass();
        bVar.getClass();
        lVar.getClass();
        return new k(dVar, bVar, lVar, context);
    }
}
