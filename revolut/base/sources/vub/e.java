package vub;

import com.revolut.feature.rev_points.buying.impl.data.network.RevPointsBuyingService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f292295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292296b;

    public e(f fVar, int i) {
        this.f292295a = fVar;
        this.f292296b = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f292295a;
        nj0.a aVar = fVar.d;
        ee0.a aVar2 = fVar.e;
        int i = this.f292296b;
        if (i == 0) {
            gte.a aVarB = fVar.f292297a.b();
            s.j(aVarB);
            eub.a aVarA = fVar.f292298b.a();
            s.j(aVarA);
            return new wub.a(aVarA, aVarB, fVar.f292299c.a());
        }
        if (i == 1) {
            tub.i iVar = (tub.i) fVar.f292303l.get();
            com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) fVar.f292300g).c();
            s.j(aVarC);
            return new wub.d(iVar, aVarC);
        }
        if (i == 2) {
            return new tub.i((RevPointsBuyingService) fVar.i.get(), (ne0.j) fVar.f292302j.get(), (ue0.c) fVar.k.get());
        }
        if (i == 3) {
            ik0.b retrofitFactory = ((nj0.d) aVar).m();
            s.j(retrofitFactory);
            ek.a converterFactory = ((nj0.d) aVar).d();
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(RevPointsBuyingService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            RevPointsBuyingService revPointsBuyingService = (RevPointsBuyingService) objCreate;
            s.k(revPointsBuyingService);
            return revPointsBuyingService;
        }
        if (i == 4) {
            i.Companion.getClass();
            return new ne0.d();
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = fVar.f.b();
        s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar2.f();
        s.j(storageFactory);
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "rev_points_buying", mapper, 1, f0.f322471a, 32);
    }
}
