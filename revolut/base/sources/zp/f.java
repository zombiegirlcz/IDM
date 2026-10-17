package zp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324094a;

    public f(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f324094a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f324094a, ((f) obj2).f324094a);
    }

    public final int hashCode() {
        return this.f324094a.hashCode();
    }
}
