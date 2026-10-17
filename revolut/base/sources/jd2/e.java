package jd2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172948a;

    public e(String str) {
        this.f172948a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f172948a, ((e) obj2).f172948a);
    }

    public final int hashCode() {
        String str = this.f172948a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
