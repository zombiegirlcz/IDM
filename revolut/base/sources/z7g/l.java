package z7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f319984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f319985b;

    public /* synthetic */ l(int i, jo3.a aVar, f fVar) {
        if (3 != (i & 3)) {
            j1.f(j.f319983a.getDescriptor(), i, 3);
            throw null;
        }
        this.f319984a = aVar;
        this.f319985b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f319984a, lVar.f319984a) && Intrinsics.f(this.f319985b, lVar.f319985b);
    }

    public final int hashCode() {
        return this.f319985b.hashCode() + (this.f319984a.hashCode() * 31);
    }
}
