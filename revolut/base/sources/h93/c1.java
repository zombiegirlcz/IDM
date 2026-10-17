package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b93.b f150102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150103c;

    public c1(b93.b design, String cardId, String brand) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f150101a = cardId;
        this.f150102b = design;
        this.f150103c = brand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f150101a, c1Var.f150101a) && Intrinsics.f(this.f150102b, c1Var.f150102b) && Intrinsics.f(this.f150103c, c1Var.f150103c);
    }

    public final int hashCode() {
        return this.f150103c.hashCode() + ((this.f150102b.hashCode() + (this.f150101a.hashCode() * 31)) * 31);
    }
}
