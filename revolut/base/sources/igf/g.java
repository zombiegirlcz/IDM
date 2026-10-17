package igf;

import cli.y;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import hy1.b0;
import i69.p;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends oki.h implements b {

    @NotNull
    public static final e Companion = new e();
    public final TransactionDetailsPagerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jkg.d f161190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugc.a f161191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f161192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f161193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f161194t;

    public g(TransactionDetailsPagerFlowContract$InputData inputData, jkg.d transactionsPaginator, ugc.a investNavigationProvider, h saveStateDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsPaginator, "transactionsPaginator");
        Intrinsics.checkNotNullParameter(investNavigationProvider, "investNavigationProvider");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        this.o = inputData;
        this.f161190p = transactionsPaginator;
        this.f161191q = investNavigationProvider;
        this.f161192r = ta6.a.a(0);
        String f94575b = inputData.f91897a.getF94575b();
        e eVar = Companion;
        UnifiedTransaction unifiedTransaction = inputData.f91897a;
        List listC = u.c(unifiedTransaction);
        eVar.getClass();
        this.f161193s = mra.d.b(this, new c(zi0.c.P(u.c(unifiedTransaction), false, null, 3), null, f94575b, e.a(listC)), new i(), saveStateDelegate, false, 8);
        this.f161194t = s.b(this, new p(this, 15));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f161194t;
    }

    @Override // yji.l
    public final void I1() {
        UnifiedTransactionsFilter unifiedTransactionsFilter = this.o.f91898b;
        Continuation continuation = null;
        l.a1(this, q.q(this.f161190p.a(unifiedTransactionsFilter == null ? vkm.i.f290039a : new b0(new vkm.y(new i44.a(this, continuation, 24), this.f161192r), unifiedTransactionsFilter, this, 7))), null, null, new ibg.g(this, continuation, 5), 3);
    }

    public final void I2(TransactionDetailsPagerFlowContract$DetailsPage transactionDetailsPagerFlowContract$DetailsPage) {
        y yVar = this.f161193s;
        if (((c) ((j2) yVar.f22677a).getValue()).d.getLoading()) {
            return;
        }
        H2(yVar, new id8.a(27));
        this.f161192r.k(transactionDetailsPagerFlowContract$DetailsPage.f91896a);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f161193s;
    }
}
