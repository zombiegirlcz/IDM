package iyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f169671c = {null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f169673b;

    public /* synthetic */ j0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(h0.f169667a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169672a = str;
        this.f169673b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f169672a, j0Var.f169672a) && Intrinsics.f(this.f169673b, j0Var.f169673b);
    }

    public final int hashCode() {
        String str = this.f169672a;
        return this.f169673b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public j0(String str, ArrayList products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f169672a = str;
        this.f169673b = products;
    }
}
