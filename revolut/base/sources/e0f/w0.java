package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cue.d f121697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgf.h f121698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121699c;

    public w0(cue.d paymentResponse, bgf.h transactionWorkflow, String transactionId) {
        Intrinsics.checkNotNullParameter(paymentResponse, "paymentResponse");
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f121697a = paymentResponse;
        this.f121698b = transactionWorkflow;
        this.f121699c = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f121697a, w0Var.f121697a) && Intrinsics.f(this.f121698b, w0Var.f121698b) && Intrinsics.f(this.f121699c, w0Var.f121699c);
    }

    public final int hashCode() {
        return this.f121699c.hashCode() + ((this.f121698b.hashCode() + (this.f121697a.hashCode() * 31)) * 31);
    }
}
