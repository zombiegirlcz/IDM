package ncd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final com.revolut.feature.shared.savings.models.product.a Companion = new com.revolut.feature.shared.savings.models.product.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f214171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f214172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f214173c;
    public final dj0.d d;

    public c(dj0.d grossEstimation, dj0.d netEstimation, dj0.d serviceFeeEstimation, dj0.d withholdingTaxEstimation) {
        Intrinsics.checkNotNullParameter(grossEstimation, "grossEstimation");
        Intrinsics.checkNotNullParameter(netEstimation, "netEstimation");
        Intrinsics.checkNotNullParameter(serviceFeeEstimation, "serviceFeeEstimation");
        Intrinsics.checkNotNullParameter(withholdingTaxEstimation, "withholdingTaxEstimation");
        this.f214171a = grossEstimation;
        this.f214172b = netEstimation;
        this.f214173c = serviceFeeEstimation;
        this.d = withholdingTaxEstimation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f214171a, cVar.f214171a) && Intrinsics.f(this.f214172b, cVar.f214172b) && Intrinsics.f(this.f214173c, cVar.f214173c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f214171a.hashCode() * 31, 31, this.f214172b), 31, this.f214173c);
    }
}
