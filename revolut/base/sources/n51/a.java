package n51;

import e4m.e;
import vc.s;
import vpk.p;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements m51.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final npk.a f212527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usg.a f212528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f212529c = e4m.b.b(new m69.a(this, 29));

    public a(npk.a aVar, usg.a aVar2) {
        this.f212527a = aVar;
        this.f212528b = aVar2;
    }

    public final e61.a a() {
        return (e61.a) this.f212529c.get();
    }

    public final f61.a b() {
        p pVar = (p) this.f212527a.v.get();
        s.j(pVar);
        return new f61.a(pVar);
    }
}
