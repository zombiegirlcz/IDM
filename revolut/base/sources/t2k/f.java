package t2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f267590a;

    public f(Object obj2) {
        this.f267590a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f267590a, ((f) obj2).f267590a);
    }

    public final int hashCode() {
        Object obj2 = this.f267590a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
