package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272654a;

    public bb(String str) {
        this.f272654a = str;
    }

    public final String a() {
        return this.f272654a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bb) && Intrinsics.f(this.f272654a, ((bb) obj2).f272654a);
    }

    public final int hashCode() {
        String str = this.f272654a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
