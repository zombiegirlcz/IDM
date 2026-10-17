package db3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112661a;

    public a(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f112661a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f112661a, ((a) obj2).f112661a);
    }

    public final int hashCode() {
        return this.f112661a.hashCode();
    }
}
