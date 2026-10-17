package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143656a;

    public o(String str) {
        this.f143656a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f143656a, ((o) obj2).f143656a);
    }

    public final int hashCode() {
        String str = this.f143656a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
