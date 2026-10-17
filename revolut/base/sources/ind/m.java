package ind;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f162817c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dj0.d amount, String id10, boolean z) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f162816b = id10;
        this.f162817c = amount;
        this.d = z;
    }

    @Override // ind.x
    public final String a() {
        return this.f162816b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f162816b, mVar.f162816b) && Intrinsics.f(this.f162817c, mVar.f162817c) && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.c(this.f162816b.hashCode() * 31, 31, this.f162817c);
    }
}
