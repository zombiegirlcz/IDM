package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f123354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f123355b;

    public c(b transaction, b paymentRequest) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(paymentRequest, "paymentRequest");
        this.f123354a = transaction;
        this.f123355b = paymentRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f123354a, cVar.f123354a) && Intrinsics.f(this.f123355b, cVar.f123355b);
    }

    public final int hashCode() {
        return this.f123355b.hashCode() + (this.f123354a.hashCode() * 31);
    }
}
