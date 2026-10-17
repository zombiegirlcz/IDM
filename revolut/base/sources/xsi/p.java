package xsi;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sx2.z;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends oki.h implements d {

    @NotNull
    public static final o Companion = new o();
    public final AdjustAnalyticsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f308539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f308540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f308541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tsi.b f308542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final eqj.g f308543t;
    public final y u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f308544w;

    public p(cli.n stateMapper, AdjustAnalyticsContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor, w80.b amountFormatter, j60.a bottomDialog, tsi.b excludeTransactionSheetMapper, eqj.g transactionAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(excludeTransactionSheetMapper, "excludeTransactionSheetMapper");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        this.o = inputData;
        this.f308539p = transactionsInteractor;
        this.f308540q = amountFormatter;
        this.f308541r = bottomDialog;
        this.f308542s = excludeTransactionSheetMapper;
        this.f308543t = transactionAnalyticsInteractor;
        this.u = mra.d.b(this, new c(new Data(null, null, true, 3, null), inputData.f98704b), stateMapper, null, true, 4);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
    }

    public final void I2(boolean z) {
        j60.a.v(this.f308541r, false, null, 3);
        b bVar = (b) ((c) ((j2) this.u.f22677a).getValue()).f308526a.getContent();
        if (bVar == null) {
            return;
        }
        n2(new z(bVar, this, z, null), new whi.b(6));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.v, new x18.e(continuation, this, 19)), null, new xjl.g(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
