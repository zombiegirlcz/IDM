package ekd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class z implements q0 {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f127029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f127030b;

    public /* synthetic */ z(int i, q qVar, n nVar) {
        if (3 != (i & 3)) {
            j1.f(j.f127007a.getDescriptor(), i, 3);
            throw null;
        }
        this.f127029a = qVar;
        this.f127030b = nVar;
    }

    @Override // ekd.q0
    public final p0 H() {
        return this.f127029a;
    }

    public final q a() {
        return this.f127029a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f127029a, zVar.f127029a) && Intrinsics.f(this.f127030b, zVar.f127030b);
    }

    public final int hashCode() {
        return this.f127030b.hashCode() + (this.f127029a.hashCode() * 31);
    }
}
