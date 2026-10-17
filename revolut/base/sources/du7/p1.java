package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117804c;
    public final m1 d;

    public /* synthetic */ p1(int i, String str, String str2, String str3, m1 m1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(l1.f117741a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117802a = str;
        this.f117803b = str2;
        this.f117804c = str3;
        this.d = m1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f117802a, p1Var.f117802a) && Intrinsics.f(this.f117803b, p1Var.f117803b) && Intrinsics.f(this.f117804c, p1Var.f117804c) && Intrinsics.f(this.d, p1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f117802a.hashCode() * 31;
        String str = this.f117803b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117804c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        m1 m1Var = this.d;
        return iHashCode3 + (m1Var != null ? m1Var.hashCode() : 0);
    }
}
