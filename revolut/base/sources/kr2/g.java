package kr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188650a;

    public g(String transactionGroupId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f188650a = transactionGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f188650a, ((g) obj2).f188650a);
    }

    public final int hashCode() {
        return this.f188650a.hashCode();
    }
}
