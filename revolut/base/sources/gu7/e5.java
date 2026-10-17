package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e5 {

    @NotNull
    public static final d5 Companion = new d5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146741c;
    public final q5 d;

    public /* synthetic */ e5(int i, String str, String str2, String str3, q5 q5Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(c5.f146726a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146739a = str;
        this.f146740b = str2;
        this.f146741c = str3;
        this.d = q5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return Intrinsics.f(this.f146739a, e5Var.f146739a) && Intrinsics.f(this.f146740b, e5Var.f146740b) && Intrinsics.f(this.f146741c, e5Var.f146741c) && Intrinsics.f(this.d, e5Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f146739a.hashCode() * 31, 31, this.f146740b), 31, this.f146741c);
        q5 q5Var = this.d;
        return iC + (q5Var == null ? 0 : q5Var.hashCode());
    }
}
