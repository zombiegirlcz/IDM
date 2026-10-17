package bcb;

import kotlin.jvm.internal.Intrinsics;
import pcd.g0;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f14423c;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(s vault) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        String str = vault.f234881a;
        g0 g0Var = vault.f234885h;
        String str2 = g0Var.f234859a;
        super(new dj0.d(g0Var.f234861c, kii.e.u(vault, xi0.b.Companion)), str);
        this.f14423c = vault;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f14423c, ((d) obj2).f14423c);
    }

    public final int hashCode() {
        return this.f14423c.hashCode();
    }
}
