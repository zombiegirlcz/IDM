package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i4 {

    @NotNull
    public static final h4 Companion = new h4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131625c;
    public final String d;
    public final int e;

    public /* synthetic */ i4(int i, int i2, String str, String str2, String str3, String str4) {
        if (27 != (i & 27)) {
            qlm.j1.f(g4.f131604a.getDescriptor(), i, 27);
            throw null;
        }
        this.f131623a = str;
        this.f131624b = str2;
        if ((i & 4) == 0) {
            this.f131625c = null;
        } else {
            this.f131625c = str3;
        }
        this.d = str4;
        this.e = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.f131623a, i4Var.f131623a) && Intrinsics.f(this.f131624b, i4Var.f131624b) && Intrinsics.f(this.f131625c, i4Var.f131625c) && Intrinsics.f(this.d, i4Var.d) && this.e == i4Var.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131623a.hashCode() * 31, 31, this.f131624b);
        String str = this.f131625c;
        return Integer.hashCode(this.e) + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
