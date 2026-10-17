package tpc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f273337a;

    public f(ArrayList portfoliosWithoutRecurringDeposit) {
        Intrinsics.checkNotNullParameter(portfoliosWithoutRecurringDeposit, "portfoliosWithoutRecurringDeposit");
        this.f273337a = portfoliosWithoutRecurringDeposit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f273337a.equals(((f) obj2).f273337a);
    }

    public final int hashCode() {
        return this.f273337a.hashCode();
    }
}
