package wte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299935a;

    public e(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f299935a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f299935a, ((e) obj2).f299935a);
    }

    public final int hashCode() {
        return this.f299935a.hashCode();
    }
}
