package nm8;

import com.revolut.feature.junior_rewards.impl.data.service.JuniorRewardsService;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f217196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f217197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f217198c;
    public final nf0.a d;
    public final se8.a e;
    public final e4m.e f = e4m.b.b(new a(this, 1));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f217199g = e4m.b.b(new a(this, 2));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f217200h = e4m.b.b(new a(this, 3));
    public final e4m.e i = e4m.b.b(new a(this, 0));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f217201j = e4m.b.b(new a(this, 4));

    public b(nj0.a aVar, se8.a aVar2, ee0.a aVar3, an0.c cVar, nf0.a aVar4) {
        this.f217196a = aVar;
        this.f217197b = aVar3;
        this.f217198c = cVar;
        this.d = aVar4;
        this.e = aVar2;
    }

    public final om8.c a() {
        return (om8.c) this.f217201j.get();
    }

    public final jm8.b b() {
        JuniorRewardsService juniorRewardsService = (JuniorRewardsService) this.f.get();
        j jVar = (j) this.f217199g.get();
        ue0.c cVar = (ue0.c) this.f217200h.get();
        sf0.h hVarB = this.d.b();
        s.j(hVarB);
        return new jm8.b(juniorRewardsService, jVar, cVar, hVarB);
    }
}
