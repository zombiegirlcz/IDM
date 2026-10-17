package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ec extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272741a;

    public ec(String str) {
        this.f272741a = str;
    }

    public final String a() {
        return this.f272741a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ec) && Intrinsics.f(this.f272741a, ((ec) obj2).f272741a);
    }

    public final int hashCode() {
        String str = this.f272741a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
