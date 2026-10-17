package gdl;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f143201a;

    public /* synthetic */ h(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f143201a = z;
        } else {
            j1.f(f.f143200a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f143201a == ((h) obj2).f143201a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143201a);
    }

    public h(boolean z) {
        this.f143201a = z;
    }
}
