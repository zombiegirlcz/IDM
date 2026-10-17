package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cs6.e f162827c;
    public final cs6.g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String id10, cs6.e paymentMethod, cs6.g target) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f162826b = id10;
        this.f162827c = paymentMethod;
        this.d = target;
    }

    @Override // ind.x
    public final String a() {
        return this.f162826b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f162826b, tVar.f162826b) && this.f162827c == tVar.f162827c && this.d == tVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f162827c.hashCode() + (this.f162826b.hashCode() * 31)) * 31);
    }
}
