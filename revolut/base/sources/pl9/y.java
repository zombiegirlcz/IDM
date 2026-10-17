package pl9;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f237313a;

    public /* synthetic */ y(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f237313a = z;
        } else {
            j1.f(w.f237312a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f237313a == ((y) obj2).f237313a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237313a);
    }

    public y(boolean z) {
        this.f237313a = z;
    }
}
