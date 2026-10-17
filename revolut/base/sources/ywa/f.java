package ywa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f317395b = {j.c(k.PUBLICATION, new yui.d(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317396a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f317396a = list;
        } else {
            j1.f(d.f317394a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f317396a, ((f) obj2).f317396a);
    }

    public final int hashCode() {
        return this.f317396a.hashCode();
    }
}
