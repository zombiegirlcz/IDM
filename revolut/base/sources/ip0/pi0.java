package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi0 f165827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165829c;

    public pi0(mi0 headerPayload, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(headerPayload, "headerPayload");
        this.f165827a = headerPayload;
        this.f165828b = z;
        this.f165829c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj2;
        return Intrinsics.f(this.f165827a, pi0Var.f165827a) && this.f165828b == pi0Var.f165828b && this.f165829c == pi0Var.f165829c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165829c) + j6.a.c(this.f165827a.hashCode() * 31, 31, this.f165828b);
    }
}
