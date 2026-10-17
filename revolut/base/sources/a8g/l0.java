package a8g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f2230c = {null, yhm.j.c(yhm.k.PUBLICATION, new a32.g(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2232b;

    public /* synthetic */ l0(int i, int i2, List list) {
        if (1 != (i & 1)) {
            j1.f(j0.f2226a.getDescriptor(), i, 1);
            throw null;
        }
        this.f2231a = i2;
        if ((i & 2) == 0) {
            this.f2232b = null;
        } else {
            this.f2232b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f2231a == l0Var.f2231a && Intrinsics.f(this.f2232b, l0Var.f2232b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f2231a) * 31;
        List list = this.f2232b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public l0(int i, ArrayList arrayList) {
        this.f2231a = i;
        this.f2232b = arrayList;
    }
}
