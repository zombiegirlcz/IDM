package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class t6 {

    @NotNull
    public static final s6 Companion = new s6();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new b6(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f295025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q6 f295026c;

    public /* synthetic */ t6(int i, String str, List list, q6 q6Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(r6.f294999a.getDescriptor(), i, 3);
            throw null;
        }
        this.f295024a = str;
        this.f295025b = list;
        if ((i & 4) == 0) {
            this.f295026c = null;
        } else {
            this.f295026c = q6Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj2;
        return Intrinsics.f(this.f295024a, t6Var.f295024a) && Intrinsics.f(this.f295025b, t6Var.f295025b) && Intrinsics.f(this.f295026c, t6Var.f295026c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f295024a.hashCode() * 31, 31, this.f295025b);
        q6 q6Var = this.f295026c;
        return iD + (q6Var == null ? 0 : q6Var.hashCode());
    }

    public t6(String title, ArrayList items, q6 q6Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f295024a = title;
        this.f295025b = items;
        this.f295026c = q6Var;
    }
}
