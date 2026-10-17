package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ld6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f204495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f204496b;

    public q(p type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f204495a = type;
        this.f204496b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f204495a == qVar.f204495a && this.f204496b == qVar.f204496b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204496b) + (this.f204495a.hashCode() * 31);
    }
}
