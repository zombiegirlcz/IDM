package kc9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f182672a;

    public e(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f182672a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f182672a, ((e) obj2).f182672a);
    }

    public final int hashCode() {
        return this.f182672a.hashCode();
    }
}
