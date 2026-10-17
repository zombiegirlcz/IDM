package aa8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f2784b = {j.c(k.PUBLICATION, new a92.d(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2785a;

    public /* synthetic */ c(int i, List list) {
        if (1 == (i & 1)) {
            this.f2785a = list;
        } else {
            j1.f(a.f2783a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f2785a, ((c) obj2).f2785a);
    }

    public final int hashCode() {
        return this.f2785a.hashCode();
    }
}
