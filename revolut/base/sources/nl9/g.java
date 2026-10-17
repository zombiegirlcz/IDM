package nl9;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217104c;
    public final BigDecimal d;

    public g(BigDecimal bigDecimal, boolean z, boolean z3, boolean z4) {
        this.f217102a = z;
        this.f217103b = z3;
        this.f217104c = z4;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f217102a == gVar.f217102a && this.f217103b == gVar.f217103b && this.f217104c == gVar.f217104c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f217102a) * 31, 31, this.f217103b), 31, this.f217104c);
        BigDecimal bigDecimal = this.d;
        return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
