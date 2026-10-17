package cag;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ofi.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcag/h;", "", "", "toString", "()Ljava/lang/String;", "Lcag/j;", "a", "Lcag/j;", "b", "()Lcag/j;", "occupancy", "", "Lofi/c;", "Ljava/util/List;", "()Ljava/util/List;", "bedOptions", "Lofi/n;", "c", "Lofi/n;", "()Lofi/n;", "pricing", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupancy")
    @NotNull
    private final j occupancy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bedOptions")
    @NotNull
    private final List<ofi.c> bedOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final n pricing;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBedOptions() {
        return this.bedOptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getOccupancy() {
        return this.occupancy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getPricing() {
        return this.pricing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.occupancy, hVar.occupancy) && Intrinsics.f(this.bedOptions, hVar.bedOptions) && Intrinsics.f(this.pricing, hVar.pricing);
    }

    public final int hashCode() {
        return this.pricing.hashCode() + p.a.d(this.occupancy.hashCode() * 31, 31, this.bedOptions);
    }
}
