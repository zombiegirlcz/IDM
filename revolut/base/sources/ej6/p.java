package ej6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126750a;

    public p(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f126750a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f126750a, ((p) obj2).f126750a);
    }

    public final int hashCode() {
        return this.f126750a.hashCode();
    }
}
