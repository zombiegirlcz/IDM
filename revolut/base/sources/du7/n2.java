package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117783c = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117785b;

    public n2(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(l2.f117742a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117784a = str;
        if ((i & 2) == 0) {
            this.f117785b = zhm.f0.f322471a;
        } else {
            this.f117785b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f117784a, n2Var.f117784a) && Intrinsics.f(this.f117785b, n2Var.f117785b);
    }

    public final int hashCode() {
        String str = this.f117784a;
        return this.f117785b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
