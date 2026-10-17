package l6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192398b;

    public i(String transactionId, String paymentToken) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        this.f192397a = transactionId;
        this.f192398b = paymentToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f192397a, iVar.f192397a) && Intrinsics.f(this.f192398b, iVar.f192398b);
    }

    public final int hashCode() {
        return this.f192398b.hashCode() + (this.f192397a.hashCode() * 31);
    }
}
