package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class e0 implements l1 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f173669c;

    public /* synthetic */ e0(double d, int i, String str, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(c0.f173661a.getDescriptor(), i, 7);
            throw null;
        }
        this.f173667a = str;
        this.f173668b = str2;
        this.f173669c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f173667a, e0Var.f173667a) && Intrinsics.f(this.f173668b, e0Var.f173668b) && Double.compare(this.f173669c, e0Var.f173669c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f173669c) + p.a.c(this.f173667a.hashCode() * 31, 31, this.f173668b);
    }
}
