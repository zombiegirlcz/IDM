package g76;

import fd2.n;
import kotlin.jvm.internal.Intrinsics;
import n16.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f141126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f141127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f141128c;
    public final vv5.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f141130h;
    public final e4m.e i;

    public a(ee0.a aVar, nj0.a aVar2, vv5.e eVar, g gVar) {
        this.f141126a = gVar;
        this.f141127b = aVar2;
        this.f141128c = aVar;
        this.d = eVar;
        int i = 14;
        this.e = e4m.b.b(new n(this, 2, i));
        this.f = e4m.b.b(new n(this, 3, i));
        this.f141129g = e4m.b.b(new n(this, 4, i));
        this.f141130h = e4m.b.b(new n(this, 1, i));
        this.i = e4m.b.b(new n(this, 0, i));
    }

    public final ev5.a a() {
        d76.b impl = new d76.b(this.f141126a.a());
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        return new ev5.a(impl, 1);
    }

    public final h76.a b() {
        return (h76.a) this.i.get();
    }
}
