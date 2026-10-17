package jf7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class a1 {

    @NotNull
    public static final z0 Companion = new z0();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new ja3.b(18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f173656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173658c;

    public /* synthetic */ a1(int i, b1 b1Var, String str, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(y0.f173726a.getDescriptor(), i, 7);
            throw null;
        }
        this.f173656a = b1Var;
        this.f173657b = str;
        this.f173658c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f173656a == a1Var.f173656a && Intrinsics.f(this.f173657b, a1Var.f173657b) && Intrinsics.f(this.f173658c, a1Var.f173658c);
    }

    public final int hashCode() {
        return this.f173658c.hashCode() + p.a.c(this.f173656a.hashCode() * 31, 31, this.f173657b);
    }
}
