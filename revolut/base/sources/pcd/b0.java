package pcd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f234848b;

    public b0(String code, Set permissions) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f234847a = code;
        this.f234848b = permissions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f234847a, b0Var.f234847a) && Intrinsics.f(this.f234848b, b0Var.f234848b);
    }

    public final int hashCode() {
        return this.f234848b.hashCode() + (this.f234847a.hashCode() * 31);
    }
}
