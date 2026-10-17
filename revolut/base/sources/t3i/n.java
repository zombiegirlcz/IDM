package t3i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f267801a;

    public n(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f267801a = e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f267801a, ((n) obj2).f267801a);
    }

    public final int hashCode() {
        return this.f267801a.hashCode();
    }
}
