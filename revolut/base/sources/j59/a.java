package j59;

import e8l.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lj59/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "rate", "Le8l/l;", "Le8l/l;", "()Le8l/l;", "orderLimits", "feature_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("rate")
    private final double rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("orderLimits")
    @NotNull
    private final l orderLimits;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getOrderLimits() {
        return this.orderLimits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.rate, aVar.rate) == 0 && Intrinsics.f(this.orderLimits, aVar.orderLimits);
    }

    public final int hashCode() {
        return this.orderLimits.hashCode() + (Double.hashCode(this.rate) * 31);
    }
}
