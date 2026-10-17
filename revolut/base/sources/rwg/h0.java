package rwg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f257923c = {null, yhm.j.c(yhm.k.PUBLICATION, new e0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257925b;

    public /* synthetic */ h0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(f0.f257921a.getDescriptor(), i, 3);
            throw null;
        }
        this.f257924a = str;
        this.f257925b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f257924a, h0Var.f257924a) && Intrinsics.f(this.f257925b, h0Var.f257925b);
    }

    public final int hashCode() {
        return this.f257925b.hashCode() + (this.f257924a.hashCode() * 31);
    }
}
