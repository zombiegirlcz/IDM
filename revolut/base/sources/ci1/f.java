package ci1;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24344a;

    public f(String fieldValue) {
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        this.f24344a = fieldValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f24344a, ((f) obj2).f24344a);
    }

    public final int hashCode() {
        return this.f24344a.hashCode();
    }
}
