package uka;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import ujb.v;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f280719c;

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new v(9)), yhm.j.c(kVar, new v(10))};
    }

    public /* synthetic */ f(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            j1.f(a.f280713a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280717a = str;
        this.f280718b = list;
        this.f280719c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f280717a, fVar.f280717a) && Intrinsics.f(this.f280718b, fVar.f280718b) && Intrinsics.f(this.f280719c, fVar.f280719c);
    }

    public final int hashCode() {
        return this.f280719c.hashCode() + p.a.d(this.f280717a.hashCode() * 31, 31, this.f280718b);
    }
}
