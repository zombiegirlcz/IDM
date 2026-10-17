package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cue.d f121710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f121711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bgf.h f121712c;
    public final String d;

    public z0(cue.d paymentResponse, y0 type, bgf.h transactionWorkflow, String str) {
        Intrinsics.checkNotNullParameter(paymentResponse, "paymentResponse");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        this.f121710a = paymentResponse;
        this.f121711b = type;
        this.f121712c = transactionWorkflow;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f121710a, z0Var.f121710a) && this.f121711b == z0Var.f121711b && Intrinsics.f(this.f121712c, z0Var.f121712c) && Intrinsics.f(this.d, z0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f121712c.hashCode() + ((this.f121711b.hashCode() + (this.f121710a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
