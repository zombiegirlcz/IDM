package gk7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACClaimTransactions;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreenContract$InputData;
import efm.r;
import ffk.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.cc;
import tof.fc;
import tof.i7;
import tof.n7;
import tof.o7;
import tof.qb;
import tof.u8;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACInsuranceSelectExpensesScreenContract$InputData f144342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f144343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final whf.n f144344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final thf.m f144345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mj7.b f144346t;
    public final t u;
    public final f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, CFACInsuranceSelectExpensesScreenContract$InputData inputData, whf.b transactionsContentProvider, whf.n transactionsListMapper, thf.m transactionTextResourcesMapper, mj7.b claimCacheRepository, t pricingPlanInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(claimCacheRepository, "claimCacheRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f144342p = inputData;
        this.f144343q = transactionsContentProvider;
        this.f144344r = transactionsListMapper;
        this.f144345s = transactionTextResourcesMapper;
        this.f144346t = claimCacheRepository;
        this.u = pricingPlanInteractor;
        this.v = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), "", claimCacheRepository.b());
    }

    @Override // yji.l
    public final void T1(long j2) {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y2() {
        i7 n7Var;
        vkm.d dVarB = rd0.e.b(this.u.q());
        CFACClaimTransactions cFACClaimTransactions = this.f144342p.f75109a;
        ArrayList arrayList = cFACClaimTransactions.f74977b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            int i = 0;
            int i2 = 2;
            i7 i7VarB = null;
            Object[] objArr = 0;
            if (!it8.hasNext()) {
                i7.c cVar = i7.Companion;
                u8 u8Var = new u8(new DateTime(cFACClaimTransactions.f74976a));
                i7[] i7VarArr = (i7[]) arrayList2.toArray(new i7[0]);
                i7[] i7VarArr2 = (i7[]) Arrays.copyOf(i7VarArr, i7VarArr.length);
                cVar.getClass();
                r rVarJust = r.just(i7.c.a(u8Var, i7.c.b(i7VarArr2)));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                yji.l.b1(this, yh5.b.d(dVarB, rd0.e.b(nim.a.w(whf.b.a(this.f144343q, rVarJust, new gjg.e(this, 5), null, null, 12), new k(this, i)))), null, new gii.b(this, objArr == true ? 1 : 0, i2), 3);
                return;
            }
            CFACClaimTransactions.EligibleTransaction eligibleTransaction = (CFACClaimTransactions.EligibleTransaction) it8.next();
            i7.c cVar2 = i7.Companion;
            cc ccVar = new cc(u.c(eligibleTransaction.f74978a));
            qb qbVar = new qb(u.c(eligibleTransaction.f74979b));
            Boolean bool = eligibleTransaction.d;
            boolean zF = Intrinsics.f(bool, Boolean.TRUE);
            i7.s sVar = i7.s.f272825a;
            if (zF) {
                i7VarB = sVar;
            } else if (Intrinsics.f(bool, Boolean.FALSE)) {
                i7VarB = fc.b(sVar);
            }
            int i3 = l.f144341a[eligibleTransaction.f74980c.ordinal()];
            if (i3 == 1) {
                n7Var = new n7();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n7Var = new o7();
            }
            cVar2.getClass();
            arrayList2.add(i7.c.a(ccVar, qbVar, i7VarB, n7Var));
        }
    }
}
