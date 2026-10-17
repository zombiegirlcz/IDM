package e0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgf.h f121581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121582b;

    public a0(bgf.h transactionWorkflow, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f121581a = transactionWorkflow;
        this.f121582b = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f121581a, a0Var.f121581a) && Intrinsics.f(this.f121582b, a0Var.f121582b);
    }

    public final int hashCode() {
        return this.f121582b.hashCode() + (this.f121581a.hashCode() * 31);
    }
}
