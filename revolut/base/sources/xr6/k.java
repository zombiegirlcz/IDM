package xr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308264a;

    public k(String fullName) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f308264a = fullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f308264a, ((k) obj2).f308264a);
    }

    public final int hashCode() {
        return this.f308264a.hashCode();
    }
}
