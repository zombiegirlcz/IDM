package o14;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lo14/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Map;", "getCurrentOfferParameters", "()Ljava/util/Map;", "currentOfferParameters", "b", "getUpdatedOfferParameters", "updatedOfferParameters", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("current")
    @NotNull
    private final Map<String, Object> currentOfferParameters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("updated")
    @NotNull
    private final Map<String, Object> updatedOfferParameters;

    public j(Map currentOfferParameters, Map updatedOfferParameters) {
        Intrinsics.checkNotNullParameter(currentOfferParameters, "currentOfferParameters");
        Intrinsics.checkNotNullParameter(updatedOfferParameters, "updatedOfferParameters");
        this.currentOfferParameters = currentOfferParameters;
        this.updatedOfferParameters = updatedOfferParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.currentOfferParameters, jVar.currentOfferParameters) && Intrinsics.f(this.updatedOfferParameters, jVar.updatedOfferParameters);
    }

    public final int hashCode() {
        return this.updatedOfferParameters.hashCode() + (this.currentOfferParameters.hashCode() * 31);
    }
}
