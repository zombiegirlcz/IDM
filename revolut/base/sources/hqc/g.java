package hqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154664a;

    public /* synthetic */ g(int i, String str) {
        if (1 == (i & 1)) {
            this.f154664a = str;
        } else {
            j1.f(e.f154663a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f154664a, ((g) obj2).f154664a);
    }

    public final int hashCode() {
        return this.f154664a.hashCode();
    }
}
