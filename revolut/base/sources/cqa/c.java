package cqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108062a;

    public c(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f108062a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f108062a.equals(((c) obj2).f108062a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f108062a.hashCode() * 31);
    }
}
