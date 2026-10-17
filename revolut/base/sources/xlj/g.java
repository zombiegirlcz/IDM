package xlj;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements e {
    public final EsimMobilePlanPaymentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f307024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f307025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f307026r;

    public g(EsimMobilePlanPaymentsScreenContract$InputData inputData, n stateMapper, r planTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(planTransactionsInteractor, "planTransactionsInteractor");
        this.o = inputData;
        this.f307024p = planTransactionsInteractor;
        this.f307025q = new vii.b();
        this.f307026r = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f307025q, new x18.e(continuation, this, 15)), null, null, new xjl.g(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f307026r;
    }
}
