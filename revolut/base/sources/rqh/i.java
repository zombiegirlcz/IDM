package rqh;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256544a;

    public i(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f256544a = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f256544a, ((i) obj2).f256544a);
    }

    public final int hashCode() {
        return this.f256544a.hashCode();
    }
}
