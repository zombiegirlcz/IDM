package cte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108661a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return Intrinsics.f(this.f108661a, ((b) obj2).f108661a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f108661a.hashCode();
    }

    public final String toString() {
        return p.a.p("AppTipsHostScreenId(id=", this.f108661a, ")");
    }
}
