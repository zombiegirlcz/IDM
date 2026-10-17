package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167339c;

    public yn(Object obj2, boolean z, boolean z3) {
        this.f167337a = obj2;
        this.f167338b = z;
        this.f167339c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj2;
        return Intrinsics.f(this.f167337a, ynVar.f167337a) && this.f167338b == ynVar.f167338b && this.f167339c == ynVar.f167339c;
    }

    public final int hashCode() {
        Object obj2 = this.f167337a;
        return Boolean.hashCode(this.f167339c) + j6.a.c((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, this.f167338b);
    }
}
