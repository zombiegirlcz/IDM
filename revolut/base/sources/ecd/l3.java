package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l3 {

    @NotNull
    public static final k3 Companion = new k3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f124610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124611c;
    public final double d;
    public final String e;

    public l3(double d, double d5, String code, String displayName, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f124609a = code;
        this.f124610b = d;
        this.f124611c = displayName;
        this.d = d5;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj2;
        return Intrinsics.f(this.f124609a, l3Var.f124609a) && Double.compare(this.f124610b, l3Var.f124610b) == 0 && Intrinsics.f(this.f124611c, l3Var.f124611c) && Double.compare(this.d, l3Var.d) == 0 && Intrinsics.f(this.e, l3Var.e);
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(m72.b.c(this.f124609a.hashCode() * 31, this.f124610b, 31), 31, this.f124611c), this.d, 31);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ l3(int i, String str, double d, String str2, double d5, String str3) {
        if (31 != (i & 31)) {
            qlm.j1.f(j3.f124592a.getDescriptor(), i, 31);
            throw null;
        }
        this.f124609a = str;
        this.f124610b = d;
        this.f124611c = str2;
        this.d = d5;
        this.e = str3;
    }
}
