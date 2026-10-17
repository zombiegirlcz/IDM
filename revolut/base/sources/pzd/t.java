package pzd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240978a;

    public t(String str) {
        this.f240978a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f240978a, ((t) obj2).f240978a);
    }

    public final int hashCode() {
        String str = this.f240978a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
