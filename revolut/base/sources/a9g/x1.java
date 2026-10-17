package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2630b;

    public x1(String prompt, long j2) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f2629a = prompt;
        this.f2630b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f2629a, x1Var.f2629a) && this.f2630b == x1Var.f2630b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2630b) + (this.f2629a.hashCode() * 31);
    }
}
