package ype;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f315852a;

    public f(i action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f315852a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f315852a == ((f) obj2).f315852a;
    }

    public final int hashCode() {
        return this.f315852a.hashCode();
    }
}
