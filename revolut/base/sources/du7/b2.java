package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b2 {

    @NotNull
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117608c = {null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117610b;

    public b2(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(z1.f117923a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117609a = str;
        if ((i & 2) == 0) {
            this.f117610b = zhm.f0.f322471a;
        } else {
            this.f117610b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f117609a, b2Var.f117609a) && Intrinsics.f(this.f117610b, b2Var.f117610b);
    }

    public final int hashCode() {
        String str = this.f117609a;
        return this.f117610b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
