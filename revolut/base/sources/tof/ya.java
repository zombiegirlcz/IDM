package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ya extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273184a;

    public ya(String str) {
        this.f273184a = str;
    }

    public final String a() {
        return this.f273184a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ya) && Intrinsics.f(this.f273184a, ((ya) obj2).f273184a);
    }

    public final int hashCode() {
        String str = this.f273184a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
