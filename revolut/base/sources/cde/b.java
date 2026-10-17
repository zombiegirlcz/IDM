package cde;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23239a;

    public b(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f23239a = transactionId;
    }

    public final String a() {
        return this.f23239a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f23239a.equals(((b) obj2).f23239a);
    }

    public final int hashCode() {
        return this.f23239a.hashCode() * 31;
    }
}
