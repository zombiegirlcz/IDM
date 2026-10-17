package zd3;

import aii.r;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YourCashbackFlowContract$Step.Product f321302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321303b;

    public d(YourCashbackFlowContract$Step.Product nextStep, String cashbackBoxId) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(cashbackBoxId, "cashbackBoxId");
        this.f321302a = nextStep;
        this.f321303b = cashbackBoxId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f321302a.equals(dVar.f321302a) && Intrinsics.f(this.f321303b, dVar.f321303b);
    }

    public final int hashCode() {
        return this.f321303b.hashCode() + (this.f321302a.hashCode() * 31);
    }
}
