package uha;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j implements k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f280173a;

    public /* synthetic */ j(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f280173a = z;
        } else {
            j1.f(h.f280172a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f280173a == ((j) obj2).f280173a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280173a);
    }

    public j(boolean z) {
        this.f280173a = z;
    }
}
