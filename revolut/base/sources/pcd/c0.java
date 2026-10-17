package pcd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f234852b;

    public c0(String phone, Set permissions) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f234851a = phone;
        this.f234852b = permissions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f234851a, c0Var.f234851a) && Intrinsics.f(this.f234852b, c0Var.f234852b);
    }

    public final int hashCode() {
        return this.f234852b.hashCode() + (this.f234851a.hashCode() * 31);
    }
}
