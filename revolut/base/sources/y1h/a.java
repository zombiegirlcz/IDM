package y1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f310379a;

    public a(kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f310379a = cashHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f310379a, ((a) obj2).f310379a);
    }

    @Override // y1h.c
    public final String getId() {
        return this.f310379a.f183148a.e;
    }

    public final int hashCode() {
        return this.f310379a.hashCode();
    }
}
