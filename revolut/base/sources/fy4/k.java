package fy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f138895a;

    public k(Object obj2) {
        this.f138895a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f138895a, ((k) obj2).f138895a);
    }

    public final int hashCode() {
        Object obj2 = this.f138895a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
