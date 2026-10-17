package zq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f324350a;

    public e(d reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f324350a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f324350a, ((e) obj2).f324350a);
    }

    public final int hashCode() {
        return this.f324350a.hashCode();
    }
}
