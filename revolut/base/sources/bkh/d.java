package bkh;

import cli.j;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.CashBalanceInfoDialogInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashBalanceInfoDialogInputData f16413a;

    public d(CashBalanceInfoDialogInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f16413a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f16413a, ((d) obj2).f16413a);
    }

    public final int hashCode() {
        return this.f16413a.hashCode();
    }
}
