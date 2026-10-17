package t1j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267381a;

    public c(List balanceGroups) {
        Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
        this.f267381a = balanceGroups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f267381a, ((c) obj2).f267381a);
    }

    public final int hashCode() {
        return this.f267381a.hashCode();
    }
}
