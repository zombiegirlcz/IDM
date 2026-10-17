package w26;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class o {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f293967a;

    public /* synthetic */ o(int i, n nVar) {
        if (1 == (i & 1)) {
            this.f293967a = nVar;
        } else {
            j1.f(a.f293950a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f293967a, ((o) obj2).f293967a);
    }

    public final int hashCode() {
        n nVar = this.f293967a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }
}
