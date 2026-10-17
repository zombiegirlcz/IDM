package bu2;

import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18667a;

    public /* synthetic */ c(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f18667a = z;
        } else {
            j1.f(a.f18666a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f18667a == ((c) obj2).f18667a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18667a);
    }
}
