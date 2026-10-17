package iwc;

import akg.n;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import cuc.z;
import is2.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import w4l.i;
import wtc.k;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f169083a;

    public b(k outboundTransactionLimitsInteractor) {
        Intrinsics.checkNotNullParameter(outboundTransactionLimitsInteractor, "outboundTransactionLimitsInteractor");
        this.f169083a = outboundTransactionLimitsInteractor;
    }

    public final n a(TransactionsLimitsScreenContract$LimitFlowType limitType, fwc.n limitsAccountType) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(limitsAccountType, "limitsAccountType");
        boolean z = limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.Singapore;
        k kVar = this.f169083a;
        n nVarV = null;
        if (z || (limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended)) {
            z zVar = (z) ((wtc.n) kVar).f299887a;
            zVar.getClass();
            i loadingStrategy = i.f294643c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            nVarV = nim.a.v(nim.a.v(zVar.e.b(Unit.f186387a, loadingStrategy), new wpj.b(nVarV, 12)), new t(limitsAccountType, 23));
        } else if (!(limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.WalletLimits)) {
            throw new NoWhenBranchMatchedException();
        }
        return nVarV != null ? nim.a.v(u0.m(nVarV, nim.a.v(e.b(osg.b.k(((wtc.n) kVar).f299888b, false, 3)), new wsg.a(18))), new iui.a(28)) : nim.a.v(nim.a.v(e.b(osg.b.k(((wtc.n) kVar).f299888b, false, 3)), new wsg.a(18)), new iui.a(29));
    }
}
