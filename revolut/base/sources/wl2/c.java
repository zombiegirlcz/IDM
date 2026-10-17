package wl2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f298367a;

    public c(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f298367a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f298367a, ((c) obj2).f298367a);
    }

    public final int hashCode() {
        return this.f298367a.hashCode();
    }
}
