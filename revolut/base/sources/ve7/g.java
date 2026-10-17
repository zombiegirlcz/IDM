package ve7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class g implements k {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288138a;

    public /* synthetic */ g(int i, String str) {
        if (1 == (i & 1)) {
            this.f288138a = str;
        } else {
            j1.f(e.f288137a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f288138a, ((g) obj2).f288138a);
    }

    public final int hashCode() {
        return this.f288138a.hashCode();
    }
}
