package fkd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new fk8.a(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135777c;
    public final List d;
    public final q0 e;

    public /* synthetic */ n0(int i, String str, String str2, boolean z, List list, q0 q0Var) {
        if (31 != (i & 31)) {
            j1.f(l0.f135773a.getDescriptor(), i, 31);
            throw null;
        }
        this.f135775a = str;
        this.f135776b = str2;
        this.f135777c = z;
        this.d = list;
        this.e = q0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f135775a, n0Var.f135775a) && Intrinsics.f(this.f135776b, n0Var.f135776b) && this.f135777c == n0Var.f135777c && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(j6.a.c(p.a.c(this.f135775a.hashCode() * 31, 31, this.f135776b), 31, this.f135777c), 31, this.d);
    }
}
