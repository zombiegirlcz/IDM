package esj;

import aw0.f4;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends jki.g implements v {

    @NotNull
    public static final z Companion = new z();
    public final ldd.b A;
    public final wsg.n B;
    public final z1 C;
    public final o D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tzi.a f128958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pzi.b f128959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mrj.a f128960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final grj.j f128961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w80.b f128962t;
    public final asj.j u;
    public final a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f128963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zrj.b f128964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zrj.a f128965y;
    public final SetOverallBudgetScreenContract$InputData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(tzi.a budgetingCycleInteractor, pzi.b budgetingInteractor, mrj.a spentAmountsLoader, grj.j jointBudgetingDataSynchronizer, w80.b amountFormatter, asj.j setBudgetsSharedStateProvider, a setOverallBudgetDomainStateMapper, j60.a bottomDialog, zrj.b setBudgetsResetBudgetDialogProvider, zrj.a setBudgetsExceedOverallBudgetDialogProvider, SetOverallBudgetScreenContract$InputData inputData, ldd.b focusRequesterDelegate, wsg.n walletInteractor, f0 stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(spentAmountsLoader, "spentAmountsLoader");
        Intrinsics.checkNotNullParameter(jointBudgetingDataSynchronizer, "jointBudgetingDataSynchronizer");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(setBudgetsSharedStateProvider, "setBudgetsSharedStateProvider");
        Intrinsics.checkNotNullParameter(setOverallBudgetDomainStateMapper, "setOverallBudgetDomainStateMapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(setBudgetsResetBudgetDialogProvider, "setBudgetsResetBudgetDialogProvider");
        Intrinsics.checkNotNullParameter(setBudgetsExceedOverallBudgetDialogProvider, "setBudgetsExceedOverallBudgetDialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f128958p = budgetingCycleInteractor;
        this.f128959q = budgetingInteractor;
        this.f128960r = spentAmountsLoader;
        this.f128961s = jointBudgetingDataSynchronizer;
        this.f128962t = amountFormatter;
        this.u = setBudgetsSharedStateProvider;
        this.v = setOverallBudgetDomainStateMapper;
        this.f128963w = bottomDialog;
        this.f128964x = setBudgetsResetBudgetDialogProvider;
        this.f128965y = setBudgetsExceedOverallBudgetDialogProvider;
        this.z = inputData;
        this.A = focusRequesterDelegate;
        this.B = walletInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.C = z1VarB;
        this.D = new o(new Data(null, null, true, 3, null), false);
    }

    @Override // yji.l
    public final void I1() {
        this.A.b(new f4("AMOUNT_LIST_ID", true));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (this.z.f101563b instanceof AccountId.Joint) {
            n2(new b0(this, null), new whi.b(6));
        }
        yji.l.b1(this, vkm.q.Q(this.C, new dz6.n(continuation, this, 18)), null, new enb.f(this, continuation, 19), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.D;
    }
}
