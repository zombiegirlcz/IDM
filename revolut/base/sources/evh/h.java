package evh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Levh/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "backNavigation", "b", "skippable", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("backNavigation")
    private final Boolean backNavigation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("skippable")
    private final Boolean skippable;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getBackNavigation() {
        return this.backNavigation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getSkippable() {
        return this.skippable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.backNavigation, hVar.backNavigation) && Intrinsics.f(this.skippable, hVar.skippable);
    }

    public final int hashCode() {
        Boolean bool = this.backNavigation;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.skippable;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
