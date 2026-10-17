package y17;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hr6.a f310312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f310313b;

    public d(hr6.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f310312a = descriptor;
        this.f310313b = h.ANNUAL_INBOUND_VOLUME_BLOCK;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f310312a, ((d) obj2).f310312a);
    }

    @Override // y17.j
    public final h getType() {
        return this.f310313b;
    }

    public final int hashCode() {
        return this.f310312a.hashCode();
    }
}
