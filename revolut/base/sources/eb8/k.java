package eb8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f124306c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f124307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f124308b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f124306c = new Lazy[]{yhm.j.c(kVar, new e18.i(27)), yhm.j.c(kVar, new e18.i(28))};
    }

    public /* synthetic */ k(int i, j jVar, i iVar) {
        if (3 != (i & 3)) {
            j1.f(g.f124305a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124307a = jVar;
        this.f124308b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f124307a == kVar.f124307a && this.f124308b == kVar.f124308b;
    }

    public final int hashCode() {
        return this.f124308b.hashCode() + (this.f124307a.hashCode() * 31);
    }

    public k(j state, i permissionUpdate) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(permissionUpdate, "permissionUpdate");
        this.f124307a = state;
        this.f124308b = permissionUpdate;
    }
}
