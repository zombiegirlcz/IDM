package j19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t0 implements c {

    @NotNull
    public static final p0 Companion = new p0();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k19.w f170260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k19.c f170261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170262c;

    public /* synthetic */ t0(int i, k19.w wVar, k19.c cVar, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(o0.f170231a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170260a = wVar;
        this.f170261b = cVar;
        this.f170262c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f170260a, t0Var.f170260a) && Intrinsics.f(this.f170261b, t0Var.f170261b) && Intrinsics.f(this.f170262c, t0Var.f170262c);
    }

    public final int hashCode() {
        return this.f170262c.hashCode() + ((this.f170261b.hashCode() + (this.f170260a.hashCode() * 31)) * 31);
    }
}
