package zfd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f321940a;

    public o(Set items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f321940a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f321940a, ((o) obj2).f321940a);
    }

    public final int hashCode() {
        return this.f321940a.hashCode();
    }
}
