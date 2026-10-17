package f1a;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f131223b = {yhm.j.c(yhm.k.PUBLICATION, new euf.a(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131224a;

    public /* synthetic */ u(int i, List list) {
        if (1 == (i & 1)) {
            this.f131224a = list;
        } else {
            j1.f(s.f131222a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f131224a, ((u) obj2).f131224a);
    }

    public final int hashCode() {
        return this.f131224a.hashCode();
    }
}
