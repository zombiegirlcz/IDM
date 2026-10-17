package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133006a;

    public f(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f133006a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f133006a, ((f) obj2).f133006a);
    }

    public final int hashCode() {
        return this.f133006a.hashCode();
    }

    public final String toString() {
        return p.a.p("Transaction(transactionId=", this.f133006a, ")");
    }
}
