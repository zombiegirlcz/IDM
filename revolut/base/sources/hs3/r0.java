package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154938b;

    public r0(String deeplink, String str) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f154937a = deeplink;
        this.f154938b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f154937a, r0Var.f154937a) && Intrinsics.f(this.f154938b, r0Var.f154938b);
    }

    public final int hashCode() {
        int iHashCode = this.f154937a.hashCode() * 31;
        String str = this.f154938b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
