package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272754a;

    public f8(String str) {
        this.f272754a = str;
    }

    public final String a() {
        return this.f272754a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f8) && Intrinsics.f(this.f272754a, ((f8) obj2).f272754a);
    }

    public final int hashCode() {
        String str = this.f272754a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
