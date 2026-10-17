package tzf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0014"}, d2 = {"Ltzf/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "time", "", "b", "Z", "d", "()Z", "isAvailable", "Lzzf/b;", "Lzzf/b;", "()Lzzf/b;", "pricing", "pricingInRequestedCurrency", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("time")
    @NotNull
    private final String time;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isAvailable")
    private final boolean isAvailable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricing")
    private final zzf.b pricing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pricingInRequestedCurrency")
    private final zzf.b pricingInRequestedCurrency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zzf.b getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final zzf.b getPricingInRequestedCurrency() {
        return this.pricingInRequestedCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.time, aVar.time) && this.isAvailable == aVar.isAvailable && Intrinsics.f(this.pricing, aVar.pricing) && Intrinsics.f(this.pricingInRequestedCurrency, aVar.pricingInRequestedCurrency);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.time.hashCode() * 31, 31, this.isAvailable);
        zzf.b bVar = this.pricing;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        zzf.b bVar2 = this.pricingInRequestedCurrency;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
