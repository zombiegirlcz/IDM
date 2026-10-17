package vxb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292934b;

    public d0(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f292933a = key;
        this.f292934b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f292933a, d0Var.f292933a) && this.f292934b == d0Var.f292934b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f292934b) + (this.f292933a.hashCode() * 31);
    }
}
