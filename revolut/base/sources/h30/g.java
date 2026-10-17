package h30;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f148892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.q f148893c;

    public g(a31.a aVar, ecm.q qVar) {
        this.f148892b = aVar;
        this.f148893c = qVar;
    }

    @Override // b60.a
    public final Object a() {
        l70.e eVar = (l70.e) ((phm.a) this.f148892b.f955b).get();
        yk0.c cVar = (yk0.c) ((Function0) this.f148893c.f124861b).invoke();
        eVar.getClass();
        cVar.getClass();
        return new g0(eVar, cVar);
    }
}
