package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class wb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f273150a;

    public wb(n2 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f273150a = type;
    }

    public final n2 a() {
        return this.f273150a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wb) && this.f273150a == ((wb) obj2).f273150a;
    }

    public final int hashCode() {
        return this.f273150a.hashCode();
    }
}
