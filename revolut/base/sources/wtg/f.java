package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f299949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f299950b;

    public /* synthetic */ f(int i, boolean z, c cVar) {
        if (3 != (i & 3)) {
            j1.f(d.f299947a.getDescriptor(), i, 3);
            throw null;
        }
        this.f299949a = z;
        this.f299950b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f299949a == fVar.f299949a && Intrinsics.f(this.f299950b, fVar.f299950b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f299949a) * 31;
        c cVar = this.f299950b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
