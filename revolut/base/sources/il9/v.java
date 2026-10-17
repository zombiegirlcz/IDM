package il9;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f162201b = {yhm.j.c(yhm.k.PUBLICATION, new p(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162202a;

    public /* synthetic */ v(int i, List list) {
        if (1 == (i & 1)) {
            this.f162202a = list;
        } else {
            j1.f(t.f162200a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f162202a, ((v) obj2).f162202a);
    }

    public final int hashCode() {
        return this.f162202a.hashCode();
    }
}
