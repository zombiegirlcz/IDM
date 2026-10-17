package eql;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f128503a;

    public f(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f128503a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f128503a, ((f) obj2).f128503a);
    }

    public final int hashCode() {
        return this.f128503a.hashCode();
    }
}
