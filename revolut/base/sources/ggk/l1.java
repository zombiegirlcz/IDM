package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f143746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143747c;
    public final n1 d;

    public l1(String text, m1 m1Var, String str, n1 n1Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f143745a = text;
        this.f143746b = m1Var;
        this.f143747c = str;
        this.d = n1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f143745a, l1Var.f143745a) && this.f143746b == l1Var.f143746b && Intrinsics.f(this.f143747c, l1Var.f143747c) && Intrinsics.f(this.d, l1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f143745a.hashCode() * 31;
        m1 m1Var = this.f143746b;
        int iHashCode2 = (iHashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        String str = this.f143747c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        n1 n1Var = this.d;
        return iHashCode3 + (n1Var != null ? n1Var.hashCode() : 0);
    }
}
