package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300876a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof p) {
            return Intrinsics.f(this.f300876a, ((p) obj2).f300876a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f300876a.hashCode();
    }

    public final String toString() {
        return p.a.p("DocumentRequestId(value=", this.f300876a, ")");
    }
}
