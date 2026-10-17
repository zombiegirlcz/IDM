package nr7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218595b;

    public f(List planIds, String str) {
        Intrinsics.checkNotNullParameter(planIds, "planIds");
        this.f218594a = planIds;
        this.f218595b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f218594a, fVar.f218594a) && Intrinsics.f(this.f218595b, fVar.f218595b);
    }

    public final int hashCode() {
        int iHashCode = this.f218594a.hashCode() * 31;
        String str = this.f218595b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
