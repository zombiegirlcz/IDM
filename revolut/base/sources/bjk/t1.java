package bjk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f16073b = {yhm.j.c(yhm.k.PUBLICATION, new bi2.g(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16074a;

    public /* synthetic */ t1(int i, List list) {
        if (1 == (i & 1)) {
            this.f16074a = list;
        } else {
            qlm.j1.f(r1.f16061a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t1) && Intrinsics.f(this.f16074a, ((t1) obj2).f16074a);
    }

    public final int hashCode() {
        return this.f16074a.hashCode();
    }
}
