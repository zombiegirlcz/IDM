package kdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182917a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.f182917a = str;
        } else {
            j1.f(m.f182916a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f182917a, ((o) obj2).f182917a);
    }

    public final int hashCode() {
        return this.f182917a.hashCode();
    }
}
