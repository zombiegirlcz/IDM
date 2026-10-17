package com.revolut.feature.freelancer.impl.network.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/f;", "", "", "toString", "()Ljava/lang/String;", "", "", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "rates", "Ljava/lang/Double;", "()Ljava/lang/Double;", "customRate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("plans")
    @NotNull
    private final Map<String, Double> rates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("custom")
    private final Double customRate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getCustomRate() {
        return this.customRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getRates() {
        return this.rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.rates, fVar.rates) && Intrinsics.f(this.customRate, fVar.customRate);
    }

    public final int hashCode() {
        int iHashCode = this.rates.hashCode() * 31;
        Double d = this.customRate;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
