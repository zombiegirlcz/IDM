package auc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lauc/k;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "getDevicesIds", "()Ljava/util/List;", "devicesIds", "b", "getCardsIds", "cardsIds", "c", "getSimProfileIds", "simProfileIds", "d", "getExcludedDevicesIds", "excludedDevicesIds", "e", "getExcludedCardsIds", "excludedCardsIds", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("devicesIds")
    @NotNull
    private final List<String> devicesIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardsIds")
    @NotNull
    private final List<String> cardsIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("simProfileIds")
    @NotNull
    private final List<String> simProfileIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("excludedDevicesIds")
    @NotNull
    private final List<String> excludedDevicesIds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("excludedCardsIds")
    @NotNull
    private final List<String> excludedCardsIds;

    public k(ArrayList devicesIds, ArrayList cardsIds, ArrayList simProfileIds, ArrayList excludedDevicesIds, ArrayList excludedCardsIds) {
        Intrinsics.checkNotNullParameter(devicesIds, "devicesIds");
        Intrinsics.checkNotNullParameter(cardsIds, "cardsIds");
        Intrinsics.checkNotNullParameter(simProfileIds, "simProfileIds");
        Intrinsics.checkNotNullParameter(excludedDevicesIds, "excludedDevicesIds");
        Intrinsics.checkNotNullParameter(excludedCardsIds, "excludedCardsIds");
        this.devicesIds = devicesIds;
        this.cardsIds = cardsIds;
        this.simProfileIds = simProfileIds;
        this.excludedDevicesIds = excludedDevicesIds;
        this.excludedCardsIds = excludedCardsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.devicesIds, kVar.devicesIds) && Intrinsics.f(this.cardsIds, kVar.cardsIds) && Intrinsics.f(this.simProfileIds, kVar.simProfileIds) && Intrinsics.f(this.excludedDevicesIds, kVar.excludedDevicesIds) && Intrinsics.f(this.excludedCardsIds, kVar.excludedCardsIds);
    }

    public final int hashCode() {
        return this.excludedCardsIds.hashCode() + p.a.d(p.a.d(p.a.d(this.devicesIds.hashCode() * 31, 31, this.cardsIds), 31, this.simProfileIds), 31, this.excludedDevicesIds);
    }
}
