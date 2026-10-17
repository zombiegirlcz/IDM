package bca;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14412a;

    public f(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f14412a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f14412a, ((f) obj2).f14412a);
    }

    public final int hashCode() {
        return this.f14412a.hashCode();
    }
}
