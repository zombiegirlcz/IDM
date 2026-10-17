package ekd;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f127010b = {yhm.j.c(yhm.k.PUBLICATION, new i0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f127011a;

    public /* synthetic */ m0(int i, l0 l0Var) {
        if (1 == (i & 1)) {
            this.f127011a = l0Var;
        } else {
            j1.f(j0.f127008a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && this.f127011a == ((m0) obj2).f127011a;
    }

    public final int hashCode() {
        return this.f127011a.hashCode();
    }
}
