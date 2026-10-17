package jzh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f179861a;

    public v(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f179861a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f179861a, ((v) obj2).f179861a);
    }

    public final int hashCode() {
        return this.f179861a.hashCode();
    }
}
