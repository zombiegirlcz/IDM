package g97;

import com.revolut.feature.globalsearch.impl.data.GlobalSearchService;
import fd2.n;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f141481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f141482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f141483c;
    public final usg.a d;
    public final pp.b e;
    public final jk3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f141484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cf0.f f141485h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f141486j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f141487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f141488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f141489n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f141490p;

    public d(nj0.a aVar, ee0.a aVar2, cf0.f fVar, an0.c cVar, jk3.c cVar2, usg.a aVar3, ite.a aVar4, c cVar3, pp.b bVar) {
        this.f141481a = aVar2;
        this.f141482b = cVar;
        this.f141483c = aVar;
        this.d = aVar3;
        this.e = bVar;
        this.f = cVar2;
        this.f141484g = aVar4;
        this.f141485h = fVar;
        int i = 20;
        this.i = e4m.b.b(new n(this, 0, i));
        this.f141486j = e4m.b.b(new n(this, 2, i));
        this.k = e4m.b.b(new n(this, 1, i));
        this.f141487l = e4m.b.b(new n(this, 3, i));
        this.f141488m = new n(this, 5, i);
        this.f141489n = e4m.b.b(new n(this, 4, i));
        this.o = e4m.b.b(new n(this, 7, i));
        this.f141490p = e4m.b.b(new n(this, 6, i));
    }

    public final GlobalSearchService a() {
        Retrofit retrofit = ((nj0.d) this.f141483c).f();
        h97.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(GlobalSearchService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        GlobalSearchService globalSearchService = (GlobalSearchService) objCreate;
        s.k(globalSearchService);
        return globalSearchService;
    }
}
