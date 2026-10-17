package qua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249341a;

    public x(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f249341a = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f249341a, ((x) obj2).f249341a);
    }

    public final int hashCode() {
        return this.f249341a.hashCode();
    }
}
