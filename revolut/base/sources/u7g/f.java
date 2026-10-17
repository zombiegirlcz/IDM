package u7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import u6h.h;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f277753b = {j.c(k.PUBLICATION, new h(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277754a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f277754a = list;
        } else {
            j1.f(d.f277752a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f277754a, ((f) obj2).f277754a);
    }

    public final int hashCode() {
        return this.f277754a.hashCode();
    }
}
