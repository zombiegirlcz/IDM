package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16301c;
    public final x0 d;

    public /* synthetic */ b1(int i, String str, String str2, String str3, x0 x0Var) {
        if (15 != (i & 15)) {
            j1.f(z0.f16349a.getDescriptor(), i, 15);
            throw null;
        }
        this.f16299a = str;
        this.f16300b = str2;
        this.f16301c = str3;
        this.d = x0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f16299a, b1Var.f16299a) && Intrinsics.f(this.f16300b, b1Var.f16300b) && Intrinsics.f(this.f16301c, b1Var.f16301c) && Intrinsics.f(this.d, b1Var.d);
    }

    public final int hashCode() {
        String str = this.f16299a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f16300b);
        String str2 = this.f16301c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        x0 x0Var = this.d;
        return iHashCode + (x0Var != null ? x0Var.hashCode() : 0);
    }

    public b1(String str, String text, String str2, x0 x0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16299a = str;
        this.f16300b = text;
        this.f16301c = str2;
        this.d = x0Var;
    }
}
