package o9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223195a;

    public g0(String str) {
        this.f223195a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f223195a, ((g0) obj2).f223195a);
    }

    public final int hashCode() {
        String str = this.f223195a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
