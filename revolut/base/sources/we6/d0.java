package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296634a;

    public d0(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f296634a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f296634a, ((d0) obj2).f296634a);
    }

    public final int hashCode() {
        return this.f296634a.hashCode();
    }
}
