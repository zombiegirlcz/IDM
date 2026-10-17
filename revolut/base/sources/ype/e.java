package ype;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315851a;

    public e(String tin) {
        Intrinsics.checkNotNullParameter(tin, "tin");
        this.f315851a = tin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f315851a, ((e) obj2).f315851a);
    }

    public final int hashCode() {
        return this.f315851a.hashCode();
    }
}
