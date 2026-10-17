package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wh0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167032c;

    public wh0(Object obj2, boolean z, boolean z3) {
        this.f167030a = obj2;
        this.f167031b = z;
        this.f167032c = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167032c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj2;
        return Intrinsics.f(this.f167030a, wh0Var.f167030a) && this.f167031b == wh0Var.f167031b && this.f167032c == wh0Var.f167032c;
    }

    public final int hashCode() {
        Object obj2 = this.f167030a;
        return Boolean.hashCode(this.f167032c) + j6.a.c((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, this.f167031b);
    }
}
