package nhl;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215533a;

    public /* synthetic */ k0(int i, int i2) {
        if (1 == (i & 1)) {
            this.f215533a = i2;
        } else {
            j1.f(i0.f215529a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f215533a == ((k0) obj2).f215533a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f215533a);
    }
}
