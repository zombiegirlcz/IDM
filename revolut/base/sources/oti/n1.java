package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f229669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f229670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f229671c;
    public final m1 d;
    public final String e;
    public final jo3.a f;

    public /* synthetic */ n1(int i, jo3.a aVar, m1 m1Var, jo3.a aVar2, m1 m1Var2, String str, jo3.a aVar3) {
        if (63 != (i & 63)) {
            qlm.j1.f(i1.f229647a.getDescriptor(), i, 63);
            throw null;
        }
        this.f229669a = aVar;
        this.f229670b = m1Var;
        this.f229671c = aVar2;
        this.d = m1Var2;
        this.e = str;
        this.f = aVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f229669a, n1Var.f229669a) && Intrinsics.f(this.f229670b, n1Var.f229670b) && Intrinsics.f(this.f229671c, n1Var.f229671c) && Intrinsics.f(this.d, n1Var.d) && Intrinsics.f(this.e, n1Var.e) && Intrinsics.f(this.f, n1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f229669a.hashCode() * 31;
        m1 m1Var = this.f229670b;
        int iHashCode2 = (iHashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        jo3.a aVar = this.f229671c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m1 m1Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (m1Var2 == null ? 0 : m1Var2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar2 = this.f;
        return iHashCode5 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public n1(jo3.a pricePerPassenger, m1 m1Var, jo3.a aVar, m1 m1Var2, String str, jo3.a aVar2) {
        Intrinsics.checkNotNullParameter(pricePerPassenger, "pricePerPassenger");
        this.f229669a = pricePerPassenger;
        this.f229670b = m1Var;
        this.f229671c = aVar;
        this.d = m1Var2;
        this.e = str;
        this.f = aVar2;
    }
}
