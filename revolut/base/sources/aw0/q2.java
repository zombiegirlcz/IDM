package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q2 extends s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10485c;
    public final boolean d;
    public final boolean e;

    public q2(int i, Clause stringWithNumbersAnimateFrom, String str, boolean z) {
        boolean z3 = (i & 8) != 0;
        z = (i & 16) != 0 ? true : z;
        Intrinsics.checkNotNullParameter(stringWithNumbersAnimateFrom, "stringWithNumbersAnimateTo");
        Intrinsics.checkNotNullParameter(stringWithNumbersAnimateFrom, "stringWithNumbersAnimateFrom");
        this.f10483a = stringWithNumbersAnimateFrom;
        this.f10484b = stringWithNumbersAnimateFrom;
        this.f10485c = str;
        this.d = z3;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f10483a, q2Var.f10483a) && Intrinsics.f(this.f10484b, q2Var.f10484b) && Intrinsics.f(this.f10485c, q2Var.f10485c) && this.d == q2Var.d && this.e == q2Var.e;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f10483a.hashCode() * 31, 31, this.f10484b);
        String str = this.f10485c;
        return Boolean.hashCode(this.e) + j6.a.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
