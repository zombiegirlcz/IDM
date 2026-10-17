package slb;

import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import cxe.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lcd.m;
import lcd.q;
import ncd.g;
import nkb.b;
import sl3.i;
import w4l.k;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements yib.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijb.a f264164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f264165b;

    public a(ijb.a savingsProductInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f264164a = savingsProductInteractor;
        this.f264165b = featureToggleInteractor;
    }

    public final Flow b(q qVar, List list, k kVar) {
        if ((qVar instanceof m) && this.f264165b.a(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
            return c.i(Boolean.FALSE);
        }
        return nim.a.v(ijb.a.a(this.f264164a, b.a(qVar), list, null, kVar, 4), new i(9));
    }

    public final u c(q accountTypeFilter, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.A(b(accountTypeFilter, g.a(), loadingStrategy), new i(10));
    }
}
