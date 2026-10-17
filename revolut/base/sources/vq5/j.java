package vq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291325a;

    public j(String transactionGroupId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f291325a = transactionGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f291325a, ((j) obj2).f291325a);
    }

    public final int hashCode() {
        return this.f291325a.hashCode();
    }
}
