package iyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169797a;

    public e(String str) {
        this.f169797a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f169797a, ((e) obj2).f169797a);
    }

    public final int hashCode() {
        String str = this.f169797a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
