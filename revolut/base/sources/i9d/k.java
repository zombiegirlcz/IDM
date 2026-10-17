package i9d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreenContract$InputData;
import jki.p;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import vkm.q;
import vkm.q0;
import vkm.y;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mde.e f159640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UpcomingTransactionsScreenContract$InputData f159641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lal.a f159642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lde.f f159643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f159644t;
    public final e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mde.e helpDestinationProvider, UpcomingTransactionsScreenContract$InputData inputData, lal.a sharedUpcomingTransactionTroubleshooterInteractor, lde.f transactionItemsDelegate, n widgetsInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedUpcomingTransactionTroubleshooterInteractor, "sharedUpcomingTransactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(transactionItemsDelegate, "transactionItemsDelegate");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f159640p = helpDestinationProvider;
        this.f159641q = inputData;
        this.f159642r = sharedUpcomingTransactionTroubleshooterInteractor;
        this.f159643s = transactionItemsDelegate;
        this.f159644t = widgetsInteractor;
        this.u = new e(new Data(null, null, true, 3, null), inputData.f86371b);
    }

    @Override // yji.l
    public final void T1(long j2) {
        lde.f fVar = this.f159643s;
        l.b1(this, q.q(new q0(new y(q.Q(fVar.e, new a3(null, fVar, 26)), new a82.q(3, 29, null)), new i13.d(this, (Continuation) null, 28), 1)), null, null, 7);
        n2(new hy2.e(this, null, 18), new whi.b(6));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
