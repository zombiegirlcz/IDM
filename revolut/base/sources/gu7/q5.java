package gu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q5 {

    @NotNull
    public static final n5 Companion = new n5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146817c = {yhm.j.c(yhm.k.PUBLICATION, new v1(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5 f146818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146819b;

    public /* synthetic */ q5(int i, p5 p5Var, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(m5.f146797a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146818a = p5Var;
        this.f146819b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj2;
        return this.f146818a == q5Var.f146818a && Intrinsics.f(this.f146819b, q5Var.f146819b);
    }

    public final int hashCode() {
        return this.f146819b.hashCode() + (this.f146818a.hashCode() * 31);
    }
}
