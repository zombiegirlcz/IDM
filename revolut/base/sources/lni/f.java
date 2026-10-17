package lni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197262b;

    public f(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f197261a = value;
        this.f197262b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f197261a, fVar.f197261a) && this.f197262b == fVar.f197262b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197262b) + (this.f197261a.hashCode() * 31);
    }
}
