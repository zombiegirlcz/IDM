package txf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f275409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f275410b;

    public o(List products, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f275409a = currency;
        this.f275410b = products;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f275409a, oVar.f275409a) && Intrinsics.f(this.f275410b, oVar.f275410b);
    }

    public final int hashCode() {
        return this.f275410b.hashCode() + j6.a.b(10, this.f275409a.hashCode() * 31, 31);
    }
}
