package iv9;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f168788b = {yhm.j.c(yhm.k.PUBLICATION, new is7.b(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168789a;

    public /* synthetic */ h(int i, List list) {
        if (1 == (i & 1)) {
            this.f168789a = list;
        } else {
            j1.f(f.f168787a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f168789a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f168789a, ((h) obj2).f168789a);
    }

    public final int hashCode() {
        return this.f168789a.hashCode();
    }
}
