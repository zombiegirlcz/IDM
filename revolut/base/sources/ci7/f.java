package ci7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class f implements t {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f24405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f24406b;

    public /* synthetic */ f(int i, ej0.b bVar, Float f) {
        if (3 != (i & 3)) {
            j1.f(d.f24404a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24405a = bVar;
        this.f24406b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f24405a, fVar.f24405a) && Intrinsics.f(this.f24406b, fVar.f24406b);
    }

    public final int hashCode() {
        int iHashCode = this.f24405a.hashCode() * 31;
        Float f = this.f24406b;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public f(ej0.b basePrice, Float f) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        this.f24405a = basePrice;
        this.f24406b = f;
    }
}
