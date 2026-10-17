package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273206a;

    public z9(String str) {
        this.f273206a = str;
    }

    public final String a() {
        return this.f273206a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z9) && Intrinsics.f(this.f273206a, ((z9) obj2).f273206a);
    }

    public final int hashCode() {
        String str = this.f273206a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
