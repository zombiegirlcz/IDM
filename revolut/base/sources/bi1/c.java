package bi1;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15371a;

    public c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15371a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f15371a, ((c) obj2).f15371a);
    }

    public final int hashCode() {
        return this.f15371a.hashCode();
    }
}
