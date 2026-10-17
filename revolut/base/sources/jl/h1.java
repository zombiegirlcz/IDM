package jl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f175540c;

    public /* synthetic */ h1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(f1.f175534a.getDescriptor(), i, 7);
            throw null;
        }
        this.f175538a = str;
        this.f175539b = str2;
        this.f175540c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f175538a, h1Var.f175538a) && Intrinsics.f(this.f175539b, h1Var.f175539b) && Intrinsics.f(this.f175540c, h1Var.f175540c);
    }

    public final int hashCode() {
        return this.f175540c.hashCode() + p.a.c(this.f175538a.hashCode() * 31, 31, this.f175539b);
    }

    public final String toString() {
        return v0.a.i(v0.a.m("RetryTexts(title=", this.f175538a, ", description=", this.f175539b, ", buttonText="), this.f175540c, ")");
    }
}
