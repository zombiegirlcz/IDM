package rtj;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f257280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f257281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f257282c;
    public final nj0.a d;
    public final rk0.c e;
    public final rg0.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cri.b f257283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l70.e f257284h;
    public final vwa.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f257285j;
    public final g k = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f257286l = e4m.b.b(new f(this, 2));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f257287m = e4m.b.b(new f(this, 1));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f257288n = e4m.b.b(new f(this, 0));
    public final e4m.e o = e4m.b.b(new f(this, 3));

    public g(l70.e eVar, ee0.a aVar, nj0.a aVar2, rk0.c cVar, rg0.e eVar2, an0.c cVar2, vwa.b bVar, ite.a aVar3, cri.b bVar2, Context context) {
        this.f257280a = aVar3;
        this.f257281b = aVar;
        this.f257282c = cVar2;
        this.d = aVar2;
        this.e = cVar;
        this.f = eVar2;
        this.f257283g = bVar2;
        this.f257284h = eVar;
        this.i = bVar;
        this.f257285j = context;
    }

    public final jpc.e a() {
        stj.h rewardsHubInteractor = (stj.h) this.f257288n.get();
        gte.a featureToggleInteractor = this.f257280a.b();
        s.j(featureToggleInteractor);
        kuj.g mapper = new kuj.g();
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new jpc.e(rewardsHubInteractor, 6, featureToggleInteractor, mapper);
    }

    public final xe0.e b() {
        ee0.a aVar = this.f257281b;
        je0.d mapper = aVar.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = this.f257282c.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "rewards_hub", mapper, 1, f0.f322471a, 32);
    }
}
