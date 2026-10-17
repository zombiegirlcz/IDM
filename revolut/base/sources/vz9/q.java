package vz9;

import com.revolut.feature.payments.money_request.api.model.MoneyRequestAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q {
    public static final MoneyRequestAction a(cu9.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = p.f293436a[cVar.ordinal()];
        if (i == 1) {
            return MoneyRequestAction.Reject.f79594b;
        }
        if (i == 2) {
            return MoneyRequestAction.Approve.f79592b;
        }
        if (i == 3) {
            return MoneyRequestAction.Remind.f79595b;
        }
        if (i == 4) {
            return MoneyRequestAction.Cancel.f79593b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
