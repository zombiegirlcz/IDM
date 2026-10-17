package fgb;

import a31.l;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$IncomeInsuranceClaim;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements sfb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f135023a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f135023a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "salary-account") && Intrinsics.f(cVar.e(2), "claim") && Intrinsics.f(cVar.e(3), "income-insurance");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new h(new BridgeDestination(vhi.c.c(SalaryAccountDestination$IncomeInsuranceClaim.f82949a, yhi.b.SOLID, null, false, 12)), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new l(this, 24), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
