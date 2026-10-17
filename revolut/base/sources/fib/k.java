package fib;

import fed.a0;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f135373b = {yhm.j.c(yhm.k.PUBLICATION, new a0(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f135374a;

    public /* synthetic */ k(int i, j jVar) {
        if (1 == (i & 1)) {
            this.f135374a = jVar;
        } else {
            j1.f(g.f135372a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f135374a == ((k) obj2).f135374a;
    }

    public final int hashCode() {
        return this.f135374a.hashCode();
    }
}
