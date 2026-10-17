package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgf.h f223346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f223347b;

    public p(bgf.h transactionWorkflow, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f223346a = transactionWorkflow;
        this.f223347b = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f223346a, pVar.f223346a) && Intrinsics.f(this.f223347b, pVar.f223347b);
    }

    public final int hashCode() {
        return this.f223347b.hashCode() + (this.f223346a.hashCode() * 31);
    }
}
