package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272863a;

    public j7(String str) {
        this.f272863a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j7) && Intrinsics.f(this.f272863a, ((j7) obj2).f272863a);
    }

    public final String getId() {
        return this.f272863a;
    }

    public final int hashCode() {
        String str = this.f272863a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
