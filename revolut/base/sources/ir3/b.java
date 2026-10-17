package ir3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lir3/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "secondaryEntryPointsVisibleByDefault", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "secondaryEntryPointsVisibleOverrides", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryEntryPointsVisibleByDefault")
    private final Boolean secondaryEntryPointsVisibleByDefault = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryEntryPointsVisibleOverrides")
    private final Map<String, Boolean> secondaryEntryPointsVisibleOverrides = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getSecondaryEntryPointsVisibleByDefault() {
        return this.secondaryEntryPointsVisibleByDefault;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getSecondaryEntryPointsVisibleOverrides() {
        return this.secondaryEntryPointsVisibleOverrides;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.secondaryEntryPointsVisibleByDefault, bVar.secondaryEntryPointsVisibleByDefault) && Intrinsics.f(this.secondaryEntryPointsVisibleOverrides, bVar.secondaryEntryPointsVisibleOverrides);
    }

    public final int hashCode() {
        Boolean bool = this.secondaryEntryPointsVisibleByDefault;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Map<String, Boolean> map = this.secondaryEntryPointsVisibleOverrides;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
