package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f272971a;

    public o8(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f272971a = currency;
    }

    public final xi0.b a() {
        return this.f272971a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o8) && Intrinsics.f(this.f272971a, ((o8) obj2).f272971a);
    }

    public final int hashCode() {
        return this.f272971a.hashCode();
    }
}
