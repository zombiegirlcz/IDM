package yfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313330a;

    public z0(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f313330a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z0) && Intrinsics.f(this.f313330a, ((z0) obj2).f313330a);
    }

    public final int hashCode() {
        return this.f313330a.hashCode();
    }
}
