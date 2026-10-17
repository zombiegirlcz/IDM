package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ia extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272834a;

    public ia(String str) {
        this.f272834a = str;
    }

    public final String a() {
        return this.f272834a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ia) && Intrinsics.f(this.f272834a, ((ia) obj2).f272834a);
    }

    public final int hashCode() {
        String str = this.f272834a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
