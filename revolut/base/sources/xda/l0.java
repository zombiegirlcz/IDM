package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new z(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304347c;
    public final List d;
    public final i0 e;

    public /* synthetic */ l0(int i, String str, String str2, String str3, List list, i0 i0Var) {
        if (31 != (i & 31)) {
            j1.f(j0.f304335a.getDescriptor(), i, 31);
            throw null;
        }
        this.f304345a = str;
        this.f304346b = str2;
        this.f304347c = str3;
        this.d = list;
        this.e = i0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f304345a, l0Var.f304345a) && Intrinsics.f(this.f304346b, l0Var.f304346b) && Intrinsics.f(this.f304347c, l0Var.f304347c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f304345a.hashCode() * 31, 31, this.f304346b), 31, this.f304347c);
        List list = this.d;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        i0 i0Var = this.e;
        return iHashCode + (i0Var != null ? i0Var.hashCode() : 0);
    }
}
