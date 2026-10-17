package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ts1.h(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f274409c;
    public final String d;

    public /* synthetic */ t1(int i, String str, String str2, String str3, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(r1.f274397a.getDescriptor(), i, 7);
            throw null;
        }
        this.f274407a = str;
        this.f274408b = str2;
        this.f274409c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f274407a, t1Var.f274407a) && Intrinsics.f(this.f274408b, t1Var.f274408b) && Intrinsics.f(this.f274409c, t1Var.f274409c) && Intrinsics.f(this.d, t1Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f274407a.hashCode() * 31, 31, this.f274408b), 31, this.f274409c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
