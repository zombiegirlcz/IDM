package m9d;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes7.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv0.i f203723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f203724b;

    public l1(qv0.i listItem, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f203723a = listItem;
        this.f203724b = updatedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f203723a, l1Var.f203723a) && Intrinsics.f(this.f203724b, l1Var.f203724b);
    }

    public final int hashCode() {
        return this.f203724b.hashCode() + (this.f203723a.hashCode() * 31);
    }
}
