package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9750c;
    public final double d;
    public final int e;

    public m0(double d, double d5, int i, String id10, String label) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f9748a = id10;
        this.f9749b = label;
        this.f9750c = d;
        this.d = d5;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f9748a, m0Var.f9748a) && Intrinsics.f(this.f9749b, m0Var.f9749b) && Double.compare(this.f9750c, m0Var.f9750c) == 0 && Double.compare(this.d, m0Var.d) == 0 && this.e == m0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + m72.b.c(m72.b.c(p.a.c(this.f9748a.hashCode() * 31, 31, this.f9749b), this.f9750c, 31), this.d, 31);
    }

    public /* synthetic */ m0(int i, String str, String str2, double d, double d5, int i2) {
        if (31 != (i & 31)) {
            j1.f(k0.f9742a.getDescriptor(), i, 31);
            throw null;
        }
        this.f9748a = str;
        this.f9749b = str2;
        this.f9750c = d;
        this.d = d5;
        this.e = i2;
    }
}
