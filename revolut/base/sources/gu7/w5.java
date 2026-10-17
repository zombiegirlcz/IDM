package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w5 {

    @NotNull
    public static final s5 Companion = new s5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146859c;
    public final v5 d;

    public /* synthetic */ w5(int i, String str, String str2, String str3, v5 v5Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(r5.f146824a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146857a = str;
        this.f146858b = str2;
        this.f146859c = str3;
        this.d = v5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj2;
        return Intrinsics.f(this.f146857a, w5Var.f146857a) && Intrinsics.f(this.f146858b, w5Var.f146858b) && Intrinsics.f(this.f146859c, w5Var.f146859c) && Intrinsics.f(this.d, w5Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f146857a.hashCode() * 31, 31, this.f146858b), 31, this.f146859c);
        v5 v5Var = this.d;
        return iC + (v5Var == null ? 0 : v5Var.hashCode());
    }
}
