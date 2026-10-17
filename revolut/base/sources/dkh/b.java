package dkh;

import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedBuyingPowerConverted f115520a;

    public b(CombinedBuyingPowerConverted combinedBuyingPowerConverted) {
        Intrinsics.checkNotNullParameter(combinedBuyingPowerConverted, "combinedBuyingPowerConverted");
        this.f115520a = combinedBuyingPowerConverted;
    }

    @Override // dkh.c
    public final List a() {
        return this.f115520a.f95659b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115520a, ((b) obj2).f115520a);
    }

    public final int hashCode() {
        return this.f115520a.hashCode();
    }
}
