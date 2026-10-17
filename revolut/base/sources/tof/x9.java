package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273166a;

    public x9(String str) {
        this.f273166a = str;
    }

    public final String a() {
        return this.f273166a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x9) && Intrinsics.f(this.f273166a, ((x9) obj2).f273166a);
    }

    public final int hashCode() {
        String str = this.f273166a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
