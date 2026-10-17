package j6k;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f171811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171812b;

    public j(String str, Set userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.f171811a = userIds;
        this.f171812b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f171811a, jVar.f171811a) && Intrinsics.f(this.f171812b, jVar.f171812b);
    }

    public final int hashCode() {
        int iHashCode = this.f171811a.hashCode() * 31;
        String str = this.f171812b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
