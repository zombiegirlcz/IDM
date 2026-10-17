package xob;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307769a;

    public g(String str) {
        this.f307769a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f307769a, ((g) obj2).f307769a);
    }

    public final int hashCode() {
        String str = this.f307769a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
