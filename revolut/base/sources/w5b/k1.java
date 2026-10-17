package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f294897c;

    public /* synthetic */ k1(int i, String str, String str2, h1 h1Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(i1.f294873a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294895a = str;
        this.f294896b = str2;
        this.f294897c = h1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f294895a, k1Var.f294895a) && Intrinsics.f(this.f294896b, k1Var.f294896b) && Intrinsics.f(this.f294897c, k1Var.f294897c);
    }

    public final int hashCode() {
        return this.f294897c.hashCode() + p.a.c(this.f294895a.hashCode() * 31, 31, this.f294896b);
    }
}
