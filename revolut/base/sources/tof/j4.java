package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272847b;

    public j4(String groupId, String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f272846a = groupId;
        this.f272847b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj2;
        return Intrinsics.f(this.f272846a, j4Var.f272846a) && Intrinsics.f(this.f272847b, j4Var.f272847b);
    }

    public final int hashCode() {
        int iHashCode = this.f272846a.hashCode() * 31;
        String str = this.f272847b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
