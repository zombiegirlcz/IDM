package wvj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f300534c = {null, yhm.j.c(yhm.k.PUBLICATION, new wq1.a(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f300535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300536b;

    public /* synthetic */ p(long j2, int i, List list) {
        if (3 != (i & 3)) {
            j1.f(n.f300533a.getDescriptor(), i, 3);
            throw null;
        }
        this.f300535a = j2;
        this.f300536b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f300535a == pVar.f300535a && Intrinsics.f(this.f300536b, pVar.f300536b);
    }

    public final int hashCode() {
        return this.f300536b.hashCode() + (Long.hashCode(this.f300535a) * 31);
    }
}
