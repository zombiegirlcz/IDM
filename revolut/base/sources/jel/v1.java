package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173578b;

    public v1(String value, String origin) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f173577a = value;
        this.f173578b = origin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f173577a, v1Var.f173577a) && Intrinsics.f(this.f173578b, v1Var.f173578b);
    }

    public final int hashCode() {
        return this.f173578b.hashCode() + (this.f173577a.hashCode() * 31);
    }
}
