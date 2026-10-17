package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f304325c = {null, yhm.j.c(yhm.k.PUBLICATION, new z(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304327b;

    public /* synthetic */ g1(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(e1.f304318a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304326a = str;
        this.f304327b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f304326a, g1Var.f304326a) && Intrinsics.f(this.f304327b, g1Var.f304327b);
    }

    public final int hashCode() {
        String str = this.f304326a;
        return this.f304327b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
