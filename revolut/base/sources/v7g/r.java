package v7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7g.c f286651a;

    public /* synthetic */ r(int i, z7g.c cVar) {
        if (1 == (i & 1)) {
            this.f286651a = cVar;
        } else {
            j1.f(p.f286650a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f286651a, ((r) obj2).f286651a);
    }

    public final int hashCode() {
        return this.f286651a.hashCode();
    }
}
