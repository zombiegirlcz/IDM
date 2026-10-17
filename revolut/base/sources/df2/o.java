package df2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113778a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.f113778a = str;
        } else {
            j1.f(m.f113777a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f113778a, ((o) obj2).f113778a);
    }

    public final int hashCode() {
        return this.f113778a.hashCode();
    }
}
