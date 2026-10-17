package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295081c;
    public final String d;

    public /* synthetic */ y0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(w0.f295051a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295079a = str;
        this.f295080b = str2;
        this.f295081c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f295079a, y0Var.f295079a) && Intrinsics.f(this.f295080b, y0Var.f295080b) && Intrinsics.f(this.f295081c, y0Var.f295081c) && Intrinsics.f(this.d, y0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f295079a.hashCode() * 31;
        String str = this.f295080b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f295081c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
