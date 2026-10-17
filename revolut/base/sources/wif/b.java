package wif;

import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q6 f297891b;

    public b(String groupId, q6 q6Var) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f297890a = groupId;
        this.f297891b = q6Var;
    }

    public final String a() {
        return this.f297890a;
    }

    public final String b() {
        return this.f297890a;
    }

    public final q6 c() {
        return this.f297891b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f297890a, bVar.f297890a) && Intrinsics.f(this.f297891b, bVar.f297891b);
    }

    public final int hashCode() {
        int iHashCode = this.f297890a.hashCode() * 31;
        q6 q6Var = this.f297891b;
        return iHashCode + (q6Var == null ? 0 : q6Var.hashCode());
    }
}
