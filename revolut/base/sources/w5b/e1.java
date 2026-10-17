package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294821c;
    public final m0 d;

    public /* synthetic */ e1(int i, String str, String str2, List list, m0 m0Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(c1.f294793a.getDescriptor(), i, 15);
            throw null;
        }
        this.f294819a = str;
        this.f294820b = str2;
        this.f294821c = list;
        this.d = m0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f294819a, e1Var.f294819a) && Intrinsics.f(this.f294820b, e1Var.f294820b) && Intrinsics.f(this.f294821c, e1Var.f294821c) && Intrinsics.f(this.d, e1Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f294819a.hashCode() * 31, 31, this.f294820b), 31, this.f294821c);
        m0 m0Var = this.d;
        return iD + (m0Var == null ? 0 : m0Var.hashCode());
    }
}
