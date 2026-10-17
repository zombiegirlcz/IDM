package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e6 {

    @NotNull
    public static final d6 Companion = new d6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f153079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153080c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ e6(int i, dj0.d dVar, String str, String str2, boolean z, boolean z3) {
        if (31 != (i & 31)) {
            qlm.j1.f(c6.f153048a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153078a = str;
        this.f153079b = dVar;
        this.f153080c = str2;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj2;
        return Intrinsics.f(this.f153078a, e6Var.f153078a) && Intrinsics.f(this.f153079b, e6Var.f153079b) && Intrinsics.f(this.f153080c, e6Var.f153080c) && this.d == e6Var.d && this.e == e6Var.e;
    }

    public final int hashCode() {
        int iC = ip0.v7.c(this.f153078a.hashCode() * 31, 31, this.f153079b);
        String str = this.f153080c;
        return Boolean.hashCode(this.e) + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
