package fui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f138215a;

    public a(dj0.d checkoutPrice) {
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        this.f138215a = checkoutPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f138215a, ((a) obj2).f138215a);
    }

    public final int hashCode() {
        return this.f138215a.hashCode();
    }
}
