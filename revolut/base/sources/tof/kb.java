package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class kb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272894a;

    public kb(String str) {
        this.f272894a = str;
    }

    public final String a() {
        return this.f272894a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof kb) && Intrinsics.f(this.f272894a, ((kb) obj2).f272894a);
    }

    public final int hashCode() {
        String str = this.f272894a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
