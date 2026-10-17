package b6h;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f12750c = {j.c(k.PUBLICATION, new aw1.a(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12752b;

    public /* synthetic */ i(int i, List list, f fVar) {
        if (3 != (i & 3)) {
            j1.f(g.f12749a.getDescriptor(), i, 3);
            throw null;
        }
        this.f12751a = list;
        this.f12752b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f12751a, iVar.f12751a) && Intrinsics.f(this.f12752b, iVar.f12752b);
    }

    public final int hashCode() {
        return this.f12752b.hashCode() + (this.f12751a.hashCode() * 31);
    }
}
