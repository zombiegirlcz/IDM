package ofa;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224765a;

    public /* synthetic */ d0(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f224765a = z;
        } else {
            j1.f(b0.f224763a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && this.f224765a == ((d0) obj2).f224765a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224765a);
    }
}
