package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x3 extends w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273158a;

    public x3(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f273158a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x3) && Intrinsics.f(this.f273158a, ((x3) obj2).f273158a);
    }

    public final int hashCode() {
        return this.f273158a.hashCode();
    }
}
