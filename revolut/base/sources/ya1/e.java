package ya1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311892b;

    public e(String orderId, String walletId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f311891a = orderId;
        this.f311892b = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f311891a, eVar.f311891a) && Intrinsics.f(this.f311892b, eVar.f311892b);
    }

    public final int hashCode() {
        return this.f311892b.hashCode() + (this.f311891a.hashCode() * 31);
    }
}
