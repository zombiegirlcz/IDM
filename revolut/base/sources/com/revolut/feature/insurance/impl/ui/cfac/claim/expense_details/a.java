package com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details;

import aii.r;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wj7.k;
import wj7.l;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.a$a, reason: collision with other inner class name */
    public static final class C0499a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0499a f75081a = new C0499a();

        private C0499a() {
        }
    }

    private a() {
    }

    public final List f(List expenses, CFACClaimExpense cFACClaimExpense) {
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        ArrayList arrayListF1 = d0.f1(expenses);
        if (this instanceof k) {
            if (cFACClaimExpense != null) {
                arrayListF1.remove(cFACClaimExpense);
            }
            arrayListF1.add(((k) this).f297986a);
        } else {
            if (!equals(C0499a.f75081a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cFACClaimExpense != null) {
                arrayListF1.remove(cFACClaimExpense);
            }
        }
        return d0.P0(arrayListF1, new l());
    }
}
