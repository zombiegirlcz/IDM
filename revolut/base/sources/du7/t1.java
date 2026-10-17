package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117848c = {null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117850b;

    public t1(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(j1.f117724a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117849a = str;
        if ((i & 2) == 0) {
            this.f117850b = zhm.f0.f322471a;
        } else {
            this.f117850b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f117849a, t1Var.f117849a) && Intrinsics.f(this.f117850b, t1Var.f117850b);
    }

    public final int hashCode() {
        String str = this.f117849a;
        return this.f117850b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
