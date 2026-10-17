package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f26730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26732c;

    public a9(c81 text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f26730a = text;
        this.f26731b = z;
        this.f26732c = z3;
    }

    public final a9 a(c81 text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new a9(text, z, z3);
    }

    public final c81 b() {
        return this.f26730a;
    }

    public final boolean c() {
        return this.f26732c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj2;
        return Intrinsics.f(this.f26730a, a9Var.f26730a) && this.f26731b == a9Var.f26731b && this.f26732c == a9Var.f26732c;
    }

    public int hashCode() {
        return (((this.f26730a.hashCode() * 31) + Boolean.hashCode(this.f26731b)) * 31) + Boolean.hashCode(this.f26732c);
    }

    public String toString() {
        return "ButtonState(text=" + this.f26730a + ", enabled=" + this.f26731b + ", isProgressing=" + this.f26732c + ")";
    }

    public static /* synthetic */ a9 a(a9 a9Var, c81 c81Var, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = a9Var.f26730a;
        }
        if ((i & 2) != 0) {
            z = a9Var.f26731b;
        }
        if ((i & 4) != 0) {
            z3 = a9Var.f26732c;
        }
        return a9Var.a(c81Var, z, z3);
    }

    public final boolean a() {
        return this.f26731b;
    }

    public /* synthetic */ a9(c81 c81Var, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? c81.b.f27406b : c81Var, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z3);
    }
}
