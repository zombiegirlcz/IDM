package blf;

import bbk.z;
import cmf.p;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import elf.b0;
import elf.d1;
import java.time.LocalDateTime;
import klf.h0;
import klf.m1;
import klf.z1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import thf.m;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f16626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f16627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f16628c;
    public final vlf.b d;
    public final m e;
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1 f16629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.e f16630h;

    public i(h0 commonDataSource, z1 savingsDataSource, m1 juniorDataSource, vlf.b commonUiMapper, m transactionTextResourcesMapper, b0 confirmationClickHandler, d1 noticeLinkClickHandler, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(savingsDataSource, "savingsDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(confirmationClickHandler, "confirmationClickHandler");
        Intrinsics.checkNotNullParameter(noticeLinkClickHandler, "noticeLinkClickHandler");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f16626a = commonDataSource;
        this.f16627b = savingsDataSource;
        this.f16628c = juniorDataSource;
        this.d = commonUiMapper;
        this.e = transactionTextResourcesMapper;
        this.f = confirmationClickHandler;
        this.f16629g = noticeLinkClickHandler;
        this.f16630h = dateProvider;
    }

    public static TextLocalisedClause b(LocalDateTime localDateTime) {
        return localDateTime != null ? new TextLocalisedClause(R$string.savings_transaction_status_executed_at, u.c(new TimeClause(oi0.d.R(localDateTime), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12) : new TextLocalisedClause(R$string.savings_transaction_status_execution_pending, null, null, 14);
    }

    public static CellDetailsNoteDelegate.Model c(Clause clause) {
        return new CellDetailsNoteDelegate.Model("ID_EXTRAS_STATUS", new TextLocalisedClause(R.string.transaction_status, null, null, 14), null, clause, null, false, null, null, null, null, null, 0, 131060);
    }

    public final p a() {
        h0 h0Var = this.f16626a;
        SharedFlow sharedFlowD = h0Var.d();
        SharedFlow sharedFlowC = h0Var.c();
        z1 z1Var = this.f16627b;
        return new p(ta6.a.d(sharedFlowD, sharedFlowC, (SharedFlow) z1Var.f.getValue(), (SharedFlow) z1Var.f185618g.getValue(), new z(this.f16628c.a(), 6), h0Var.i(), new h(7, this, i.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/shared/savings/models/SavingsAccountDetails;Lcom/revolut/feature/shared/savings/models/vault/TransactionMoneyBoxExtra;ZLorg/joda/time/DateTime;)Ljava/util/List;", 4, 0)), new bkd.a(10), v.k(this.f, this.f16629g), "SavingsStatusWithNote");
    }

    public final koi.j d(Clause status, Clause clause) {
        vlf.b bVar = this.d;
        if (status != null && clause != null) {
            bVar.getClass();
            Intrinsics.checkNotNullParameter(status, "status");
            return ((wnf.e) bVar.f290427a).n(status, clause);
        }
        if (status != null) {
            return bVar.j(status);
        }
        if (clause == null) {
            return null;
        }
        TextLocalisedClause status2 = new TextLocalisedClause(R.string.transaction_completed, null, null, 14);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(status2, "status");
        return ((wnf.e) bVar.f290427a).n(status2, clause);
    }
}
