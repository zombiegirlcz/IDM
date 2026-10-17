package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260775c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new s77.x(9)), yhm.j.c(kVar, new s77.x(10))};
    }

    public /* synthetic */ o0(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            qlm.j1.f(m0.f260761a.getDescriptor(), i, 7);
            throw null;
        }
        this.f260773a = str;
        this.f260774b = list;
        this.f260775c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f260773a, o0Var.f260773a) && Intrinsics.f(this.f260774b, o0Var.f260774b) && Intrinsics.f(this.f260775c, o0Var.f260775c);
    }

    public final int hashCode() {
        return this.f260775c.hashCode() + p.a.d(this.f260773a.hashCode() * 31, 31, this.f260774b);
    }
}
