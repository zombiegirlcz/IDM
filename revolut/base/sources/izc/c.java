package izc;

import c21.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f169867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f169868c;

    public c(a31.a aVar, a31.a aVar2) {
        this.f169867b = aVar;
        this.f169868c = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        jxc.a aVar = (jxc.a) ((phm.a) this.f169867b.f955b).get();
        e eVar = (e) ((phm.a) this.f169868c.f955b).get();
        aVar.getClass();
        eVar.getClass();
        return new a(aVar, eVar);
    }
}
