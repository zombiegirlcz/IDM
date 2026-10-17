package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274347c;
    public final String d;

    public /* synthetic */ g1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(e1.f274337a.getDescriptor(), i, 15);
            throw null;
        }
        this.f274345a = str;
        this.f274346b = str2;
        this.f274347c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f274345a, g1Var.f274345a) && Intrinsics.f(this.f274346b, g1Var.f274346b) && Intrinsics.f(this.f274347c, g1Var.f274347c) && Intrinsics.f(this.d, g1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f274345a.hashCode() * 31, 31, this.f274346b), 31, this.f274347c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
