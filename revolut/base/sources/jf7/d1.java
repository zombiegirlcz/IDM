package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class d1 implements l1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173664c;
    public final a1 d;

    public /* synthetic */ d1(int i, String str, String str2, String str3, a1 a1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(x0.f173722a.getDescriptor(), i, 15);
            throw null;
        }
        this.f173662a = str;
        this.f173663b = str2;
        this.f173664c = str3;
        this.d = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f173662a, d1Var.f173662a) && Intrinsics.f(this.f173663b, d1Var.f173663b) && Intrinsics.f(this.f173664c, d1Var.f173664c) && Intrinsics.f(this.d, d1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f173662a.hashCode() * 31, 31, this.f173663b), 31, this.f173664c);
    }
}
