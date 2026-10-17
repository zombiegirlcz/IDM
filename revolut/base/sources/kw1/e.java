package kw1;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190202a;

    public e() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f190202a, ((e) obj2).f190202a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f190202a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public e(dj0.d dVar) {
        this.f190202a = dVar;
    }
}
