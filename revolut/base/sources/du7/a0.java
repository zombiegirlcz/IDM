package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117597c;
    public final x d;

    public /* synthetic */ a0(int i, String str, String str2, String str3, x xVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(w.f117883a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117595a = str;
        this.f117596b = str2;
        this.f117597c = str3;
        this.d = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f117595a, a0Var.f117595a) && Intrinsics.f(this.f117596b, a0Var.f117596b) && Intrinsics.f(this.f117597c, a0Var.f117597c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        String str = this.f117595a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f117596b);
        String str2 = this.f117597c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        x xVar = this.d;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }
}
