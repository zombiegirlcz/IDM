package k29;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f180442b = {yhm.j.c(yhm.k.PUBLICATION, new k16.d(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180443a;

    public /* synthetic */ v(int i, List list) {
        if (1 == (i & 1)) {
            this.f180443a = list;
        } else {
            j1.f(t.f180441a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f180443a, ((v) obj2).f180443a);
    }

    public final int hashCode() {
        return this.f180443a.hashCode();
    }
}
