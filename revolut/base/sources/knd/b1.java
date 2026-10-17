package knd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f186057a;

    public b1(m1 keyedData) {
        Intrinsics.checkNotNullParameter(keyedData, "keyedData");
        this.f186057a = keyedData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && Intrinsics.f(this.f186057a, ((b1) obj2).f186057a);
    }

    public final int hashCode() {
        return this.f186057a.hashCode();
    }
}
