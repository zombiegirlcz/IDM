package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class a1 {

    @NotNull
    public static final z0 Companion = new z0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new z(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f304305c;

    public /* synthetic */ a1(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            j1.f(y0.f304380a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304303a = str;
        this.f304304b = str2;
        if ((i & 4) == 0) {
            this.f304305c = null;
        } else {
            this.f304305c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f304303a, a1Var.f304303a) && Intrinsics.f(this.f304304b, a1Var.f304304b) && Intrinsics.f(this.f304305c, a1Var.f304305c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f304303a.hashCode() * 31, 31, this.f304304b);
        List list = this.f304305c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
