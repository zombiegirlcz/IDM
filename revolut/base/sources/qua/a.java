package qua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249281a;

    public a(String merchantId) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        this.f249281a = merchantId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f249281a, ((a) obj2).f249281a);
    }

    public final int hashCode() {
        return this.f249281a.hashCode();
    }
}
