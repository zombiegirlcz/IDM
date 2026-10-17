package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class w0 implements l1 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173718c;
    public final String d;

    public /* synthetic */ w0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(u0.f173714a.getDescriptor(), i, 15);
            throw null;
        }
        this.f173716a = str;
        this.f173717b = str2;
        this.f173718c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f173716a, w0Var.f173716a) && Intrinsics.f(this.f173717b, w0Var.f173717b) && Intrinsics.f(this.f173718c, w0Var.f173718c) && Intrinsics.f(this.d, w0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173716a.hashCode() * 31, 31, this.f173717b);
        String str = this.f173718c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
