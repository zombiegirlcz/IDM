package f1a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f131221a;

    public /* synthetic */ r(int i, dj0.d dVar) {
        if (1 == (i & 1)) {
            this.f131221a = dVar;
        } else {
            j1.f(p.f131220a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f131221a, ((r) obj2).f131221a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f131221a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public r(dj0.d dVar) {
        this.f131221a = dVar;
    }
}
