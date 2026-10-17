package fh0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f135121a;

    public e(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f135121a = throwable;
    }

    public final Throwable a() {
        return this.f135121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f135121a, ((e) obj2).f135121a);
    }

    public final int hashCode() {
        return this.f135121a.hashCode();
    }
}
