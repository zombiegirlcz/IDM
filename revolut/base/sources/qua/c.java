package qua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249286a;

    public c(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f249286a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f249286a, ((c) obj2).f249286a);
    }

    public final int hashCode() {
        return this.f249286a.hashCode();
    }
}
