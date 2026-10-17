package p7c;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class w0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.q f233739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f233740c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    public w0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, ecm.q qVar) {
        this.f233739b = qVar;
        this.f233740c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f233739b.f124861b).invoke();
        ee0.a aVar = (ee0.a) ((phm.a) this.f233740c.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.d.f955b).get();
        ika.f fVar = (ika.f) ((phm.a) this.e.f955b).get();
        ila.b bVar = (ila.b) ((phm.a) this.f.f955b).get();
        context.getClass();
        aVar.getClass();
        cVar.getClass();
        fVar.getClass();
        bVar.getClass();
        return new s0(aVar, cVar, fVar, bVar);
    }
}
