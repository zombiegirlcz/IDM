package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cue.d f121583a;

    public a1(cue.d paymentResponse) {
        Intrinsics.checkNotNullParameter(paymentResponse, "paymentResponse");
        this.f121583a = paymentResponse;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a1) && Intrinsics.f(this.f121583a, ((a1) obj2).f121583a);
    }

    public final int hashCode() {
        return this.f121583a.hashCode();
    }
}
