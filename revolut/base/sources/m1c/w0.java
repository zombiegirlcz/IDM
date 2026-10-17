package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201469a;

    public w0(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f201469a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f201469a, ((w0) obj2).f201469a);
    }

    public final int hashCode() {
        return this.f201469a.hashCode();
    }
}
