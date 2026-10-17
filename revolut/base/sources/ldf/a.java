package ldf;

import aii.e;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderDetailsContract$InputData f194096a;

    public a(InvestOrderDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f194096a = inputData;
    }

    public final InvestOrderDetailsContract$InputData b() {
        return this.f194096a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f194096a, ((a) obj2).f194096a);
    }

    public final int hashCode() {
        return this.f194096a.f91741a.hashCode();
    }
}
