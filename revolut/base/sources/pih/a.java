package pih;

import com.revolut.feature.wealth.ui.api.navigation.cash_balance.CashBalanceInfoDialogInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashBalanceInfoDialogInputData f236510a;

    public a(CashBalanceInfoDialogInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f236510a = inputData;
    }

    public final CashBalanceInfoDialogInputData b() {
        return this.f236510a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f236510a, ((a) obj2).f236510a);
    }

    public final int hashCode() {
        return this.f236510a.hashCode();
    }
}
