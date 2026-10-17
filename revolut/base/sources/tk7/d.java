package tk7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271907a;

    public d(List claimExpenses) {
        Intrinsics.checkNotNullParameter(claimExpenses, "claimExpenses");
        this.f271907a = claimExpenses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271907a, ((d) obj2).f271907a);
    }

    public final int hashCode() {
        return this.f271907a.hashCode();
    }
}
