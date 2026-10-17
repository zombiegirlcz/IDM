package nze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f221037a;

    public m(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f221037a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f221037a, ((m) obj2).f221037a);
    }

    public final int hashCode() {
        return this.f221037a.hashCode();
    }
}
