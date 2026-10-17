package gqd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.execution.IncomeSorterExecutionContract$InputData;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterDestinationTransaction;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecutionDestination;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends oki.h implements f {
    public final IncomeSorterExecutionContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f145699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wzi.a f145700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xld.b f145701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final whf.b f145702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rqd.k f145703t;
    public final rqd.h u;
    public final cli.y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f145704w;

    public v(IncomeSorterExecutionContract$InputData inputData, wsg.n walletInteractor, wzi.a incomeSorterInteractor, xld.b incomeSorterDestinationsInteractor, whf.b transactionsContentProvider, rqd.k incomeSorterTransactionProvider, rqd.h incomeSorterRatesProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationsInteractor, "incomeSorterDestinationsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(incomeSorterTransactionProvider, "incomeSorterTransactionProvider");
        Intrinsics.checkNotNullParameter(incomeSorterRatesProvider, "incomeSorterRatesProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f145699p = walletInteractor;
        this.f145700q = incomeSorterInteractor;
        this.f145701r = incomeSorterDestinationsInteractor;
        this.f145702s = transactionsContentProvider;
        this.f145703t = incomeSorterTransactionProvider;
        this.u = incomeSorterRatesProvider;
        this.v = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f145704w = z1VarB;
    }

    public static c I2(IncomeSorterExecutionDestination incomeSorterExecutionDestination, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (incomeSorterExecutionDestination != null) {
            IncomeSorterDestination incomeSorterDestination = incomeSorterExecutionDestination.f99242a;
            IncomeSorterDestinationTransaction incomeSorterDestinationTransaction = (IncomeSorterDestinationTransaction) d0.o0(incomeSorterExecutionDestination.f99243b);
            a3 a3Var = incomeSorterDestinationTransaction != null ? (a3) linkedHashMap2.get(incomeSorterDestinationTransaction.f99236a) : null;
            IncomeSorterDestinationId incomeSorterDestinationId = incomeSorterDestination.f99167b;
            dj0.d dVar = incomeSorterDestination.f99166a;
            IncomeSorterDestinationInfo incomeSorterDestinationInfo = (IncomeSorterDestinationInfo) linkedHashMap.get(incomeSorterDestinationId);
            Intrinsics.checkNotNullParameter(incomeSorterExecutionDestination, "<this>");
            boolean z = !(incomeSorterExecutionDestination.f99244c == yzi.c.FAILED);
            if (a3Var != null) {
                return new b(dVar, a3Var, z);
            }
            if (incomeSorterDestinationInfo != null) {
                return new a(z, dVar, incomeSorterDestinationInfo);
            }
        }
        return null;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f145704w, new g6f.l(continuation, this, 15)), null, new gii.b(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
