package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z3 {

    @NotNull
    public static final y3 Companion = new y3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117925c = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117927b;

    public z3(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(x3.f117899a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117926a = str;
        if ((i & 2) == 0) {
            this.f117927b = zhm.f0.f322471a;
        } else {
            this.f117927b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f117926a, z3Var.f117926a) && Intrinsics.f(this.f117927b, z3Var.f117927b);
    }

    public final int hashCode() {
        String str = this.f117926a;
        return this.f117927b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
