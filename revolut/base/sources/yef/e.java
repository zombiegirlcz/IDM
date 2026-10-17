package yef;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312916a;

    public e(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f312916a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f312916a, ((e) obj2).f312916a);
    }

    public final int hashCode() {
        return this.f312916a.hashCode();
    }
}
