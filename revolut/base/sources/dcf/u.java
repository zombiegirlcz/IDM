package dcf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbf.l f112966a;

    public u(lbf.l reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f112966a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f112966a == ((u) obj2).f112966a;
    }

    public final int hashCode() {
        return this.f112966a.hashCode();
    }
}
