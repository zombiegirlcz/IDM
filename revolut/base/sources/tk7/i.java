package tk7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import ik7.j;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271911a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f271912b;

    public i(j expenseItemMapper) {
        Intrinsics.checkNotNullParameter(expenseItemMapper, "expenseItemMapper");
        this.f271912b = expenseItemMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        switch (this.f271911a) {
            case 0:
                d domainState = (d) iVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                ArrayList arrayListA = this.f271912b.a(domainState.f271907a, true);
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return new g(arrayListA);
            default:
                yj7.e domainState2 = (yj7.e) iVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                List listA = CFACInsuranceAddExpensesItemMapper.a();
                ArrayList arrayListA2 = this.f271912b.a(domainState2.f314428b, true);
                yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
                return new yj7.h(d0.E0(arrayListA2, listA));
        }
    }

    public i(j expenseItemMapper, CFACInsuranceAddExpensesItemMapper addExpensesItemMapper) {
        Intrinsics.checkNotNullParameter(expenseItemMapper, "expenseItemMapper");
        Intrinsics.checkNotNullParameter(addExpensesItemMapper, "addExpensesItemMapper");
        this.f271912b = expenseItemMapper;
    }
}
