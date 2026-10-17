package u37;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.j f276795a;

    public h(ds6.j taxType) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f276795a = taxType;
    }

    @Override // u37.j
    public final ds6.j e() {
        return this.f276795a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f276795a == ((h) obj2).f276795a;
    }

    public final int hashCode() {
        return this.f276795a.hashCode();
    }
}
