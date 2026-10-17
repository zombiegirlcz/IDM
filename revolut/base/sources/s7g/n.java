package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7g.i f260765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7g.i f260766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f260767c;
    public final int d;
    public final List e;

    public /* synthetic */ n(int i, t7g.i iVar, t7g.i iVar2, int i2, int i3, List list) {
        if (31 != (i & 31)) {
            qlm.j1.f(l.f260756a.getDescriptor(), i, 31);
            throw null;
        }
        this.f260765a = iVar;
        this.f260766b = iVar2;
        this.f260767c = i2;
        this.d = i3;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f260765a, nVar.f260765a) && Intrinsics.f(this.f260766b, nVar.f260766b) && this.f260767c == nVar.f260767c && this.d == nVar.d && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f260767c, (this.f260766b.hashCode() + (this.f260765a.hashCode() * 31)) * 31, 31), 31);
    }
}
