package j19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q1 implements c {

    @NotNull
    public static final m1 Companion = new m1();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f170238c;

    public /* synthetic */ q1(int i, String str, List list, p1 p1Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(e1.f170194a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170236a = str;
        this.f170237b = list;
        if ((i & 4) == 0) {
            this.f170238c = null;
        } else {
            this.f170238c = p1Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f170236a, q1Var.f170236a) && Intrinsics.f(this.f170237b, q1Var.f170237b) && Intrinsics.f(this.f170238c, q1Var.f170238c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f170236a.hashCode() * 31, 31, this.f170237b);
        p1 p1Var = this.f170238c;
        return iD + (p1Var == null ? 0 : p1Var.hashCode());
    }
}
