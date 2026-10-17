package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i1 implements m1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313270c;

    public i1(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f313268a = code;
        this.f313269b = str;
        this.f313270c = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f313268a, i1Var.f313268a) && Intrinsics.f(this.f313269b, i1Var.f313269b) && Intrinsics.f(this.f313270c, i1Var.f313270c);
    }

    public final int hashCode() {
        int iHashCode = this.f313268a.hashCode() * 31;
        String str = this.f313269b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f313270c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ i1(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qlm.j1.f(g1.f313256a.getDescriptor(), i, 1);
            throw null;
        }
        this.f313268a = str;
        if ((i & 2) == 0) {
            this.f313269b = null;
        } else {
            this.f313269b = str2;
        }
        if ((i & 4) == 0) {
            this.f313270c = null;
        } else {
            this.f313270c = str3;
        }
    }
}
