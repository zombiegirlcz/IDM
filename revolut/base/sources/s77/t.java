package s77;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f260564b = {yhm.j.c(yhm.k.PUBLICATION, new s1g.a(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260565a;

    public /* synthetic */ t(int i, List list) {
        if (1 == (i & 1)) {
            this.f260565a = list;
        } else {
            j1.f(r.f260563a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f260565a, ((t) obj2).f260565a);
    }

    public final int hashCode() {
        return this.f260565a.hashCode();
    }
}
