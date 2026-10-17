package z7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f319987c = {null, yhm.j.c(yhm.k.PUBLICATION, new z1i.a(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f319988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f319989b;

    public /* synthetic */ o(int i, List list, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(m.f319986a.getDescriptor(), i, 3);
            throw null;
        }
        this.f319988a = aVar;
        this.f319989b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f319988a, oVar.f319988a) && Intrinsics.f(this.f319989b, oVar.f319989b);
    }

    public final int hashCode() {
        return this.f319989b.hashCode() + (this.f319988a.hashCode() * 31);
    }
}
