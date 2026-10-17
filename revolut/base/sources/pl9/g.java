package pl9;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f237294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f237296c;
    public final BigDecimal d;

    public /* synthetic */ g(int i, boolean z, boolean z3, boolean z4, BigDecimal bigDecimal) {
        if (15 != (i & 15)) {
            j1.f(e.f237293a.getDescriptor(), i, 15);
            throw null;
        }
        this.f237294a = z;
        this.f237295b = z3;
        this.f237296c = z4;
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
        return this.f237294a == gVar.f237294a && this.f237295b == gVar.f237295b && this.f237296c == gVar.f237296c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f237294a) * 31, 31, this.f237295b), 31, this.f237296c);
        BigDecimal bigDecimal = this.d;
        return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public g(BigDecimal bigDecimal, boolean z, boolean z3, boolean z4) {
        this.f237294a = z;
        this.f237295b = z3;
        this.f237296c = z4;
        this.d = bigDecimal;
    }
}
