package xfb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgb.g f305228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f305229b;

    public s(kgb.g salaryHubRepository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(salaryHubRepository, "salaryHubRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f305228a = salaryHubRepository;
        this.f305229b = userInteractor;
    }

    public final vkm.d a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        kgb.g gVar = this.f305228a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.d.b(Unit.f186387a, loadingStrategy);
    }

    public final akg.n b(p version) {
        Intrinsics.checkNotNullParameter(version, "version");
        int i = q.f305226a[version.ordinal()];
        w4l.h loadingStrategy = w4l.h.f294642c;
        kgb.g gVar = this.f305228a;
        if (i == 1) {
            gVar.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            return nim.a.v(gVar.e.b(Unit.f186387a, loadingStrategy), new wma.e(1, this, s.class, "toAvailability", "toAvailability(Lcom/revolut/feature/retail/salary_account/impl/salary_hub/domain/SalaryHubAvailabilityData;)Lcom/revolut/feature/retail/salary_account/impl/domain/SalaryHubAvailability;", 0, 22));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(gVar.f183946g.b(Unit.f186387a, loadingStrategy), new wma.e(1, this, s.class, "toAvailability", "toAvailability(Lcom/revolut/feature/retail/salary_account/impl/salary_hub_phase3/domain/SalaryHubV3AvailabilityData;)Lcom/revolut/feature/retail/salary_account/impl/domain/SalaryHubAvailability;", 0, 23));
    }

    public final Object c(gim.i iVar) throws Throwable {
        kgb.g gVar = this.f305228a;
        gVar.getClass();
        kgb.f fVar = new kgb.f(gVar, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, fVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
