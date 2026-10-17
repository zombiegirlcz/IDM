package sd3;

import com.revolut.data.model.Data;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreenContract$InputData;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sd3.h;
import skm.a2;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f261819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nd3.d f261820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f261821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f261822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f261823t;
    public final f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, CashbackTransactionsScreenContract$InputData inputData, whf.b transactionsContentProvider, nd3.d cashbackTransactionsFilterProvider, o transactionsFiltersBottomDialogProvider, j60.a bottomExpandableDialogControllerExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(transactionsFiltersBottomDialogProvider, "transactionsFiltersBottomDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f261819p = transactionsContentProvider;
        this.f261820q = cashbackTransactionsFilterProvider;
        this.f261821r = transactionsFiltersBottomDialogProvider;
        this.f261822s = bottomExpandableDialogControllerExtension;
        ArrayList arrayListA = inputData.f65726a.a();
        ArrayList arrayList = new ArrayList(w.t(arrayListA, 10));
        Iterator it8 = arrayListA.iterator();
        while (it8.hasNext()) {
            arrayList.add(((CashbackSource) it8.next()).f65689b);
        }
        this.u = new f(new Data(null, null, true, 3, null), arrayList, h.a.f261814a);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2() {
        r rVarB;
        h hVar = ((f) t2()).f261813c;
        boolean zF = Intrinsics.f(hVar, h.a.f261814a);
        nd3.d dVar = this.f261820q;
        if (zF) {
            rVarB = dVar.a(((f) t2()).f261812b);
        } else {
            if (!(hVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarB = dVar.b(((i) hVar).f261815a);
        }
        r rVar = rVarB;
        a2 a2Var = this.f261823t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f261823t = yji.l.b1(this, rd0.e.b(whf.b.a(this.f261819p, rVar, null, null, null, 14)), null, new s56.i(this, continuation, 26), 3);
    }
}
