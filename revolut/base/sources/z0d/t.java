package z0d;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f318231b = {yhm.j.c(yhm.k.PUBLICATION, new yui.d(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f318232a;

    public /* synthetic */ t(int i, List list) {
        if (1 == (i & 1)) {
            this.f318232a = list;
        } else {
            j1.f(r.f318230a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f318232a, ((t) obj2).f318232a);
    }

    public final int hashCode() {
        return this.f318232a.hashCode();
    }
}
