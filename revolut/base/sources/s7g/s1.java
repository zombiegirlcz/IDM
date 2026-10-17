package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(20)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f260797c;

    public s1(int i, String str, List list, a1 a1Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(q1.f260786a.getDescriptor(), i, 1);
            throw null;
        }
        this.f260795a = str;
        if ((i & 2) == 0) {
            this.f260796b = zhm.f0.f322471a;
        } else {
            this.f260796b = list;
        }
        if ((i & 4) == 0) {
            this.f260797c = null;
        } else {
            this.f260797c = a1Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f260795a, s1Var.f260795a) && Intrinsics.f(this.f260796b, s1Var.f260796b) && Intrinsics.f(this.f260797c, s1Var.f260797c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f260795a.hashCode() * 31, 31, this.f260796b);
        a1 a1Var = this.f260797c;
        return iD + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
