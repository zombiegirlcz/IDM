package vj5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289653a;

    public e(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f289653a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f289653a, ((e) obj2).f289653a);
    }

    public final int hashCode() {
        return this.f289653a.hashCode();
    }
}
