package o45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222044b;

    public e2(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f222043a = key;
        this.f222044b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f222043a, e2Var.f222043a) && this.f222044b == e2Var.f222044b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f222044b) + (this.f222043a.hashCode() * 31);
    }
}
