package lfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f194864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hfg.j0 f194865b;

    public b0(boolean z, hfg.j0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f194864a = z;
        this.f194865b = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f194864a == b0Var.f194864a && Intrinsics.f(this.f194865b, b0Var.f194865b);
    }

    public final int hashCode() {
        return this.f194865b.hashCode() + (Boolean.hashCode(this.f194864a) * 31);
    }
}
