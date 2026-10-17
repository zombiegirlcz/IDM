package vv5;

import kotlin.jvm.internal.Intrinsics;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an0.c f292452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f292453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rk0.c f292454c;
    public final usg.a d;
    public final jk3.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f292455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f292456h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f292457j;
    public final e4m.e k;

    public e(jk3.c cVar, ee0.a aVar, an0.c cVar2, usg.a aVar2, rk0.c cVar3, ue5.b bVar) {
        this.f292452a = cVar2;
        this.f292453b = aVar;
        this.f292454c = cVar3;
        this.d = aVar2;
        this.e = cVar;
        int i = 29;
        this.f = e4m.b.b(new uhc.a(this, 0, i));
        this.f292455g = e4m.b.b(new uhc.a(this, 2, i));
        this.f292456h = e4m.b.b(new uhc.a(this, 1, i));
        this.i = e4m.b.b(new uhc.a(this, 3, i));
        this.f292457j = e4m.b.b(new uhc.a(this, 5, i));
        this.k = e4m.b.b(new uhc.a(this, 4, i));
    }

    public final xv5.c a() {
        return (xv5.c) this.i.get();
    }

    public final xe0.e b() {
        yk0.a databaseSessionProvider = this.f292452a.b();
        s.j(databaseSessionProvider);
        ee0.a aVar = this.f292453b;
        je0.d mapper = aVar.b();
        s.j(mapper);
        f storageFactory = aVar.f();
        s.j(storageFactory);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "crypto_commodity_storage", mapper, 0, null, 56);
    }

    public final tv5.b c() {
        return (tv5.b) this.k.get();
    }
}
