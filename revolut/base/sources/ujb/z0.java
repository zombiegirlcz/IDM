package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f280603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f280604b;

    public /* synthetic */ z0(int i, e0 e0Var, y0 y0Var) {
        if (3 != (i & 3)) {
            j1.f(f0.f280558a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280603a = e0Var;
        this.f280604b = y0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f280603a, z0Var.f280603a) && Intrinsics.f(this.f280604b, z0Var.f280604b);
    }

    public final int hashCode() {
        return this.f280604b.hashCode() + (this.f280603a.hashCode() * 31);
    }

    public z0(e0 challenge, y0 config) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f280603a = challenge;
        this.f280604b = config;
    }
}
