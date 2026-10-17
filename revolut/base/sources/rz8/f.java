package rz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import rwg.e0;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f258526b = {j.c(k.PUBLICATION, new e0(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258527a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f258527a = list;
        } else {
            j1.f(d.f258525a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f258527a, ((f) obj2).f258527a);
    }

    public final int hashCode() {
        return this.f258527a.hashCode();
    }
}
