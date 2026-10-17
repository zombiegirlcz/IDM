package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f312224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312226c;

    public /* synthetic */ d0(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(b0.f312220a.getDescriptor(), i, 7);
            throw null;
        }
        this.f312224a = i2;
        this.f312225b = str;
        this.f312226c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f312224a == d0Var.f312224a && Intrinsics.f(this.f312225b, d0Var.f312225b) && Intrinsics.f(this.f312226c, d0Var.f312226c);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f312224a) * 31, 31, this.f312225b);
        String str = this.f312226c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public d0(int i, String color, String str) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f312224a = i;
        this.f312225b = color;
        this.f312226c = str;
    }
}
