package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cue.d f121701a;

    public x0(cue.d paymentResponse) {
        Intrinsics.checkNotNullParameter(paymentResponse, "paymentResponse");
        this.f121701a = paymentResponse;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x0) && Intrinsics.f(this.f121701a, ((x0) obj2).f121701a);
    }

    public final int hashCode() {
        return this.f121701a.hashCode();
    }
}
