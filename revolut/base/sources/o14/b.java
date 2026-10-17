package o14;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0012"}, d2 = {"Lo14/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "offerParameters", "Lt14/h;", "b", "Lt14/h;", "()Lt14/h;", "initialScreen", "Lo14/d;", "additionalScreens", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerParameters")
    @NotNull
    private final Map<String, Object> offerParameters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialScreen")
    @NotNull
    private final t14.h initialScreen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalScreens")
    private final Map<String, d> additionalScreens;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getAdditionalScreens() {
        return this.additionalScreens;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t14.h getInitialScreen() {
        return this.initialScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getOfferParameters() {
        return this.offerParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.offerParameters, bVar.offerParameters) && Intrinsics.f(this.initialScreen, bVar.initialScreen) && Intrinsics.f(this.additionalScreens, bVar.additionalScreens);
    }

    public final int hashCode() {
        int iHashCode = (this.initialScreen.hashCode() + (this.offerParameters.hashCode() * 31)) * 31;
        Map<String, d> map = this.additionalScreens;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
