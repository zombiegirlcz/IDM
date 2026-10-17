package jch;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172805a;

    public l(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f172805a = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f172805a, ((l) obj2).f172805a);
    }

    public final int hashCode() {
        return this.f172805a.hashCode();
    }
}
