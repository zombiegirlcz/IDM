package m8d;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f203519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203520b;

    public q(UUID callRequestId, String str) {
        Intrinsics.checkNotNullParameter(callRequestId, "callRequestId");
        this.f203519a = callRequestId;
        this.f203520b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f203519a, qVar.f203519a) && Intrinsics.f(this.f203520b, qVar.f203520b);
    }

    public final int hashCode() {
        int iHashCode = this.f203519a.hashCode() * 31;
        String str = this.f203520b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
