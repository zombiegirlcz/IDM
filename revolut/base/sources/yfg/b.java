package yfg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lyfg/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "airlineName", "b", "c", "providerDescription", "iconUrl", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlineName")
    @NotNull
    private final String airlineName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("providerDescription")
    @NotNull
    private final String providerDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconUrl")
    @NotNull
    private final String iconUrl;

    public b(String airlineName, String providerDescription, String iconUrl) {
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(providerDescription, "providerDescription");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.airlineName = airlineName;
        this.providerDescription = providerDescription;
        this.iconUrl = iconUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAirlineName() {
        return this.airlineName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProviderDescription() {
        return this.providerDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.airlineName, bVar.airlineName) && Intrinsics.f(this.providerDescription, bVar.providerDescription) && Intrinsics.f(this.iconUrl, bVar.iconUrl);
    }

    public final int hashCode() {
        return this.iconUrl.hashCode() + p.a.c(this.airlineName.hashCode() * 31, 31, this.providerDescription);
    }
}
