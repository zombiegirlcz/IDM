package as7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f8840c = {null, yhm.j.c(yhm.k.PUBLICATION, new ar0.b(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8842b;

    public /* synthetic */ g0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(e0.f8833a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8841a = str;
        this.f8842b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f8841a, g0Var.f8841a) && Intrinsics.f(this.f8842b, g0Var.f8842b);
    }

    public final int hashCode() {
        String str = this.f8841a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f8842b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public g0(String str, ArrayList arrayList) {
        this.f8841a = str;
        this.f8842b = arrayList;
    }
}
