package e93;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f123890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123891b;

    public r(String defaultGroupId, ArrayList groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(defaultGroupId, "defaultGroupId");
        this.f123890a = groups;
        this.f123891b = defaultGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f123890a.equals(rVar.f123890a) && Intrinsics.f(this.f123891b, rVar.f123891b);
    }

    public final int hashCode() {
        return this.f123891b.hashCode() + (this.f123890a.hashCode() * 31);
    }
}
