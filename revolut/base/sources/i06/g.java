package i06;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f157290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157292c;
    public final i d;
    public final boolean e;

    public g() {
        this(0);
    }

    public static g a(g gVar, boolean z, List list, boolean z3, i iVar, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = gVar.f157290a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            list = gVar.f157291b;
        }
        List rates = list;
        if ((i & 4) != 0) {
            z3 = gVar.f157292c;
        }
        boolean z11 = z3;
        if ((i & 8) != 0) {
            iVar = gVar.d;
        }
        i iVar2 = iVar;
        if ((i & 16) != 0) {
            z4 = gVar.e;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(rates, "rates");
        return new g(z6, rates, z11, iVar2, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f157290a == gVar.f157290a && Intrinsics.f(this.f157291b, gVar.f157291b) && this.f157292c == gVar.f157292c && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(Boolean.hashCode(this.f157290a) * 31, 31, this.f157291b), 31, this.f157292c);
        i iVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }

    public g(boolean z, List rates, boolean z3, i iVar, boolean z4) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f157290a = z;
        this.f157291b = rates;
        this.f157292c = z3;
        this.d = iVar;
        this.e = z4;
    }

    public g(int i) {
        this(false, f0.f322471a, false, null, false);
    }
}
