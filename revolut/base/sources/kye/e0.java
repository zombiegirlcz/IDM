package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aue.k f190730a;

    public e0(aue.k limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f190730a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f190730a, ((e0) obj2).f190730a);
    }

    public final int hashCode() {
        return this.f190730a.hashCode();
    }
}
