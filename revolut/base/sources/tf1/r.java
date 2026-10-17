package tf1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.e f270198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f270199b;

    public r(qf1.e categoryGroupId, List categoryItemIds) {
        Intrinsics.checkNotNullParameter(categoryGroupId, "categoryGroupId");
        Intrinsics.checkNotNullParameter(categoryItemIds, "categoryItemIds");
        this.f270198a = categoryGroupId;
        this.f270199b = categoryItemIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f270198a == rVar.f270198a && Intrinsics.f(this.f270199b, rVar.f270199b);
    }

    public final int hashCode() {
        return this.f270199b.hashCode() + (this.f270198a.hashCode() * 31);
    }
}
