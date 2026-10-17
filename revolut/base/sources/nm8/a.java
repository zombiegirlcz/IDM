package nm8;

import com.revolut.feature.junior_rewards.impl.data.service.JuniorRewardsService;
import kotlin.jvm.internal.Intrinsics;
import te8.z;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f217194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217195b;

    public a(b bVar, int i) {
        this.f217194a = bVar;
        this.f217195b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f217194a;
        nj0.a aVar = bVar.f217196a;
        ee0.a aVar2 = bVar.f217197b;
        int i = this.f217195b;
        if (i == 0) {
            return new om8.f(bVar.b());
        }
        if (i == 1) {
            ik0.b retrofitFactory = ((nj0.d) aVar).m();
            s.j(retrofitFactory);
            ek.a converterFactory = ((nj0.d) aVar).d();
            h.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorRewardsService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            JuniorRewardsService juniorRewardsService = (JuniorRewardsService) objCreate;
            s.k(juniorRewardsService);
            return juniorRewardsService;
        }
        if (i == 2) {
            h.Companion.getClass();
            return new ne0.d();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            z zVarE = bVar.e.e();
            s.j(zVarE);
            return new om8.c(zVarE, bVar.b());
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = bVar.f217198c.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar2.f();
        s.j(storageFactory);
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "junior_partnerships", mapper, 1, f0.f322471a, 32);
    }
}
