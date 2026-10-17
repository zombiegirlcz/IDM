package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117825c = {null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117827b;

    public r0(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(k0.f117729a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117826a = str;
        if ((i & 2) == 0) {
            this.f117827b = zhm.f0.f322471a;
        } else {
            this.f117827b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f117826a, r0Var.f117826a) && Intrinsics.f(this.f117827b, r0Var.f117827b);
    }

    public final int hashCode() {
        String str = this.f117826a;
        return this.f117827b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
