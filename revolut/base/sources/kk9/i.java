package kk9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f184538a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof i) {
            return Intrinsics.f(this.f184538a, ((i) obj2).f184538a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f184538a.hashCode();
    }

    public final String toString() {
        return "InputAmountParcel(currency=" + this.f184538a + ")";
    }
}
