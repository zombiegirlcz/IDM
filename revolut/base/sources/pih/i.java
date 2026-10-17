package pih;

import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnsettledDialogInputData f236522a;

    public i(UnsettledDialogInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f236522a = inputData;
    }

    public final UnsettledDialogInputData b() {
        return this.f236522a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f236522a, ((i) obj2).f236522a);
    }

    public final int hashCode() {
        return this.f236522a.hashCode();
    }
}
