package hwe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156141a;

    public h(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f156141a = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f156141a, ((h) obj2).f156141a);
    }

    public final int hashCode() {
        return this.f156141a.hashCode();
    }
}
