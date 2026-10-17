package qih;

import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashHoldingSelectorInputData f246718a;

    public e(CashHoldingSelectorInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f246718a = inputData;
    }

    public final CashHoldingSelectorInputData b() {
        return this.f246718a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f246718a, ((e) obj2).f246718a);
    }

    public final int hashCode() {
        return this.f246718a.hashCode();
    }
}
