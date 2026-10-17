package zfd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321936a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f321936a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f321936a, ((l) obj2).f321936a);
    }

    public final int hashCode() {
        return this.f321936a.hashCode();
    }
}
