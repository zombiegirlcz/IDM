package sob;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.BalanceSummaryDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import rnb.r;
import rnb.w;
import sek.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends oki.h implements e {
    public final BalanceSummaryDialogScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f264808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f264809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l80.e f264810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f264811s;

    public g(n stateMapper, BalanceSummaryDialogScreenContract$InputData inputData, w savingsVaultInteractor, r savingsStatisticsInteractorImpl, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsStatisticsInteractorImpl, "savingsStatisticsInteractorImpl");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = inputData;
        this.f264808p = savingsVaultInteractor;
        this.f264809q = savingsStatisticsInteractorImpl;
        this.f264810r = dateProvider;
        this.f264811s = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, boh.f.e(this.f264808p.c(this.o.f83364a, w4l.h.f294642c), new sl5.a(this, 7)), null, null, new q(this, null, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f264811s;
    }
}
