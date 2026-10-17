package kof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f186338a;

    public b(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f186338a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f186338a == ((b) obj2).f186338a;
    }

    public final int hashCode() {
        return this.f186338a.hashCode();
    }
}
