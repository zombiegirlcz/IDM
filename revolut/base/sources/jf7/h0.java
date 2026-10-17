package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class h0 implements l1 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173677b;

    public /* synthetic */ h0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(f0.f173673a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173676a = str;
        this.f173677b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f173676a, h0Var.f173676a) && Intrinsics.f(this.f173677b, h0Var.f173677b);
    }

    public final int hashCode() {
        return this.f173677b.hashCode() + (this.f173676a.hashCode() * 31);
    }
}
