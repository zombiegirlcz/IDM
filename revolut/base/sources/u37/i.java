package u37;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.j f276796a;

    public i(ds6.j taxType) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f276796a = taxType;
    }

    @Override // u37.j
    public final ds6.j e() {
        return this.f276796a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f276796a == ((i) obj2).f276796a;
    }

    public final int hashCode() {
        return this.f276796a.hashCode();
    }
}
