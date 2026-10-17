package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ye implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167307c;
    public final boolean d;
    public final boolean e;

    public ye(Object obj2, boolean z, boolean z3, boolean z4, boolean z6) {
        this.f167305a = obj2;
        this.f167306b = z;
        this.f167307c = z3;
        this.d = z4;
        this.e = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj2;
        return Intrinsics.f(this.f167305a, yeVar.f167305a) && this.f167306b == yeVar.f167306b && this.f167307c == yeVar.f167307c && this.d == yeVar.d && this.e == yeVar.e;
    }

    public final int hashCode() {
        Object obj2 = this.f167305a;
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, this.f167306b), 31, this.f167307c), 31, this.d);
    }
}
