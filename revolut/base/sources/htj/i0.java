package htj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new ht1.e(8)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f155418c;

    public /* synthetic */ i0(int i, String str, List list, f0 f0Var) {
        if (7 != (i & 7)) {
            j1.f(g0.f155413a.getDescriptor(), i, 7);
            throw null;
        }
        this.f155416a = str;
        this.f155417b = list;
        this.f155418c = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f155416a, i0Var.f155416a) && Intrinsics.f(this.f155417b, i0Var.f155417b) && Intrinsics.f(this.f155418c, i0Var.f155418c);
    }

    public final int hashCode() {
        int iHashCode = this.f155416a.hashCode() * 31;
        List list = this.f155417b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        f0 f0Var = this.f155418c;
        return iHashCode2 + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public i0(String state, ArrayList arrayList, f0 f0Var) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f155416a = state;
        this.f155417b = arrayList;
        this.f155418c = f0Var;
    }
}
