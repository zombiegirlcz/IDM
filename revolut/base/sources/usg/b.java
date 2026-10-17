package usg;

import com.revolut.feature.wallets.impl.network.WalletsService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f282904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f282905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f282906c;
    public final tsg.a d;
    public final xmg.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f282908h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f282909j;
    public final e4m.e k;

    public b(e eVar, ee0.a aVar, nj0.a aVar2, an0.c cVar, xmg.a aVar3, tsg.a aVar4) {
        this.f282904a = aVar2;
        this.f282905b = aVar;
        this.f282906c = cVar;
        this.d = aVar4;
        this.e = aVar3;
        int i = 7;
        this.f = e4m.b.b(new uhc.a(this, 2, i));
        this.f282907g = e4m.b.b(new uhc.a(this, 4, i));
        this.f282908h = e4m.b.b(new uhc.a(this, 3, i));
        this.i = e4m.b.b(new uhc.a(this, 1, i));
        this.f282909j = e4m.b.b(new uhc.a(this, 0, i));
        this.k = e4m.b.b(new uhc.a(this, 5, i));
    }

    public final go3.b a() {
        return (go3.b) this.f.get();
    }

    public final qsg.b b() {
        return (qsg.b) this.f282909j.get();
    }

    public final xe0.e c() {
        ee0.a aVar = this.f282905b;
        je0.d mapper = aVar.b();
        s.j(mapper);
        yk0.a databaseSessionProvider = this.f282906c.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.c(storageFactory, databaseSessionProvider, "wallets", mapper, 5, 16);
    }

    public final WalletsService d() {
        WalletsService walletsService = (WalletsService) a0.d.f((nj0.d) this.f282904a, "retrofit", WalletsService.class, "create(...)");
        s.k(walletsService);
        return walletsService;
    }
}
