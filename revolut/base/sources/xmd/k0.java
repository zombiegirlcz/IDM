package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f307181a;

    public k0(b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307181a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f307181a, ((k0) obj2).f307181a);
    }

    public final int hashCode() {
        return this.f307181a.hashCode();
    }
}
