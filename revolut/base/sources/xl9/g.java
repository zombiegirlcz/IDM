package xl9;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f306960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f306961b;

    public g(BigDecimal bigDecimal, boolean z) {
        this.f306960a = bigDecimal;
        this.f306961b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f306960a, gVar.f306960a) && this.f306961b == gVar.f306961b;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f306960a;
        return Boolean.hashCode(this.f306961b) + ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31);
    }
}
