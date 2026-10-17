package fab;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133274a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f133274a = str;
        } else {
            j1.f(a.f133273a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f133274a, ((c) obj2).f133274a);
    }

    public final int hashCode() {
        return this.f133274a.hashCode();
    }
}
