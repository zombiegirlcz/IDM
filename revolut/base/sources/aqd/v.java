package aqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f8410b;

    public v(dj0.d maxValue, dj0.d actualValue) {
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        Intrinsics.checkNotNullParameter(actualValue, "actualValue");
        this.f8409a = maxValue;
        this.f8410b = actualValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f8409a, vVar.f8409a) && Intrinsics.f(this.f8410b, vVar.f8410b);
    }

    public final int hashCode() {
        return this.f8410b.hashCode() + (this.f8409a.hashCode() * 31);
    }
}
