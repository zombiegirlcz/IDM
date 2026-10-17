package aqh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8441a;

    public j(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f8441a = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f8441a, ((j) obj2).f8441a);
    }

    public final int hashCode() {
        return this.f8441a.hashCode();
    }
}
