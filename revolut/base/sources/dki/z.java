package dki;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.r f115566a;

    public z(aii.r data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f115566a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f115566a, ((z) obj2).f115566a);
    }

    public final int hashCode() {
        return this.f115566a.hashCode();
    }
}
