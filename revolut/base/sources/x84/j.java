package x84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f303283a;

    public j(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f303283a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f303283a, ((j) obj2).f303283a);
    }

    public final int hashCode() {
        return this.f303283a.hashCode();
    }
}
