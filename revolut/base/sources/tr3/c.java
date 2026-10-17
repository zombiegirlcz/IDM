package tr3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Ltr3/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "status", "", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "secondaryEntryPointsVisibleByDefault", "", "Ljava/util/Map;", "()Ljava/util/Map;", "secondaryEntryPointsVisibleOverrides", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryEntryPointsVisibleByDefault")
    private final Boolean secondaryEntryPointsVisibleByDefault;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryEntryPointsVisibleOverrides")
    private final Map<String, Boolean> secondaryEntryPointsVisibleOverrides;

    public c(String status, Boolean bool, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.secondaryEntryPointsVisibleByDefault = bool;
        this.secondaryEntryPointsVisibleOverrides = linkedHashMap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getSecondaryEntryPointsVisibleByDefault() {
        return this.secondaryEntryPointsVisibleByDefault;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getSecondaryEntryPointsVisibleOverrides() {
        return this.secondaryEntryPointsVisibleOverrides;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.status, cVar.status) && Intrinsics.f(this.secondaryEntryPointsVisibleByDefault, cVar.secondaryEntryPointsVisibleByDefault) && Intrinsics.f(this.secondaryEntryPointsVisibleOverrides, cVar.secondaryEntryPointsVisibleOverrides);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Boolean bool = this.secondaryEntryPointsVisibleByDefault;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Boolean> map = this.secondaryEntryPointsVisibleOverrides;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
