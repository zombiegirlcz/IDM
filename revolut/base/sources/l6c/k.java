package l6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f192400a;

    public k(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f192400a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f192400a, ((k) obj2).f192400a);
    }

    public final int hashCode() {
        return this.f192400a.hashCode();
    }
}
