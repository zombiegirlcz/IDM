package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f162819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(dj0.d amount, String id10) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f162818b = id10;
        this.f162819c = amount;
    }

    @Override // ind.x
    public final String a() {
        return this.f162818b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f162818b, nVar.f162818b) && Intrinsics.f(this.f162819c, nVar.f162819c);
    }

    public final int hashCode() {
        return this.f162819c.hashCode() + (this.f162818b.hashCode() * 31);
    }
}
