package aa8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2789c;

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{j.c(kVar, new a92.d(4)), j.c(kVar, new a92.d(5)), null};
    }

    public f(int i, List list, List list2, boolean z) {
        if (5 != (i & 5)) {
            j1.f(d.f2786a.getDescriptor(), i, 5);
            throw null;
        }
        this.f2787a = list;
        if ((i & 2) == 0) {
            this.f2788b = f0.f322471a;
        } else {
            this.f2788b = list2;
        }
        this.f2789c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f2787a, fVar.f2787a) && Intrinsics.f(this.f2788b, fVar.f2788b) && this.f2789c == fVar.f2789c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2789c) + p.a.d(this.f2787a.hashCode() * 31, 31, this.f2788b);
    }

    public f(List residencies) {
        f0 taxForms = f0.f322471a;
        Intrinsics.checkNotNullParameter(residencies, "residencies");
        Intrinsics.checkNotNullParameter(taxForms, "taxForms");
        this.f2787a = residencies;
        this.f2788b = taxForms;
        this.f2789c = false;
    }
}
