package jx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179045a;

    public e(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f179045a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f179045a, ((e) obj2).f179045a);
    }

    public final int hashCode() {
        return this.f179045a.hashCode();
    }
}
