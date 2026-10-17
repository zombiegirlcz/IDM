package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145618c;

    public /* synthetic */ a0(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(y.f145671a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145616a = str;
        this.f145617b = str2;
        if ((i & 4) == 0) {
            this.f145618c = null;
        } else {
            this.f145618c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f145616a, a0Var.f145616a) && Intrinsics.f(this.f145617b, a0Var.f145617b) && Intrinsics.f(this.f145618c, a0Var.f145618c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f145616a.hashCode() * 31, 31, this.f145617b);
        String str = this.f145618c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
