package k50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f181164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f181165b;

    public l1(int i, UUID uuid) {
        this.f181164a = i;
        this.f181165b = uuid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return this.f181164a == l1Var.f181164a && Intrinsics.f(this.f181165b, l1Var.f181165b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f181164a) * 31;
        UUID uuid = this.f181165b;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }
}
