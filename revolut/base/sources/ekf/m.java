package ekf;

import akf.t1;
import akf.v1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f127101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f127102n;
    public final bmf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkf.j f127103p;

    public m(klf.h0 commonDataSource, m1 juniorDataSource, com.revolut.domain.interactors.transactions.a transactionsInteractor, bmf.b modalFactory, fkf.j availabilityChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        this.f127100l = commonDataSource;
        this.f127101m = juniorDataSource;
        this.f127102n = transactionsInteractor;
        this.o = modalFactory;
        this.f127103p = availabilityChecker;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!a10.b.B(v1.Companion, t1.DIRECT_DEBIT_REFUND, str)) {
            return Boolean.FALSE;
        }
        N2(bmf.a.b(this.o, new TextLocalisedClause(R$string.recurring_payment_details_action_refund_direct_debit_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_action_refund_direct_debit_description, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_action_refund_direct_debit_decline, null, null, 14), null, new TextLocalisedClause(R$string.recurring_payment_details_action_refund_direct_debit_confirm, null, null, 14), null, 472), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new ei8.d(this, 12));
        return Boolean.TRUE;
    }
}
