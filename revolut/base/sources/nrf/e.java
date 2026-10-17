package nrf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f218634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f218635c;

    public e(dj0.d total, f fee2, h tax) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(tax, "tax");
        this.f218633a = total;
        this.f218634b = fee2;
        this.f218635c = tax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f218633a, eVar.f218633a) && Intrinsics.f(this.f218634b, eVar.f218634b) && Intrinsics.f(this.f218635c, eVar.f218635c);
    }

    public final int hashCode() {
        return this.f218635c.hashCode() + ((this.f218634b.hashCode() + (this.f218633a.hashCode() * 31)) * 31);
    }
}
