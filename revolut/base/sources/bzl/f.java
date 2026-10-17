package bzl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20062b;

    public f(String value, int i) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20061a = value;
        this.f20062b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f20061a, fVar.f20061a) && this.f20062b == fVar.f20062b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20062b) + (this.f20061a.hashCode() * 31);
    }
}
