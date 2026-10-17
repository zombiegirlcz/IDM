package cs9;

import kotlin.jvm.internal.Intrinsics;
import mx0.b4;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f108455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f108456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f108457c;
    public final b4 d;
    public final e e;

    public a(boolean z, boolean z3, boolean z4, b4 b4Var, e firstSmallButtonState) {
        Intrinsics.checkNotNullParameter(firstSmallButtonState, "firstSmallButtonState");
        this.f108455a = z;
        this.f108456b = z3;
        this.f108457c = z4;
        this.d = b4Var;
        this.e = firstSmallButtonState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f108455a == aVar.f108455a && this.f108456b == aVar.f108456b && this.f108457c == aVar.f108457c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f108455a) * 31, 31, this.f108456b), 31, this.f108457c);
        b4 b4Var = this.d;
        return this.e.hashCode() + ((iC + (b4Var == null ? 0 : b4Var.hashCode())) * 31);
    }
}
