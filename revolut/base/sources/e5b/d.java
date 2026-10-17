package e5b;

import a2b.g;
import a2b.h;
import com.revolut.feature.retail.cfd.api.CfdApi$Toggles;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$CashTradeDetails$Destination;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.ui.api.navigation.trade.HoldingTradeDetailsDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dfl.b0;
import dfl.c0;
import dfl.d0;
import dfl.e0;
import dfl.f0;
import dfl.g0;
import dfl.h0;
import dfl.i;
import dfl.i0;
import dfl.j;
import dfl.k;
import dfl.l;
import dfl.m;
import dfl.s;
import dfl.t;
import dfl.v;
import dfl.w;
import dfl.y;
import dfl.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f122800a;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f122800a = featureToggleInteractor;
    }

    @Override // q1h.d
    public final aii.e a(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        i0 f85125a = transaction.getF85125a();
        if (f85125a instanceof dfl.b) {
            return new g((dfl.b) f85125a);
        }
        if (f85125a instanceof v) {
            v vVar = (v) f85125a;
            return ((jte.d) this.f122800a).c(CfdApi$Toggles.CfdOvernightFeeBreakdown.f82093c) ? new h(vVar) : new sih.a(vVar);
        }
        if ((f85125a instanceof dfl.d) || (f85125a instanceof z) || (f85125a instanceof dfl.h) || (f85125a instanceof j) || (f85125a instanceof dfl.g) || (f85125a instanceof y) || (f85125a instanceof s) || (f85125a instanceof w) || (f85125a instanceof b0) || (f85125a instanceof f0) || (f85125a instanceof g0) || (f85125a instanceof k) || (f85125a instanceof h0) || (f85125a instanceof dfl.c) || (f85125a instanceof l) || (f85125a instanceof i) || (f85125a instanceof t) || (f85125a instanceof c0) || (f85125a instanceof e0) || (f85125a instanceof dfl.e) || (f85125a instanceof m) || (f85125a instanceof d0)) {
            return new sih.a(f85125a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // q1h.d
    public final KompotDestination b(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        i0 f85125a = transaction.getF85125a();
        if (f85125a instanceof dfl.b) {
            return new CfdTradingFeatureConfig$CashTradeDetails$Destination((dfl.b) f85125a);
        }
        if (f85125a instanceof v) {
            v vVar = (v) f85125a;
            return ((jte.d) this.f122800a).c(CfdApi$Toggles.CfdOvernightFeeBreakdown.f82093c) ? new CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination(vVar) : new HoldingTradeDetailsDestination(vVar);
        }
        if ((f85125a instanceof dfl.d) || (f85125a instanceof z) || (f85125a instanceof dfl.h) || (f85125a instanceof j) || (f85125a instanceof dfl.g) || (f85125a instanceof y) || (f85125a instanceof s) || (f85125a instanceof w) || (f85125a instanceof b0) || (f85125a instanceof f0) || (f85125a instanceof g0) || (f85125a instanceof k) || (f85125a instanceof h0) || (f85125a instanceof dfl.c) || (f85125a instanceof l) || (f85125a instanceof i) || (f85125a instanceof t) || (f85125a instanceof c0) || (f85125a instanceof e0) || (f85125a instanceof dfl.e) || (f85125a instanceof m) || (f85125a instanceof d0)) {
            return new HoldingTradeDetailsDestination(f85125a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
